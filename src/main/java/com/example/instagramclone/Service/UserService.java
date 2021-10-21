package com.example.instagramclone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.instagramclone.Entity.Users;
import com.example.instagramclone.Repository.UserRepo;

@Service
public class UserService {

//	@Autowired
//	UserRepo userRepo;
//	
////	logic for submiting data to data base
//	public Users submitMetaDataOfUser(Users user) {
//		return userRepo.save(user);
//	}
////	logic for retriving data of the user
//	public Users displayUserMetaData(String userid) {
//		return userRepo.findByUserId(userid);
//	}
	
	@Autowired
	UserRepo userRepo;
	
	public Users submitMetaDataOfUser(Users user) {
		return userRepo.save(user);
	}
	
	public Users displayUserMetaData(String userid) {
		return userRepo.findByUserId(userid);
	}
	

	
}
