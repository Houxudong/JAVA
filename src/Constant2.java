public class Constant2
{   /* final 指示的常量只能被赋值一次，static final设置类常量，位于main方法外部
        同一个类的方法可以使用类常量，如果被声明为public 其他类的方法也可以访问*/
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] agrs){
        double paperWideth = 8.5;
        double paperHeigth = 11;
        System.out.print("Paper size in cnetimeter is :" + paperHeigth*CM_PER_INCH + " by " + paperWideth*CM_PER_INCH);
    }

}
