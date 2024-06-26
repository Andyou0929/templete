package com.sky.controller.admin;

import com.sky.entity.User;
import com.sky.result.Result;
import com.sky.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@Slf4j
@Api(tags = "测试模块")
public class TestController {
    @Autowired
    private IUserService iUserService;
    @GetMapping
    @ApiOperation("测试服务是否正常")
    public Result<String> test(){
        return Result.success("server ok!!!");
    }
    @GetMapping("/list")
    @ApiOperation("测试数据库连接是否正常")
    public Result<List<User>> getList(){
        return  Result.success(iUserService.list());
    }

}
