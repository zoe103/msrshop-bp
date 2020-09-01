package com.msr.msrshop.order.dao;

import com.msr.msrshop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tom
 * @email sunlightcs@gmail.com
 * @date 2020-09-01 16:10:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
