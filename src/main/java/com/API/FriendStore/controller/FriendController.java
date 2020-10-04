package com.API.FriendStore.controller;

import com.API.FriendStore.model.Friend;
import com.API.FriendStore.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FriendController {

    @Autowired
    FriendRepository friendRepository;

    // Get All Friends
    @GetMapping("/friends")
    public List<Friend> getAllFriends() {
        return friendRepository.findAll();
    }

    // Add a new Friend
    @PostMapping("/friends")
    public Friend addFriend(@Validated @RequestBody Friend friend) {
        return friendRepository.save(friend);
    }
}
