package ssm.service;

import ssm.bean.User;

public interface UserService {
	User	queryUserByUnameAndPwd(String user,String pwd);
}
