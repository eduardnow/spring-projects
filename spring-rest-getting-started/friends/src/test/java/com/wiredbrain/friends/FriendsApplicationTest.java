package com.wiredbrain.friends;

import com.wiredbrain.friends.controller.FriendController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FriendsApplicationTest {

    @Autowired
    FriendController friendController;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(friendController);
    }

}