package com.lx.lx.service;

import com.lx.lx.common.api.CommonResult;
import com.lx.lx.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * 前台订单管理Service
 * Created by leo on 2019/6/10.
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);
    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}

