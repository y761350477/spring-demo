package test7;

public class TimImpl implements TimDAO {

    @Override
    public void login(String name) {
        System.out.println(name + "登录Tim账号");
    }
}
