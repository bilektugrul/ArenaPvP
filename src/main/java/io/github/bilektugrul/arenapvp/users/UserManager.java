package io.github.bilektugrul.arenapvp.users;

import java.util.HashSet;
import java.util.Set;

public class UserManager {

    private final Set<User> userList = new HashSet<>();

    public Set<User> getUserList() {
        return userList;
    }

}
