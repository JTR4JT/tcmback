package com.jt.mapper;

import com.jt.entity.Type;
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
 * @since 2023-03-26
 */
@Repository
@Mapper
public interface TypeMapper extends BaseMapper<Type> {
    public List<Type> getAllType(@Param("tname") String tname,@Param("pageStart")int PageStart,@Param("pageSize")int pageSize);
    public int getTypeCounts(@Param("tname") String tname);
}
