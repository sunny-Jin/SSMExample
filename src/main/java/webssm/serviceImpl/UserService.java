package webssm.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import  webssm.idao.IUserDao;
import webssm.iService.IUserService;
import webssm.model.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jzy on 2017/5/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public  User JudgeByName(String userName,String password)
    {
        return userDao.JudgeByName(userName,password);
    }
}
