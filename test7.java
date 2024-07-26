public class test7 {
    public static void main(String[] args) {
    // กำหนดค่าเริ่มต้นของตัวแปร
    double x = 2.5;
    double y = -1.5;
    int m = 18;
    int n = 4;

    // ก. คำนวณ x + n * y - (x + n) * y
    double result1 = x + n * y - (x + n) * y;
    System.out.println("1. x + n * y - (x + n) * y = " + result1);

    // ข. คำนวณ m / n + m % n
    int result2 = m / n + m % n;
    System.out.println("2. m / n + m % n = " + result2);

    // ค. คำนวณ 5 * x - n / 5
    double result3 = 5 * x - n / 5;
    System.out.println("3. 5 * x - n / 5 = " + result3);

    // ง. คำนวณ Math.sqrt(Math.sqrt(n))
    double result4 = Math.sqrt(Math.sqrt(n));
    System.out.println("4. Math.sqrt(Math.sqrt(n)) = " + result4);

    // จ. คำนวณ (int)Math.round(x)
    int result5 = (int)Math.round(x);
    System.out.println("5. (int)Math.round(x) = " + result5);

    // ฉ. คำนวณ (int)Math.round(x) + (int)Math.round(y)
    int result6 = (int)Math.round(x) + (int)Math.round(y);
    System.out.println("6. (int)Math.round(x) + (int)Math.round(y) = " + result6);

    // ช. คำนวณ 1 - (1 - (1 - (1 - (1 - n))))
    int result7 = 1 - (1 - (1 - (1 - (1 - n))));
    System.out.println("7. 1 - (1 - (1 - (1 - (1 - n)))) = " + result7);
    }
}
