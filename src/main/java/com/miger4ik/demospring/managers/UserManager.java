package com.miger4ik.demospring.managers;

import com.miger4ik.demospring.models.User;

public interface UserManager {
    /**
     * Returns updated user.
     *
     * @param user specifies a user
     * @return updated user
     */
    User save(User user);
}
