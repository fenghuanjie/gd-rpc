package io.goudai.cluster.domain;

/**
 * Created by Administrator on 2016/1/17.
 */
public  class SimpleUserService implements UserService {
    @Override
    public User add(User user) {
        return user;
    }
}
