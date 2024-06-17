package com.MakerShark.Users.Service;

import com.MakerShark.Users.Model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        this.userList.add(user);
    }

    public User fetchUser(String username) {
        for(User u:userList) {
            if(username.equals(u.getUsername())) {
                return u;
            }
        }
        return null;
    }

}
