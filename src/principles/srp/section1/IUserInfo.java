package principles.srp.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 用户信息管理
 */
public interface IUserInfo {

    //设置用户的ID
    void setUserID(String userID);

    //获得用户的ID
    String getUserID();

    //设置用户的密码
    void setPassword(String password);

    //获得用户的密码
    String getPassword();

    //设置用户的名字
    void setUserName(String userName);

    //获得用户的名字
    String getUserName();

    //修改用户的密码
    boolean changePassword(String oldPassword);

    //删除用户
    boolean deleteUser();

    //用户映射
    void mapUser();
}
