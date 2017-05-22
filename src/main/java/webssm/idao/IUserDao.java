package webssm.idao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import webssm.model.User;

import java.util.List;

/**
 * Created by jzy on 2017/5/19.
 */
@Repository
public interface IUserDao {
    User selectUserById(@Param("userId") Long userId);

    User JudgeByName(@Param("userName") String userName, @Param("password") String password);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();
}
