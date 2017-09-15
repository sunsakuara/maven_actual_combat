package net.zhuruyi.Entity;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 11:27 2017/9/15
 * @Modified By:
 */
public class User {

    private String LogginName;
    private String password;

    public String getLogginName() {
        return LogginName;
    }

    public void setLogginName(String logginName) {
        LogginName = logginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "LogginName='" + LogginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
