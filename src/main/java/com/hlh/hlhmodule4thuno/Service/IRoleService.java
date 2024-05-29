package com.hlh.hlhmodule4thuno.Service;

import com.hlh.hlhmodule4thuno.Model.Role;

public interface IRoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findByName(String name);
}
