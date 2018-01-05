package Service;

import Entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
