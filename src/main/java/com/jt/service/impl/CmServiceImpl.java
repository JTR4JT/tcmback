package com.jt.service.impl;

import com.google.gson.Gson;
import com.jt.entity.Cm;
import com.jt.mapper.CmMapper;
import com.jt.service.CmService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jt.tool.ColorRandom;
import com.jt.vo.MedicalBar;
import com.jt.vo.MedicalBar2;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BXO
 * @since 2023-03-17
 */
@Service
public class CmServiceImpl extends ServiceImpl<CmMapper, Cm> implements CmService {
    @Autowired
    private CmMapper cmMapper;

    @Override
    public MedicalBar medicalMsg() {
        List<Cm> cms = this.cmMapper.selectList(null);
        MedicalBar medicalBar = new MedicalBar();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<MedicalBar2> values = new ArrayList<>();
        for (Cm cm:cms) {
            names.add(cm.getMName());
            MedicalBar2 medicalBar2 = new MedicalBar2();
            medicalBar2.setValue(cm.getMInventory());
            HashMap<String, String> map = new HashMap<>();
            map.put("color",new ColorRandom().getColor());
            medicalBar2.setItemStyle(map);
            values.add(medicalBar2);
        }
        medicalBar.setNames(names);
        medicalBar.setValues(values);
        return medicalBar;
    }

    @Override
    public String upload(InputStream inputStream, String fileName) {
        String result="";
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.regionNa0());
        cfg.resumableUploadAPIVersion = Configuration.ResumableUploadAPIVersion.V2;// 指定分片上传版本
//...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
//...生成上传凭证，然后准备上传
        String accessKey = "mjRMJmu742NrqT7PoPbKAFpCkYwHpmOrwOkIuhmP";
        String secretKey = "JEHyH5dfopvMmTFxou4Y-qj5TD3k2Jjh_cHnPMoS";
        String bucket = "graduate-test";
//默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = fileName;
        try {
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(inputStream,key,upToken,null, null);
                //解析上传成功的结果
                if(response.statusCode ==200){
                    result = "http://www.bxo3916.xyz/"+fileName;
                }
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception ex) {
            //ignore
        }
        return result;
    }


}