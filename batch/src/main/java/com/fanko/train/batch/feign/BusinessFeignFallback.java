package com.fanko.train.batch.feign;

import com.fanko.train.common.resp.CommonResp;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BusinessFeignFallback implements BusinessFeign{
    @Override
    public String hello() {
        return "Fallback";
    }

    //熔断降级之后的补偿措施。处理方法。
    @Override
    public CommonResp<Object> genDaily(Date date) {
        return null;
    }
}
