import java.util.Scanner;

public class snakeladder {
    int snakeladder;
     Scanner sc = new Scanner(System.in);

    public Scanner set(){
        System.out.println(snakeladder);
        return sc;
    }
    int[] arr = new int[100];
    int i;

    public int snakeladderone(int snakeladder) {
        snakeladder = ((int) (Math.random() * 10 % 6) + 1);
        while (snakeladder <= arr[i]) {
            arr[i]++;
        }
        return snakeladder;
    }
            // for (int random; random<= Math;.random()/ Math.nextDown(6); random++) {
            //System.out.println(random)
    public static void main(String[] args) {
        snakeladder snakeladder = new snakeladder();
        System.out.println(snakeladder.snakeladderone(snakeladder.i));
    }
}
