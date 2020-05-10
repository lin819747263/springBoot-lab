package com.linmsen.spring_security.congig;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("admin").password("admin").roles("ADMIN")
                .and().withUser("normal").password("normal").roles("NORMAL");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // <X> 配置请求地址的权限
                .authorizeRequests()
                .antMatchers("/test/echo").permitAll() // 所有用户可访问
                .antMatchers("/test/admin").hasRole("ADMIN") // 需要 ADMIN 角色
                .antMatchers("/test/normal").access("hasRole('ROLE_NORMAL')") // 需要 NORMAL 角色。
                // 任何请求，访问的用户都需要经过认证
                .anyRequest().authenticated()
                .and()
                // <Y> 设置 Form 表单登陆
                .formLogin()
//                    .loginPage("/login") // 登陆 URL 地址
                .permitAll() // 所有用户可访问
                .and()
                // 配置退出相关
                .logout()
//                    .logoutUrl("/logout") // 退出 URL 地址
                .permitAll(); // 所有用户可访问
    }
}
