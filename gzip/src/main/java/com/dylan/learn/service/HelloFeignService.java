package com.dylan.learn.service;

import com.dylan.learn.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "github-client", url = "https://api.github.com", configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {
    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    ResponseEntity<byte[]> searchRepo(@RequestParam("q") String queryStr);
}
