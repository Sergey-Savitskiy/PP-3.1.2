package sprboot.MyPP.service;

import sprboot.MyPP.Repository.UserRepository;
import jakarta.transaction.Transactional;
import sprboot.MyPP.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoServiceImpl implements UserDaoService {
    public final UserRepository userRepository;
    @Autowired
    public UserDaoServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getUsersList() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Integer id) {
        return userRepository.findById(id).get();
    }
}
