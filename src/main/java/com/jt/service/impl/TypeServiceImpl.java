package com.jt.service.impl;

import com.jt.entity.Type;
import com.jt.mapper.TypeMapper;
import com.jt.service.TypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BXO
 * @since 2023-03-26
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

    @Autowired
    private TypeMapper typeMapper;
    @Override
    public List<Type> getAllType(String tname, int PageStart, int pageSize) {
        return typeMapper.getAllType(tname, PageStart, pageSize);
    }

    @Override
    public int getTypeCounts(String tname) {
        return typeMapper.getTypeCounts(tname);
    }
}
