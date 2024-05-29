package com.hlh.hlhmodule4thuno.Repository;

import com.hlh.hlhmodule4thuno.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
