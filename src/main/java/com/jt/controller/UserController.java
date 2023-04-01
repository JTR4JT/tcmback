package com.jt.controller;


import com.jt.entity.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BXO
 * @since 2023-03-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
     private UserService userService;

    @GetMapping("/findbyid/{id}")
    public User findbyid(@PathVariable("id") Integer id)
    {
        User byId = userService.getById(id);
        return byId;
    }

    @GetMapping("/findAll")
    public List<User> findAll()
    {
       return  userService.list();
    }



    @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUser(@PathVariable("id") Integer id)
    {
        return userService.removeById(id);
    }

    @PutMapping("/updateUser")
    public boolean updateUser(@RequestBody User user){
        return userService.updateById(user);
    }

    @PutMapping("/addUser")
    public boolean addUser(@RequestBody User user){
        return userService.save(user);
    }
}

