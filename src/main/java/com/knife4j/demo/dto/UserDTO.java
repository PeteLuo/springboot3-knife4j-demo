package com.knife4j.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author pete
 **/
@Schema(description = "用户信息")
public class UserDTO {
    @Schema(description = "用户名")
    private String username;

    @Schema(description = "手机号")
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
