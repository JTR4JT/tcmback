package com.jt.mapper;

import com.jt.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author BXO
 * @since 2023-03-16
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
