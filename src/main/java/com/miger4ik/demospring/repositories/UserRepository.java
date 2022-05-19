package com.miger4ik.demospring.repositories;

import com.miger4ik.demospring.models.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface for Partner CRUD operations.
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
