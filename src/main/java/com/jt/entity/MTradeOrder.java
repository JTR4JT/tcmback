package com.jt.entity;

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
    public class MTradeOrder implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 出库入库订单ID
     */
        private Integer mTradeId;

      /**
     * 管理员
     */
      private Integer aId;

      /**
     * 药材
     */
      private Integer mId;

      /**
     * 操作数量
     */
      private Integer mTradeNumber;

      /**
     * 操作种类
     */
      private String mTradeType;

      /**
     * 处理时间
     */
      private LocalDateTime mTradeTime;


}
