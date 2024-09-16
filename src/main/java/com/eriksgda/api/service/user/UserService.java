package com.eriksgda.api.service.user;

import com.eriksgda.api.model.user.User;

import java.util.UUID;

public interface UserService {

    User findById(UUID id);

    User create(User user);
}
