package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // Retruns List with getters
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // Use void for add user in List we can found in  FAKE_USERS_RANDOM
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // Use void for delete user selected
        apiService.deleteUser(user);
    }
}
