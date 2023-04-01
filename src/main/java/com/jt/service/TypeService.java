package com.jt.service;

import com.jt.entity.Type;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author BXO
 * @since 2023-03-26
 */
public interface TypeService extends IService<Type> {
    public List<Type> getAllType(String tname, int PageStart, int pageSize);
    public int getTypeCounts(String tname);
}
