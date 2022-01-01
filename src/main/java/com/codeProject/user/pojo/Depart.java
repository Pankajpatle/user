package com.codeProject.user.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Depart {

    private Long departId;
    private String name;
    private String code;
    private String address;
}
