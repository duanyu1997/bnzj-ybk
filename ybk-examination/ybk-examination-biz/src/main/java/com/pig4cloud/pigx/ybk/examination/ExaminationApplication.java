package com.pig4cloud.pigx.ybk.examination;

import com.pig4cloud.pigx.common.feign.annotation.EnablePigxFeignClients;
import com.pig4cloud.pigx.common.security.annotation.EnablePigxResourceServer;
import com.pig4cloud.pigx.common.swagger.annotation.EnablePigxSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author pigx archetype
 * <p>
 * 项目启动类
 */
@EnablePigxSwagger2
@SpringCloudApplication
@EnablePigxFeignClients
@EnablePigxResourceServer
public class ExaminationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExaminationApplication.class, args);
    }
}
