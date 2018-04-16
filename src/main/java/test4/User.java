package test4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userBean")
public class User {
    @Value("YangChen")
    private String name;

    @Autowired
    @Config.Cold
    private TimDAO timDAO;

    @Autowired
    @Config.Creamy
    private WechatDAO wechatDAO;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    /**
     * 构造注入
     *
     * @author YC
     * @create 2018/4/12 15:43.
     */
    public User(TimDAO timDAO, WechatDAO wechatDAO) {
        this.timDAO = timDAO;
        this.wechatDAO = wechatDAO;
    }

    /**
     * 设值注入
     *
     * @author YC
     * @create 2018/4/12 15:43.
     */
    public void doLogin() {
        timDAO.login(name);
        wechatDAO.login(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimDAO getTimDAO() {
        return timDAO;
    }

    public void setTimDAO(TimDAO timDAO) {
        this.timDAO = timDAO;
    }

    public WechatDAO getWechatDAO() {
        return wechatDAO;
    }

    public void setWechatDAO(WechatDAO wechatDAO) {
        this.wechatDAO = wechatDAO;
    }



}
