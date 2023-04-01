package com.jt.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    public class Shop implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 交易订单ID
     */
        private Integer sId;

      /**
     * 交易用户
     */
      private Integer uId;

      /**
     * 交易药材
     */
      private Integer mId;

      /**
     * 交易数量
     */
      private Integer sNumber;

      /**
     * 交易价格
     */
      private BigDecimal sPrice;

      /**
     * 物流目的地
     */
      private String sAddress;

      /**
     * 交易订单时间
     */
      private LocalDateTime sTime;


}
