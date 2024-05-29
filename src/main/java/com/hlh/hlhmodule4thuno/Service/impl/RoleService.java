package com.hlh.hlhmodule4thuno.Service.impl;

import com.hlh.hlhmodule4thuno.Model.Role;
import com.hlh.hlhmodule4thuno.Repository.IRoleRepository;
import com.hlh.hlhmodule4thuno.Service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
}
