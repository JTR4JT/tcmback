package com.jt.mapper;

import com.jt.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author BXO
 * @since 2023-03-26
 */
@Repository
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

}
