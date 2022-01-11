package com.tonpe.user.service;

import com.tonpe.user.entity.User;
import com.tonpe.user.repo.UserRepository;
import com.tonpe.user.vo.Department;
import com.tonpe.user.vo.ResTemVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("inside saveuser of of user service");

        return userRepository.save(user);
    }

    public ResTemVo getUserWithDepartment(long userId) {
        log.info("inside getUserWithDepartment of of user service");
        ResTemVo vo = new ResTemVo();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT/departments/"+user.getDepartmentId(),Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return  vo;


    }
}
