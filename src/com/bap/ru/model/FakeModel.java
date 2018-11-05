package com.bap.ru.model;

import com.bap.ru.bean.User;

import java.util.LinkedList;
import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new LinkedList<>();
        users.add(new User("Georg", 1, 2));
        users.add(new User("Petr", 2, 1));
        users.add(new User("Ivan", 3, 2));
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long l) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long l) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
