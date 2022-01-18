package com.spring.aws.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "http://device.aws.demo", contextId = "deviceClient", name = "deviceClient")
public interface DeviceServiceClient extends DeviceFeignService {
}