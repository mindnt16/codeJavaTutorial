import java.util.Scanner;
public class Barchart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Input Data : ");
        x = in.nextInt();
        Bar(x);
    }
    public static void Bar(int Data){
        for(int x = 1; x <= Data; x++){
            System.out.print("*");
        }
    }
}
