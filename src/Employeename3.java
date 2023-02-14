import java.util.Scanner;

public class Employeename3 {
    Scanner sc = new Scanner(System.in);
    public int addition( int i ,int j) {
        int sum = i + j;
        System.out.println(sum);
        System.out.println("enter input"+i);
        System.out.println("enter input" + j);
        return 1;
    }
    public int substraction(int k, int m){
        int sub = k-m;
        System.out.println(sub);
        System.out.println("enter input"+k);
        System.out.println("enter input"+m);
        return 1;
    }
    public  int multipliaction(int j , int h){
        int multiple=j*h;
        System.out.println(multiple);
        System.out.println("enter input"+j);
        System.out.println("enter input"+h);
        return 1;
    }
    public int arealength(float pi, int r  ){
       int arealength=(int)(pi*r*r);
        System.out.println(arealength);
        System.out.println("enter input"+r);
        System.out.println("enter input"+r);
        return 1;
    }

    public static void main(String[] args) {
        Employeename3 name4 = new Employeename3();
        System.out.println(name4.addition(23,23));
        System.out.println(name4.arealength(45,45));
        System.out.println(name4.multipliaction(345,2));
        System.out.println(name4.substraction(34,345));
    }
}
