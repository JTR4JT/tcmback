package com.jt.controller;


import com.jt.entity.Cm;
import com.jt.service.CmService;
import com.jt.vo.MedicalBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BXO
 * @since 2023-03-17
 */
@RestController
@RequestMapping("/cm")
public class CmController {
    @Autowired
    private CmService cmService;

    @GetMapping("/findAllMedical")
    public List<Cm> findAll()
    {
        return  cmService.list();
    }

    @PutMapping("/addMedical")
    public boolean addMedical(@RequestBody Cm cm){
        return cmService.save(cm);
    }

    @DeleteMapping("/deleteMedical/{id}")
    public boolean deleteMedical(@PathVariable("id") Integer id)
    {
        return cmService.removeById(id);
    }


    @GetMapping("/findmbyid/{id}")
    public Cm findmbyid(@PathVariable("id") Integer id)
    {
        return cmService.getById(id);
    }

    @PutMapping("/updateMedical")
    public boolean updateMedical(@RequestBody Cm cm){
        return cmService.updateById(cm);
    }

    @GetMapping("/cmBar")
    public MedicalBar medicalBar()
    {

        return cmService.medicalMsg();
    }

    @RequestMapping("/upLoad")
    public String upLoad(MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        String date = DateTimeFormatter.ofPattern("yyy/MM/dd/").format(LocalDateTime.now());
        filename = date+System.currentTimeMillis()+filename.substring((filename.lastIndexOf(".")));
        String upload = cmService.upload(file.getInputStream(), filename);
        System.out.println(upload);
        return upload;
    }

}

