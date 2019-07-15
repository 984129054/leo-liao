package com.lx.lx.service;

import com.lx.lx.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by leo on 2019/6/25.
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}