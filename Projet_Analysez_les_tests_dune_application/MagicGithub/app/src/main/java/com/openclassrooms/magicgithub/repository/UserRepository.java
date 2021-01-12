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
        // On retourne grâce aux getters la liste des utilisateurs
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // Utilisation de la procédure afin d'ajouter un utilisateur dans la liste venant de FAKE_USERS_RANDOM
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // Utilisation de la procédure permettant la suppression de l'user sélectionné
        apiService.deleteUser(user);
    }
}
