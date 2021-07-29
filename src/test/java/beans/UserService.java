package beans;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-28 15:58
 **/
public class UserService {

    private String username;

    public UserService(){

    }

    public UserService(String username) {
        this.username = username;
    }

    public void queryUserInfo() {
        System.out.println("查询" + username +"用户信息");
    }

}
