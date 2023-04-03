package com.croky.postgres.main.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.croky.postgres.main.service.CaptchaService;
import com.croky.common.util.CaptchaUtils;

/**
 * 
 * @author Croky
 * 2019年8月5日
 */
@Service("captchaService")
public class CaptchaServiceImpl implements CaptchaService {
	private static final Logger log = LoggerFactory.getLogger(CaptchaServiceImpl.class);
	
	@CachePut(value="remote-user-mobile-captcha",key="#mobile+'-'+#bizCode")
	@Override
	public String sendMobileCaptcha(String mobile, String bizCode, int len) {
		String captcha = CaptchaUtils.getCaptcha(len, true, false, false);
		log.info("send message:" + captcha + " to mobile:" + mobile);
		return captcha;
	}

	@Cacheable(value="remote-user-mobile-captcha",key="#mobile+'-'+#bizCode", unless = "#result == null")
	@Override
	public String getMobileCaptcha(String mobile, String bizCode) {
		return null;
	}
	


	@CachePut(value="remote-user-image-captcha",key="#token+'-'+#bizCode")
	@Override
	public String createImageCaptcha(String userId,String bizCode,int len) {
		String message = CaptchaUtils.getCaptcha(len, true, true, false);
		log.info("send message:" + message + " to user:" + userId);
		return message;
	}



	@Cacheable(value="remote-user-image-captcha",key="#token+'-'+#bizCode", unless = "#result == null")
	@Override
	public String getImageCaptcha(String userId,String bizCode,int len) {
		return null;
	}
	
}
