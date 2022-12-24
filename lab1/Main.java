import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("x =  ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextFloat();

        System.out.println("k =  ");
        int k = sc.nextInt();
        if (k < 0){ return; }
        double eps = Math.pow(10, -k);
        System.out.println(cosinys.coss(x, eps));
        double valueofcos = Math.cos(x);
        String result = String.format("%.3f",valueofcos);
        System.out.println(result);

    }

}
class cosinys{
    public static double coss(double x,double k){
        int i = 1;
        double sum = 1;
        double lastElementOfSequence = 1;
        double y = x * x;
        do {
            lastElementOfSequence = -(y * lastElementOfSequence) / ((2 * i - 1) * (2 * i));
            sum += lastElementOfSequence;
            i++;
        } while (Math.abs(lastElementOfSequence) > k && i < 1000000);


        return sum;
    }
}