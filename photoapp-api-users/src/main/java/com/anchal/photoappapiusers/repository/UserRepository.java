package com.anchal.photoappapiusers.repository;

import com.anchal.photoappapiusers.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
