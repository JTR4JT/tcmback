package com.jt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Doctor implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * ID
     */
        @TableId(value = "d_id", type = IdType.AUTO)
      private Integer dId;

      /**
     * 姓名
     */
      private String dName;

      /**
     * 图片
     */
      private String dImage;

      /**
     * 介绍
     */
      private String dIntroduce;

      /**
     * 排班
     */
      private LocalDateTime dTime;

      /**
     * 诊断次数
     */
      private Integer dService;

      /**
     * 联系电话
     */
      private String dPhone;


}
