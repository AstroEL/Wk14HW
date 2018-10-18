package com.ltanner.mvnProjet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltanner.mvnProjet.entity.Friend;
import com.ltanner.mvnProjet.repository.FriendRepository;

@Service
public class FriendsService {
	
	@Autowired
	FriendRepository repo;
	
	public Friend getFriend(Long id) {
		return repo.findOne(id);
	}

	public Iterable<Friend> getFriends() {
		return repo.findAll();
	}
	
	public void deleteFriend(Long id) {
		repo.delete(id);
	}

	public Friend updateFriend(Long id, Friend friend) {
		Friend foundFriend = repo.findOne(id);
		if(foundFriend != null) {
			foundFriend.setFirstName(friend.getFirstName());
			foundFriend.setLastName(friend.getLastName());
			foundFriend.setPhonenumber(friend.getPhonenumber());
			repo.save(foundFriend);
		}
		return foundFriend;
	}
	
	public Friend createFriend(Friend friend) {
		return repo.save(friend);
	}
	
}
