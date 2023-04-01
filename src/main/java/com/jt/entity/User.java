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
 * @since 2023-03-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class User implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "u_id", type = IdType.AUTO)
      private Integer uId;

    private String uName;

    private String uAccount;

    private String uPassword;

    private String uPhoneNumber;

    private String uIdcard;

    private String uAddress;

    private String uSex;

  private Integer uAge;

}
