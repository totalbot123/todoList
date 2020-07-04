//package com.todolist.todolist.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.todolist.todolist.todo.dao.UserRepository;
//import com.todolist.todolist.todo.model.User;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@Autowired
//	private CustomUserDetails customUserDetails;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userRepository.findByUsername(username)
//				.orElseThrow(() -> new UsernameNotFoundException("Requested username not found!"));
//
//		return customUserDetails.setUsername(user.getUsername())
//				.setPassword(user.getPassword());
//	}
//	
//}
