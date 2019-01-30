package principles.srp.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 用户的业务对象
 */
public interface IUserBO {
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
}
