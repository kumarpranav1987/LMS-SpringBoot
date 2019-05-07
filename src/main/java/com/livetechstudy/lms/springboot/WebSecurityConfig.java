package com.livetechstudy.lms.springboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
   @Override
   protected void configure(HttpSecurity http) throws Exception {
      http
         .authorizeRequests()
            .antMatchers("/", "/login").permitAll()
            .antMatchers("/**").hasAnyRole("USER")
            .and()
         .formLogin()
            .loginPage("/login")
            .defaultSuccessUrl("/home")
            .permitAll()
            .and()
            .logout()
            .permitAll();
   }
   
   @Autowired
   public void configure(AuthenticationManagerBuilder auth) throws Exception {
      auth
         .inMemoryAuthentication()
         .withUser("user").password("password").authorities("ROLE_USER");
   }
}