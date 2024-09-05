package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    List<User> getUserId(String model, int series);

    List<User> getUserByCarModelAndSeries(String modelX, int i);

}
