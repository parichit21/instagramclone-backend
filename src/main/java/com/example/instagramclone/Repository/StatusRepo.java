package com.example.instagramclone.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.instagramclone.Entity.Status;

@Repository
public interface StatusRepo extends CrudRepository<Status, Integer> {

	@SuppressWarnings("unchecked")
	Status save(Status save);
	ArrayList<Status> findAll();
}
