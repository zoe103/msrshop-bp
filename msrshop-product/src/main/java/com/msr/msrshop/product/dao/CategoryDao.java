package com.msr.msrshop.product.dao;

import com.msr.msrshop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tom
 * @email tom@gmail.com
 * @date 2020-09-01 14:59:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
