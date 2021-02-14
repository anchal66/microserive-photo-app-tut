package com.anchal.photoappapiusers.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private Environment environment;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/**")
                .hasIpAddress(environment.getProperty("gateway.ip"))
                .and().addFilter(getAuthFilter());
        //for opening H2 console
        http.headers().frameOptions().disable();
    }
    private AuthFilter getAuthFilter() throws Exception {
        AuthFilter authFilter =  new AuthFilter();
        authFilter.setAuthenticationManager(authenticationManager());
        return authFilter;
    }
}
