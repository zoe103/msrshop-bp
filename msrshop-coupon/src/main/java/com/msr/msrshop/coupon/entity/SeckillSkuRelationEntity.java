package com.msr.msrshop.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动商品关联
 * 
 * @author tom
 * @email tom@gmail.com
 * @date 2020-09-01 15:38:09
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long promotionId;
	/**
	 * $column.comments
	 */
	private Long promotionSessionId;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private BigDecimal seckillPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal seckillCount;
	/**
	 * $column.comments
	 */
	private BigDecimal seckillLimit;
	/**
	 * $column.comments
	 */
	private Integer seckillSort;

}
