package com.example.instagramclone.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.instagramclone.Entity.Users;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {

	@SuppressWarnings("unchecked")
	Users save(Users user);
	Users findByUserId(String userId);

	
}
