package com.jt.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author BXO
 * @since 2023-03-17
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Cm implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "m_id", type = IdType.AUTO)
      private Integer mId;

      /**
     * 图片地址
     */
      private String mImage;

      /**
     * 中药名
     */
      private String mName;

      /**
     * 中药品类
     */
      private String mType;

      /**
     * 疗效
     */
      private String mWork;

      /**
     * 简介
     */
      private String mIntroduction;

      /**
     * 剩余量
     */
      private Integer mInventory;

      /**
     * 价格
     */
      private BigDecimal mPrice;


}
