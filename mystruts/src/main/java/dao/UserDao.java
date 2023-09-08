package dao;

import database.UserDto;

public interface UserDao {
public UserDto findbymobileno(String mobileno)throws Exception;
public UserDto findbyusername(String username)throws Exception;
public int createUser(UserDto ud)throws Exception;
public int updateuser(UserDto ud)throws Exception;
public int deleteuserbymobileno(String mobileno)throws Exception;
public int deleteuserbyusername(String username)throws Exception;
public UserDto findbyusernameandpassword(String username,String password)throws Exception;
public int updateusermobileno(UserDto mobileno)throws Exception;
public int updateUserPassword(String emailId)throws Exception;

}
