package com.hlh.hlhmodule4thuno.Repository;

import com.hlh.hlhmodule4thuno.Module.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
