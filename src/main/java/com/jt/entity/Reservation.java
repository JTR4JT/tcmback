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
    public class Reservation implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 预约订单ID
     */
        private Integer rId;

      /**
     * 预约用户
     */
      private Integer uId;

      /**
     * 预约医生
     */
      private Integer dId;

      /**
     * 预约时间
     */
      private LocalDateTime rTime;

      /**
     * 预约状态
     */
      private Integer rState;


}
