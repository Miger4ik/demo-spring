package com.miger4ik.demospring.controllers;

import com.miger4ik.demospring.config.SwaggerConfig;
import com.miger4ik.demospring.mappers.UserMapper;
import com.miger4ik.demospring.models.UserRequest;
import com.miger4ik.demospring.models.UserResponse;
import com.miger4ik.demospring.services.UserService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/admin/v1/user")
@RestController
@Api(tags = {SwaggerConfig.USER_TAG})
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    /**
     * Returns created user.
     *
     * @param userRequest specifies a data for creating a user
     * @return created user
     */
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse createUser(@RequestBody UserRequest userRequest) {
        return userMapper.toResponse(
            userService.createUser(
                userMapper.fromRequest(
                    userRequest
                )
            )
        );
    }

}
