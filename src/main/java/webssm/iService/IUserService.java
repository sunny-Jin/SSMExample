package webssm.iService;

import webssm.model.User;

import java.util.List;

/**
 * Created by jzy on 2017/5/19.
 */
public interface IUserService {
    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    User JudgeByName(String userName,String password);
}
