package com.jt.controller;


import com.jt.entity.Admin;
import com.jt.service.AdminService;
import com.jt.tool.ResultType;
import com.jt.tool.RuleForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PutMapping("/adminLogin")
    public ResultType adminLogin(@RequestBody Admin admin)
    {
        ResultType adminLogin = adminService.adminLogin(admin);
        return adminLogin;

    }
    @GetMapping("/adminLogin2")
    public ResultType login(Admin admin){
//        System.out.println(ruleForm);
//        Admin admin = new Admin();
//        admin.setAAccount(ruleForm.getAAccount());
//        admin.setAPassword(ruleForm.getAPassword());
        ResultType adminLogin = adminService.adminLogin(admin);
        return adminLogin;
    }

    @GetMapping("/getAllAdmin")
    public List<Admin> getAllAdmin(){
        return adminService.list();
    }
}

