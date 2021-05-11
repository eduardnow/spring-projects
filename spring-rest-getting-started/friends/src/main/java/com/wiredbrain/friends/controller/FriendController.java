package com.wiredbrain.friends.controller;

import com.wiredbrain.friends.model.Friend;
import com.wiredbrain.friends.service.FriendService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController()
@RequestMapping("/friends")
public class FriendController {

    private final FriendService friendService;

    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @PostMapping
    Friend create(@Valid @RequestBody Friend friend) {
        return friendService.save(friend);
    }

    @GetMapping("/{id}")
    Friend read(@PathVariable int id) {
        return friendService.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    Friend update(@PathVariable int id, @Valid @RequestBody Friend friend) {
        if (friendService.findById(id).isPresent()) {
            friend.setId(id);
            return friendService.save(friend);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {
        friendService.deleteById(id);
    }

    @GetMapping
    Iterable<Friend> all() {
        return friendService.findAll();
    }

}
