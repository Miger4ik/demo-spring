package com.miger4ik.demospring.services;

import com.miger4ik.demospring.models.User;

public interface UserService {
    /**
     * Returns created user.
     *
     * @param user specifies a user
     * @return created user
     */
    User createUser(User user);
}
