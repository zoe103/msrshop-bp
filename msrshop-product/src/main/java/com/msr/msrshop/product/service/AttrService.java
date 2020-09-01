package com.msr.msrshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.common.utils.PageUtils;
import com.msr.msrshop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author tom
 * @email tom@gmail.com
 * @date 2020-09-01 14:59:28
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

