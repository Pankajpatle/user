package com.codeProject.user.service;

import com.codeProject.user.entity.User;
import com.codeProject.user.pojo.Depart;
import com.codeProject.user.pojo.ResponseUser;
import com.codeProject.user.repository.UserRepository;
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


    public User create(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return  userRepository.findByUserId(id);
    }

    public ResponseUser getUSerWithDept(Long id) {
        ResponseUser responseUser = new ResponseUser();
        User user =userRepository.findByUserId(id);
        log.info("Inside ResponseUser get user "+user);
        Depart depart = restTemplate.getForObject("http://DEPARTMENT-SERVICE/depart/get/"+user.getDepartmentId(),Depart.class);
        log.info("Inside ResponseUser get "+depart);
        responseUser.setUser(user);
        responseUser.setDepart(depart);
        return responseUser;
    }
}
