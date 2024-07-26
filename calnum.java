import java.util.Scanner; //step1 เรียกใช้คลาส Scanner
public class calnum {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in); //step2 สร้างออบเจ็กต์ in สำหรับรับข้อมูล
        System.out.print("Input Number1 : ");
        x = in.nextInt(); //step3 รับตัวเลขเป็นจำนวนเต็มเก็บในตัวแปร x
        System.out.println("your number1 is "+x);
        System.out.print("Input Namber2 : ");
        y = in.nextInt();
        System.out.println("your namber2 is "+y);
        System.out.println(x+ " + " +y+ " = " +(x+y));
    }
}
