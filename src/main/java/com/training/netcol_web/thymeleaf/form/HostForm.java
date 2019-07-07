package com.training.netcol_web.thymeleaf.form;

import lombok.Data;

@Data
public class HostForm {
    private String addr;
    private String user;
    private String password;
}