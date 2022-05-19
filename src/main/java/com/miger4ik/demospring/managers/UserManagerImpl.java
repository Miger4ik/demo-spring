package com.miger4ik.demospring.managers;

import com.miger4ik.demospring.mappers.UserEntityMapper;
import com.miger4ik.demospring.models.User;
import com.miger4ik.demospring.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserManagerImpl implements UserManager {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    /**
     * {@inheritDoc}
     */
    @Override
    public User save(User user) {
        return userEntityMapper.fromEntity(
            userRepository.save(
                userEntityMapper.toEntity(user)
            )
        );
    }
}
