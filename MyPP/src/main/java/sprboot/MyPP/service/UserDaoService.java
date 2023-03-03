package sprboot.MyPP.service;

import sprboot.MyPP.model.User;

import java.util.List;

public interface UserDaoService {
    public void addUser(User user);
    public void deleteUser(Integer id);
    public void updateUser(User user);
    public List<User> getUsersList();
    public User getById(Integer id);
}
