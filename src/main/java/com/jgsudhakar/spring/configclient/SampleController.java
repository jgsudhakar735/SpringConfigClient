package com.jgsudhakar.spring.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.configclient.SampleController
 * @Date : 06/10/2020
 */
@RestController
@RequestMapping("/api/sample")
@RefreshScope
public class SampleController {

    @Value("${msg: Sudhakar}")
    private String msg;

    @GetMapping("/")
    public String getMyName() {
        return "Hello JayaGovind Sudhakar" +msg;
    }
}
