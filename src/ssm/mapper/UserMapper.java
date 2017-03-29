package ssm.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import ssm.bean.User;


public interface UserMapper {
	
	User queryUserByUnameAndPwd(@Param("username")String username,@Param("password") String password);
}
