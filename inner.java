
class outer1{
    int a=10;
    static int d=30;
    public void show()
    {
        System.out.println("the value of ais+"+a);
        //System.out.println(c);
        inner1 in=new inner1();
        System.out.println("the value of c is"+in.c);


    }
    class inner1{
        int b=20;
        int c=40;
        public void display()
        {
            System.out.println("the value of ais \t"+a);
            System.out.println("the value of b \t"+b);
            System.out.println(d);
        }

    }
}
public class inner {
    public static void main(String[] args) {
//        outer1 in=new outer1();
//        in.show();
        //1
//        outer1.inner1 inn=in.new inner1();
//        inn.display();
        //
        outer1.inner1 in=new outer1().new inner1();
        in.display();
        outer1 out=new outer1();
        out.show();


    }
}
