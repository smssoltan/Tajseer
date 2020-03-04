package com.Elm.Tajseer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import javax.sql.DataSource;

    @Configuration
    @EnableWebSecurity
    @EnableGlobalMethodSecurity(prePostEnabled = true)
    public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

        @Autowired
        private DataSource dataSource; //Attempts to establish a connection with the data source that this object represents.
                                        //@return  a connection to the data source
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .authorizeRequests().anyRequest().authenticated()
                    .and()
                    .httpBasic().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        }

        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth
                    .jdbcAuthentication()
                    .dataSource(dataSource)
                    .usersByUsernameQuery("select email, password, enabled from [SpringBootDB2].[dbo].[user1] where email= ? ")
                    .authoritiesByUsernameQuery("select email,authority from [SpringBootDB2].[dbo].[user1] where email = ?")
                    .passwordEncoder(new BCryptPasswordEncoder());
        }

//        @Bean
//        @Override
//        public UserDetailsService userDetailsService() {
//            UserDetails user =
//                    User.withDefaultPasswordEncoder()
//                            .username("800@olya.com")
//                            .password("123456")
//                            .roles("USER")
//                            .build();
//
//            return new InMemoryUserDetailsManager(user);
//        }
}
