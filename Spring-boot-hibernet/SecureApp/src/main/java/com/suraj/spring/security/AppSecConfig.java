package com.suraj.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;




@Configuration
@EnableWebSecurity
//@EnableOAuth2Sso
public class AppSecConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailService;
//	@Bean
//	@Override
//protected UserDetailsService userDetailsService() {
//	List<UserDetails> users = new ArrayList<>();
//	users.add(User.withDefaultPasswordEncoder().username("srjRed").password("qwer").roles("USER").build());   //now this will be the user and password
//	return new InMemoryUserDetailsManager(users);
//}
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailService);
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); //depricated but we use for studying
		provider.setPasswordEncoder(new BCryptPasswordEncoder()); //password in db is also hashed user- abhi pass-abhi
		return provider;
	}

	/*
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests().antMatchers("/login").permitAll()
			.anyRequest().authenticated();
			//.and().httpBasic();
	}
	*/
}
