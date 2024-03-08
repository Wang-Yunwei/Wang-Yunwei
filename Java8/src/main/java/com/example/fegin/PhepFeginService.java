package com.example.wangyunwei.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author WangYunwei [2021-12-15]
 */
@Component
@FeignClient(name = "demofegin", url = "http://192.168.0.96:49152/first-aid")
public interface PhepFeginService {

    @GetMapping(name = "随机UUID", path = "/GeneralInspectionsController/v1/randomUUID")
    Object randomUUID();
}
