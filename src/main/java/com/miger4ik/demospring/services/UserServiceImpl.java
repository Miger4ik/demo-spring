package com.miger4ik.demospring.services;

import com.miger4ik.demospring.managers.UserManager;
import com.miger4ik.demospring.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserManager userManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public User createUser(User user) {
        return userManager.save(user);
    }
}
