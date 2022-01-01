package com.codeProject.user.pojo;

import com.codeProject.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUser {

    private User user;
    private Depart depart;

}
