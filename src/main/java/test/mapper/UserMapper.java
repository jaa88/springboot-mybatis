package test.mapper;

import test.pojo.User;

import java.util.List;

/**
 * Created by jianan on 2018/9/29.
 */
public interface UserMapper {
    int getAllCount();

    void batchInsertUser(List<User> list);

    List<User> getAllUser();
}
