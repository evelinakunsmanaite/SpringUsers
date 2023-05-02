package com.bbtutorials.users.controller;

import com.bbtutorials.users.entity.Subscriptions;
import com.bbtutorials.users.entity.Users;
import com.bbtutorials.users.links.UserLinks;
import com.bbtutorials.users.service.SubscriptionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/")
public class SubscriptionsController {

    @Autowired
    SubscriptionsService subscriptionsService;

    @GetMapping("/subscriptions")
    public ResponseEntity<?> listSubscriptions() {
        log.info("SubscriptionsController:  list subscriptions");
        List<Subscriptions> resource = subscriptionsService.getSubscriptions();
        return ResponseEntity.ok(resource);
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<?> saveUser(@RequestBody Subscriptions subscription) {
        log.info("UsersController:  list users");
        Subscriptions resource = subscriptionsService.saveSubscriptions(subscription);
        return ResponseEntity.ok(resource);
    }

    @DeleteMapping("/subscriptions/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable ("id") int id) {
        log.info("UsersController:  list users");
        Subscriptions resource = subscriptionsService.deleteSubscriptions(id);
        return ResponseEntity.ok(resource);
    }

    @GetMapping("/subscriptions/{id}")
    public ResponseEntity<?> userByID(@PathVariable ("id") int id) {
        log.info("UsersController:  list users");
        Subscriptions resource = subscriptionsService.getSubscriptionsByID(id);
        return ResponseEntity.ok(resource);
    }
}
