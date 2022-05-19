package com.miger4ik.demospring.mappers;

import com.miger4ik.demospring.models.User;
import com.miger4ik.demospring.models.UserRequest;
import com.miger4ik.demospring.models.UserResponse;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.ERROR,
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        builder = @Builder(disableBuilder = true),
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "name", target = "name")
    User fromRequest(UserRequest userRequest);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    UserResponse toResponse(User user);
}
