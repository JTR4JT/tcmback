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
    public class Admin implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 管理员ID
     */
        @TableId(value = "a_id", type = IdType.AUTO)
      private Integer aId;

      /**
     * 管理员姓名
     */
      private String aName;

      /**
     * 管理员账号
     */
      private String aAccount;

      /**
     * 管理员密码
     */
      private String aPassword;


}
