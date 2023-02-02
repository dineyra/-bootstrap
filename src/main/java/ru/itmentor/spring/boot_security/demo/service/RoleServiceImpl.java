package ru.itmentor.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itmentor.spring.boot_security.demo.dao.RoleDao;
import ru.itmentor.spring.boot_security.demo.model.Role;

import java.util.Set;


@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {

        this.roleDao = roleDao;
    }

    @Override
    @Transactional(readOnly = false)
    public Set<Role> getAllRoles() {

        return roleDao.getAllRoles();
    }

    @Override
    @Transactional(readOnly = false)
    public Role getRoleByName(String name) {

        return roleDao.getRoleByName(name);
    }

    @Override
    @Transactional(readOnly = false)
    public Set<Role> getSetOfRoles(String[] roleNames) {
        return roleDao.getSetOfRoles(roleNames);
    }

    @Override
    @Transactional(readOnly = false)
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    @Transactional(readOnly = false)
    public void edit(Role role) {

        roleDao.edit(role);
    }

    @Override
    @Transactional(readOnly = false)
    public Role getById(Long id) {

        return roleDao.getById(id);
    }
}