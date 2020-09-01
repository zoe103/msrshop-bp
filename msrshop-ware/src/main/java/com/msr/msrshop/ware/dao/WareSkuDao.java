package com.msr.msrshop.ware.dao;

import com.msr.msrshop.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author tom
 * @email sunlightcs@gmail.com
 * @date 2020-09-01 16:18:35
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
