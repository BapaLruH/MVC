package com.bap.ru.model;

public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
    void loadUserById(long l);
    void deleteUserById(long l);
    void changeUserData(String name, long id, int level);
}
