//package com.todolist.todolist.security;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.stereotype.Component;
//
//@Component
//public class LoginUserDetails implements CustomUserDetails {
//
//	private static final long serialVersionUID = 1L;
//	
//	private String username;
//	private String password;
//
////	@Autowired
////	private GrantedAuthorityService grantedAuthorityService;
//	@Bean
//	public GrantedAuthorityService grantedAuthorityService() {
//		return new GrantedAuthorityServiceImpl();
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//		grantedAuthorities.add(grantedAuthorityService().getGrantedAuthority("USER"));
//		return grantedAuthorities;
//	}
//
//	@Override
//	public String getPassword() {
//		return this.password;
//	}
//
//	public CustomUserDetails setPassword(String password) {
//		this.password = password;
//		return this;
//	}
//
//	@Override
//	public String getUsername() {
//		return this.username;
//	}
//
//	public CustomUserDetails setUsername(String username) {
//		this.username = username;
//		return this;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//}
