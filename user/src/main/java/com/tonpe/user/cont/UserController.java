package com.tonpe.user.cont;

import com.tonpe.user.entity.User;
import com.tonpe.user.service.UserService;
import com.tonpe.user.vo.ResTemVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user)
    {
        log.info("inside saveuser of of user controller");
        return userService.saveUser(user);

    }

    @GetMapping("/{id}")
    public ResTemVo getUserWithDepartment(@PathVariable("id") long userId)
    {
        log.info("inside getUserWithDepartment of of user controller");

        return userService.getUserWithDepartment(userId);
    }
}
