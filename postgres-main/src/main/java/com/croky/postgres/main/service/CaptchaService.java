package com.croky.postgres.main.service;


public interface CaptchaService {

	/**
	 * 发送手机验证码
	 * @param mobile
	 * @param len
	 * @return
	 */
	String sendMobileCaptcha(String mobile, String bizCode, int len);

	/**
	 * 某手机用户的某块业务的验证码信息
	 * @param bizCode
	 * @param mobile
	 * @return
	 */
	String getMobileCaptcha(String mobile, String bizCode);

	/**
	 * 用户的业务代码，userId不一定要是登陆用户，也可能是随机token
	 * @param userId
	 * @param bizCode
	 * @param len
	 * @return
	 */
	String createImageCaptcha(String userId, String bizCode, int len);

	/**
	 * 获取某个用户的验证码
	 * @param userId
	 * @param bizCode
	 * @param len
	 * @return
	 */
	String getImageCaptcha(String userId, String bizCode, int len);

}
