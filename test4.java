public class test4 {
    public static void main(String[] args) {
    int x = 2;
	int y = x + x;
    System.out.println("x = "+x);
    System.out.println("y = "+y);
     
    // แปลงค่า int เป็น String
     String s = Integer.toString(2);
     // เชื่อมต่อ String กับตัวเอง
     String t = s + s;
     
     System.out.println(" s : " + s);
     System.out.println(" t : " + t);
    }
}
