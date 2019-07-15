package com.lx.lx.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by leo on 2019/4/8.
 */
@Configuration
@MapperScan({"com.lx.lx.mbg.mapper","com.lx.lx.dao"})
public class MybatisConfig {

}
