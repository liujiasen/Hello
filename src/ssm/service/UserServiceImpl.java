package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.bean.User;
import ssm.mapper.UserMapper;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public User queryUserByUnameAndPwd(String user, String pwd) {
		return userMapper.queryUserByUnameAndPwd(user, pwd);
	}

}
