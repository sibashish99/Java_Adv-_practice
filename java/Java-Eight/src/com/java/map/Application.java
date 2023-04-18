package com.java.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * map() method is used to convert one object to another by applying a function.
		 * collect() method can be used to accumulate element from any stream
		 * 
		 * */
		List<User> user= new ArrayList<User>();
		user.add(new User(14,"sibashish","abcshd","siba@gmail.com"));
		user.add(new User(14,"ashish","oicdehd","ahsish@gmail.com"));
		user.add(new User(14,"debashish","ndljhhoshd","deba@gmail.com"));
		
		List<UserDTO> userDto= new ArrayList<UserDTO>();
		for(User users:user) {
			userDto.add(new UserDTO(users.getId(),users.getUsername(),users.getEmail()));
		}
		
		userDto.forEach(System.out::println);
		
		System.out.println("***************************************");
		user.stream().map(new Function<User,UserDTO>() {

			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getId(),user.getEmail(),user.getUsername());
			}
		});
		userDto.forEach(System.out::println);
		
	

	}

}
