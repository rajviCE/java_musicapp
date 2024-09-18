package com.javaproject.musicapp.security;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.javaproject.musicapp.repository.UserDao;

@Configuration
//@EnableWebSecurity
public class usersecurity //extends WebSecurityConfigurerAdapter
{

	@Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {

        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        // define query to retrieve a user by username
        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "select username, password, enabled from users where username=?");
        
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
              "select username, user_role from users where username=?");
        // define query to retrieve the authorities/roles by username
//        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
//                "select username, authority from authorities where username=?");

        return jdbcUserDetailsManager;
	}
		
	 
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
//		http.authorizeHttpRequests((authz)->authz.anyRequest()
//				.authenticated()).httpBasic();
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/User").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/api/User/**").hasRole("USER")
                        .requestMatchers(HttpMethod.POST, "/api/User").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/api/User/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/api/User/**").hasRole("USER")
        );
        
        http.authorizeHttpRequests(configurer ->
        configurer
                .requestMatchers(HttpMethod.GET, "/api/Tracks").hasAnyRole("USER")
                .requestMatchers(HttpMethod.GET, "/api/Tracks/**").hasAnyRole("USER")
                .requestMatchers(HttpMethod.POST, "/api/Tracks").hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/api/Tracks/**").hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE, "/api/Tracks/**").hasRole("ADMIN")
        		);
        http.authorizeHttpRequests(configurer ->
        configurer
                .requestMatchers(HttpMethod.GET, "/api/Genres").hasAnyRole("USER")
                .requestMatchers(HttpMethod.GET, "/api/Genres/**").hasAnyRole("USER")
                .requestMatchers(HttpMethod.POST, "/api/Genres").hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/api/Genres/**").hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE, "/api/Genres/**").hasRole("ADMIN")
        		);
        http.authorizeHttpRequests(configurer ->
        configurer
                .requestMatchers(HttpMethod.GET, "/api/Singers").hasAnyRole("USER")
                .requestMatchers(HttpMethod.GET, "/api/Singers/**").hasAnyRole("USER")
                .requestMatchers(HttpMethod.POST, "/api/Singers").hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/api/Singers/**").hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE, "/api/Singers/**").hasRole("ADMIN")
        		);
////        http.authorizeHttpRequests(configurer ->
////        configurer
////                .requestMatchers(HttpMethod.GET, "/api/User").hasRole("USER")
////                .requestMatchers(HttpMethod.GET, "/api/User/**").hasRole("USER")
////                .requestMatchers(HttpMethod.POST, "/api/User").hasRole("USER")
////                .requestMatchers(HttpMethod.PUT, "/api/User").hasRole("MANAGER")
////                .requestMatchers(HttpMethod.DELETE, "/api/User/**").hasRole("ADMIN")
////        		);

        // use HTTP Basic authentication
        http.httpBasic(Customizer.withDefaults());

        // disable Cross Site Request Forgery (CSRF)
        // in general, not required for stateless REST APIs that use POST, PUT, DELETE and/or PATCH
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
//	@Autowired
//	private UserDao userRepository;
//	@Override
//	protected void configurer(AuthenticationManagerBuilder auth) throws Exception
//	{
//		auth.userDetailsService(userDetailsService());	
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception
//	{
//		http.csrf().disable()
//		.authorizeRequests().antMatchers("/api/public").permitAll().anyRequest().authenticated().and()
//		.httpBasic();
//	}
//	
//	
//	@Override
//	@Bean
//	public UserDetailsService userDetailsService()
//	{
//		return username->userRepository.findByUsername(username);
//	}
//	
	
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	@Bean
//	AuthenticationProvider authenticationProvider()
//	{
//		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
//		
//		provider.setUserDetailsService(userDetailsService);
//		//provider.setPasswordEncoder(new BCryptPasswordEncoder());
//		return provider;
//		
//	}
	
//	@SuppressWarnings("deprecation")
//	protected void configure(HttpSecurity http) throws Exception
//	{
//		http.authorizeRequests()
//		.antMatchers("/")
//		.permitAll()
//		.antMatchers("/home")
//		.hasAuthority("USER")
//		.antMatchers("/admin")
//		.hasAuthority("ADMIN")
//		.anyRequest()
//		.authenticated()
//		.and()
//		.httpBasic();
//		
//	}
}



