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
 * @since 2023-03-26
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Healthy implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 健康档案ID
     */
        @TableId(value = "h_id", type = IdType.AUTO)
      private Integer hId;

      /**
     * 身高
     */
      private BigDecimal hHeight;

      /**
     * 体重
     */
      private BigDecimal hWeight;

      /**
     * 血压
     */
      private BigDecimal hBPress;

      /**
     * 血糖
     */
      private BigDecimal hBSugar;

      /**
     * 心率
     */
      private BigDecimal hHeartRate;

      /**
     * 用户ID
     */
      private Integer uId;


}
