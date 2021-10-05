package io.getarrays.userservice.service;

import java.util.List;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;

public interface UserService {
  User saveUser(User user);

  Role saveRole(Role role);

  void addRoleToUser(String username, String rolename);

  User getUser(String username);

  List<User> getUsers();
}
