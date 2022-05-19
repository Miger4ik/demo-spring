package com.miger4ik.demospring.mappers;

import com.miger4ik.demospring.models.User;
import com.miger4ik.demospring.models.UserEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper to work with a {@link UserEntity}.
 */
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.ERROR,
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        builder = @Builder(disableBuilder = true),
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserEntityMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    User fromEntity(UserEntity userEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    UserEntity toEntity(User user);
}
