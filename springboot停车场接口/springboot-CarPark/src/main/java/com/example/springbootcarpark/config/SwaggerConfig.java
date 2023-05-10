package com.example.springbootcarpark.config;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 设置多个：
     *
     * @return
     * @Bean public Docket appApi() {
     * <p>
     * List<Parameter> pars = new ArrayList<>();
     * ParameterBuilder token = new ParameterBuilder();
     * token.name("token").description("用户令牌").modelRef(new ModelRef("string")).parameterType("header").required(false)
     * .build();
     * pars.add(token.build());
     * <p>
     * return new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/app/.*")).build()
     * .globalOperationParameters(pars).apiInfo(pdaApiInfo()).useDefaultResponseMessages(false)
     * .enable(enableSwagger)
     * .groupName("appApi");
     * <p>
     * }
     * @Bean public Docket adminApi() {
     * <p>
     * List<Parameter> pars = new ArrayList<>();
     * ParameterBuilder token = new ParameterBuilder();
     * token.name("token").description("用户令牌").modelRef(new ModelRef("string")).parameterType("header").required(false)
     * .build();
     * pars.add(token.build());
     * return new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/admin/.*")).build()
     * .globalOperationParameters(pars).apiInfo(pdaApiInfo()).useDefaultResponseMessages(false)
     * .enable(enableSwagger)
     * .groupName("adminApi");
     * <p>
     * }
     */
    @Bean
    public Docket appApi() {
        List<Parameter> pars = new ArrayList<>();
        ParameterBuilder token = new ParameterBuilder();
        token.name("token").description("用户令牌").modelRef(new ModelRef("string")).parameterType("header").required(false)
                .build();
        pars.add(token.build());
        return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any()).build()
                .globalOperationParameters(pars).useDefaultResponseMessages(false)
                .groupName("appApi");
    }

    //RequestHandlerSelectors配置要扫描接口的方法
    //basePackage:指定要扫描的包
    //any()扫描全部
    //none()不扫描
    //withClassAnnotation扫描类上的注解，参数是一个注解的反射对象
    //withMethodAnnotation扫描方法上的注解
    /*Swagger在生产环境中使用，在发布的时候不使用
     *  获取环境Environment*/
    @Bean
    public Docket docket(Environment environment) {
        //设置要显示的Swagger环境
        Profiles profiles = Profiles.of("dev");//可以多个
        //判断是否处在自己设定的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.springbootswagger.controller"))
                .paths(PathSelectors.any())//过滤什么路径
                .build()
                .globalOperationParameters(setHeaderToken());

    }

    @Bean
    public Docket docket1(Environment environment) {
        //设置要显示的Swagger环境
        Profiles profiles = Profiles.of("dev");//可以多个
        //判断是否处在自己设定的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.springbootswagger.controller"))
                .paths(PathSelectors.any())//过滤什么路径
                .build()
                .globalOperationParameters(setHeaderToken())
                .groupName("appApi1");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().license("Apache").licenseUrl("www.taobao.com")
                .title("WangC-J的API文档").description("swagger实战")
                .termsOfServiceUrl("www.baidu.com")
                .version("v1.0").build();

    }

    /**
     * @param
     * @Description: 设置swagger文档中全局参数
     * @Date: 2020/9/11 10:15
     * @return: java.util.List<springfox.documentation.service.Parameter>
     */

    private List<Parameter> setHeaderToken() {
        List<Parameter> pars = new ArrayList<>();
        ParameterBuilder userId = new ParameterBuilder();
        userId.name("token").description("用户TOKEN").modelRef(new ModelRef("string")).parameterType("header")
                .required(true).build();
        pars.add(userId.build());
        return pars;
    }
}


