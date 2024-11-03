package com.knife4j.demo.controller;

import com.knife4j.demo.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pete
 **/
@Tag(name = "演示")
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Operation(summary = "查询用户信息")
    @RequestMapping(value = "/user/query", method = RequestMethod.GET)
    @ResponseBody
    public String test(UserDTO userDTO) {
        return "success";
    }
}
