package JavaP160;

import java.util.StringJoiner;

//这里的Coneable接口是一个标记型接口
//如果一个接口里面没有抽象方法,那这个接口就是一个标记型接口
//如果接口没有被实现,当前的类对象就不能克隆
public class User implements Cloneable {
    private int id;
    private String userName;
    private String userPasswd;
    private String path;
    private int[] data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public User(int id, String userName, String userPasswd, String path, int[] data) {
        this.id = id;
        this.userName = userName;
        this.userPasswd = userPasswd;
        this.path = path;
        this.data = data;
    }

    public User() {
    }

    private String arrToString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                stringBuilder.append(arr[i]);
                break;
            }
            stringBuilder.append(arr[i] + ", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private String arrToString2(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner("-", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            stringJoiner.add(arr[i] + "");
        }
        return stringJoiner.toString();
    }

    @Override
    public String toString() {
        return id + " | " + userName + " | " + userPasswd + " | " + path + " | " + arrToString2(data);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        // 让Java帮我们克隆一个对象，并且返回出去
        int[] data = this.data;
        int[] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        User u = (User) super.clone();
        u.data = newData;
        return u;
    }

}
