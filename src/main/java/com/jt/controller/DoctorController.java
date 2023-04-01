package com.jt.controller;


import com.jt.entity.Doctor;
import com.jt.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/getAllDoctor")
    public List<Doctor> getAllDoctor(){
        return doctorService.list();
    }
}

