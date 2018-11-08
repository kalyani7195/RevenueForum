package com.ideas.RevenueManagementForum;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by idnklm on 3/6/2018.
 */
public interface RevenueForumEventRepository extends MongoRepository<RevenueForumEvent, String> {
    RevenueForumEvent findByTitle(String title);
    RevenueForumEvent findByEventId(String eventId);

}
