package com.jt.service;

import com.jt.entity.Cm;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jt.vo.MedicalBar;

import java.io.InputStream;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author BXO
 * @since 2023-03-17
 */
public interface CmService extends IService<Cm> {
    public MedicalBar medicalMsg();
    public String upload(InputStream inputStream,String fileName);
}
