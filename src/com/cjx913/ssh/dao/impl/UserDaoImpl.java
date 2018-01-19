package com.cjx913.ssh.dao.impl;

import com.cjx913.ssh.dao.UserDao;
import com.cjx913.ssh.entity.User;

import java.util.List;

public class UserDaoImpl extends CommonDaoImpl <User> implements UserDao {

    @Override
    public void saveUser(User user) {
        this.save(user);
    }

    @Override
    public void updateUser(User user) {
        this.update(user);
    }

    @Override
    public void deleteUser(User user) {
        this.delete(user);
    }

    @Override
    public User findUserById(Integer id) {
        return this.findById(id);
    }

    @Override
    public List <User> findAllUser() {
        return this.findAll();
    }
}
