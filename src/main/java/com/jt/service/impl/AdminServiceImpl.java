package com.jt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jt.entity.Admin;
import com.jt.mapper.AdminMapper;
import com.jt.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jt.tool.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BXO
 * @since 2023-03-26
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public ResultType adminLogin(Admin admin) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("a_account", admin.getAAccount());
        Admin admin1 = this.adminMapper.selectOne(queryWrapper);
        ResultType resultType = new ResultType();
        if(admin1 == null){
            resultType.setCode(-1);
        } else {
            //2、判断密码是否正确
            if(!admin1.getAPassword().equals(admin.getAPassword())){
                resultType.setCode(-2);
            } else {
                resultType.setCode(0);
                resultType.setData(admin1);
            }
        }
        return resultType;
    }
}
