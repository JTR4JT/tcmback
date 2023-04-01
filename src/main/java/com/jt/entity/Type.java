package com.jt.entity;

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
    public class Type implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 种类ID
     */
        @TableId(value = "t_id", type = IdType.AUTO)
      private Integer tId;

      /**
     * 种类名
     */
      private String tName;


}
