package com.ltanner.mvnProjet.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltanner.mvnProjet.entity.Friend;

public interface FriendRepository extends CrudRepository<Friend, Long> {
	

}
