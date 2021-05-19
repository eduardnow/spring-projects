package com.wiredbrain.friends.controller;

import com.wiredbrain.friends.model.Friend;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FriendControllerTest {

    @Autowired
    FriendController friendController;

    @Test
    public void testCreateReadDelete() {
        Friend friend = new Friend("Gordon", "Moore");
        Friend friendResult = friendController.create(friend);

        Iterable<Friend> friends = friendController.all();
        Assertions.assertThat(friends).first().hasFieldOrPropertyWithValue("firstName", "Gordon");

        friendController.delete(friendResult.getId());
        Assertions.assertThat(friendController.all()).isEmpty();
    }

}