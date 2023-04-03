package com.croky.postgres.web.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.croky.common.lang.Result;
import com.croky.postgres.main.service.CaptchaService;
import com.croky.common.servlet.model.LoginUser;
import com.croky.common.servlet.util.RequestUtils;
import com.croky.common.servlet.util.ResponseUtils;
import com.croky.common.util.CaptchaUtils;
import com.croky.common.util.RandomUtils;
import com.croky.common.util.StringUtils;

/**
 * 
 * @author Croky
 * 2019年8月5日
 */
//不能用RestController
@Tag(name = "SecurityController", description = "安全验证相关API")
@Controller
@Configuration
@PropertySource("classpath:application.properties")
public class SecurityController {
	private final static String USER_FLAG = "uia_flag";
	//@Value("${app.register.bizCode}")
	private String bizCode = "8888";
	
	@Autowired
	private CaptchaService captchaService;

	@Operation(summary = "获取图形验证码", description = "将用户id包含在请求路径中")
	@GetMapping(value = "/captcha/{userId}")
	public void getRegisterCaptcha(@PathVariable String userId, HttpServletRequest request,HttpServletResponse response) throws IOException {
		if (StringUtils.isEmpty(userId)) {
			userId = getUserId(request);
		}
		if (null == userId) {
			userId = RandomUtils.genRandomString();
			ResponseUtils.addCookie(USER_FLAG, userId, -1);
			response.sendRedirect("/captcha/" + userId);
		} else {
			//不要有缓存
			response.addHeader("Cache-Control", "no-cache");
			response.addHeader("Pragma", "no-cache");
			response.setContentType("image/png");
			CaptchaUtils.write(captchaService.createImageCaptcha(userId, bizCode, 6), response.getOutputStream());
		}
	}
	
	@Operation(summary = "获取图形验证码", description = "将用户id包含在请求路径中")
	@Parameter(name = "userId", description = "用户Id,临时用户id", required = false)
	@GetMapping(value = "/captcha/captcha_image")
	public void getCaptchaImage(@RequestParam(required=false) String userId, HttpServletRequest request,HttpServletResponse response) throws IOException {
		if (StringUtils.isEmpty(userId)) {
			userId = getUserId(request);
		}
		if (null == userId) {
			userId = RandomUtils.genRandomString();
			ResponseUtils.addCookie(USER_FLAG, userId, -1);
			response.sendRedirect("/captcha/captcha_image?userId=" + userId);
		} else {
			//不要有缓存
			response.addHeader("Cache-Control", "no-cache");
			response.addHeader("Pragma", "no-cache");
			response.setContentType("image/png");
			CaptchaUtils.write(captchaService.createImageCaptcha(userId, bizCode, 6), response.getOutputStream());
		}
	}

	@Operation(summary = "发送手机验证码", description = "向手机号码发送验证信息，收费的，测试谨慎")
	@Parameter(name = "mobile", description = "手机号码", required = false)
	@GetMapping(value = "/captcha/sendMobileCaptcha")
	@ResponseBody public Result<String> sendMobileCaptcha(@RequestParam(defaultValue="",required = false) String mobile) throws IOException {
		if (StringUtils.isNotBlank(mobile)) {
			long mobileCode = Long.parseLong(mobile);
			if (mobileCode > 13000000000L && mobileCode < 20000000000L) {
				captchaService.sendMobileCaptcha(mobile, bizCode, 4);
				return Result.normal();
			} else {
				return Result.error("错误的手机号码");
			}
		}
		return Result.error("没有手机号码");
	}
	
	private String getUserId(HttpServletRequest request) {
		LoginUser loginUser = RequestUtils.getLoginUser();
		if (null == loginUser) {
			Cookie[] cookies = request.getCookies();
			if (null != cookies) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals(USER_FLAG)) {
						return cookie.getValue();
					}
				}
			}
		}
		return null;
	}
}
