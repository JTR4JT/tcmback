package com.jt.controller;


import com.alibaba.fastjson.JSON;
import com.jt.entity.Cm;
import com.jt.entity.QueryInfo;
import com.jt.entity.Type;
import com.jt.service.impl.TypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BXO
 * @since 2023-03-26
 */
@RestController
@RequestMapping("/type")
public class TypeController {


    @Autowired
    private TypeServiceImpl typeService;


    @GetMapping("/getAllTypeList")
    public String getAllTypeList(QueryInfo queryInfo)
    {
        int numbers = typeService.getTypeCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<Type> types = typeService.getAllType("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        System.out.println(types);

        HashMap<String,Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",types);
        String res_string = JSON.toJSONString(res);

        return res_string;
    }

    @RequestMapping("/deleteType")
    public String deleteType(int id){
        boolean i = typeService.removeById(id);
        return i == true?"success":"error";
    }

    @RequestMapping("/addType")
    public String addType(@RequestBody Type type){
        System.out.println(type);
        boolean i = typeService.save(type);
        return i == true?"success":"error";
    }

    @RequestMapping("/getUpdate")
    public Type getUpdate(int id)
    {
        return typeService.getById(id);
    }

    @PutMapping("/editType")
    public String editType(@RequestBody Type type){
        boolean i = typeService.updateById(type);
        return i == true?"success":"error";
    }
}

