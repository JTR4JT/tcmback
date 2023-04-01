package com.jt.service;

import com.jt.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jt.tool.ResultType;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author BXO
 * @since 2023-03-26
 */
public interface AdminService extends IService<Admin> {
    public ResultType adminLogin(@RequestBody Admin admin);
}
