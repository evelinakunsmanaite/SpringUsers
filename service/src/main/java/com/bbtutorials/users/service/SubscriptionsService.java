package com.bbtutorials.users.service;

import com.bbtutorials.users.entity.Subscriptions;
import com.bbtutorials.users.entity.Users;
import com.bbtutorials.users.repository.SubscriptionsRepository;
import com.bbtutorials.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionsService {

    @Autowired
    private SubscriptionsRepository subscriptionsRepository;
    @Autowired
    private UsersRepository usersRepository;

    public List<Subscriptions> getSubscriptions() {
        return subscriptionsRepository.findAll();
    }

    public Subscriptions saveSubscriptions(Subscriptions subscription) {
        usersRepository.save(subscription.getUser());
        return subscriptionsRepository.save(subscription);
    }

    public Subscriptions deleteSubscriptions(int id) {
        subscriptionsRepository.deleteById(id);
        return null;
    }

    public Subscriptions getSubscriptionsByID(int id) {
        return subscriptionsRepository.findById(id).get();
    }
}
