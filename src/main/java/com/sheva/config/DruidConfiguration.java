package com.sheva.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sheva
 * @date 2019/11/25  下午2:41
 * @Version 1.0
 */
@Configuration
public class DruidConfiguration {
    @Bean
    public ServletRegistrationBean druidStatViewServlet(){
        //注册服务
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(
                new StatViewServlet(), "/druid/*");
        //白名单（空表示所有的都可以访问，多个IP用逗号分开）
        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
        //黑名单
        servletRegistrationBean.addInitParameter("deny", "127.0.0.2");
        //设置登录的用户名和密码
        servletRegistrationBean.addInitParameter("loginUsername", "sheva");
        servletRegistrationBean.addInitParameter("loginPassword", "123456");
        //是否能够重置数据
        servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;

    }

    @Bean
    public FilterRegistrationBean druidStatFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(
                new WebStatFilter());
        //添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");
        //添加不需要忽略的格式信息
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif, " +
                "*.jpg,*.png,*.css,*.ico,/druid/*");
        System.out.println("Druid初始化成功!");
        return filterRegistrationBean;

    }
}
