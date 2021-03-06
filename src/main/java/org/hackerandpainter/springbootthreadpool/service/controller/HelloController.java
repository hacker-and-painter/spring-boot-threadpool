package org.hackerandpainter.springbootthreadpool.service.controller;

import org.hackerandpainter.springbootthreadpool.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-05-26 20:45
 **/
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/")
    public String submit(){
        logger.info("start submit");

        //调用service层的任务
        asyncService.executeAsync();

        logger.info("end submit");

        return "success";
    }
}