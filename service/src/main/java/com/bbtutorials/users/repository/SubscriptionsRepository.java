package com.bbtutorials.users.repository;

import com.bbtutorials.users.entity.Subscriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface SubscriptionsRepository extends JpaRepository<Subscriptions, Integer>{
}
