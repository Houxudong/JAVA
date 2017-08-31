import java.util.Date;

public class test {
    public static void main(String[] agrs)
    {
        Date deadline; //deadline 并不是对象，不能引用Date的任何方法
        deadline = new Date();
        System.out.print(deadline.toString());
    }

}
