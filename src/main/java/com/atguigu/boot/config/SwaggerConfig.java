package com.atguigu.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 老贼
 * @version : 1.0
 * @Project : jucjvm
 * @Package : com.atguigu.boot.config
 * @ClassName : SwaggerConfig.java
 * @createTime : 2022/9/14 19:33
 * @Email :851185679@qq.com
 * @Description :
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${swagger2.enabled}")
    private Boolean enabled;
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(enabled)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.atguigu.boot"))
                .paths(PathSelectors.any())
                .build();

    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("SpringBoot练习版2构建api接口文档"+"\t"+new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
                .description("尚硅谷")
                .version("1.2")
                .termsOfServiceUrl("www.atxixi.com")
                .build();
    }

}
