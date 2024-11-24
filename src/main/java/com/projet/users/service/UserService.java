package com.projet.users.service;

import com.projet.users.entities.Role;
import com.projet.users.entities.User;

public interface UserService {

	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
