package com.zxo.tmail.mapper;

import com.zxo.tmail.pojo.User;
import com.zxo.tmail.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    User selectLogin(String username, String md5Password);

    int checkEmail(String email);

    String selectQuestionByUsername(String username);

    int updatePasswordByUsername(String username, String md5Password);

    int checkPassword(String md5EncodeUtf8, Integer id);

    int checkEmailByUserId(String email, Integer id);

    int checkAnswer(String username, String question, String answer);
}