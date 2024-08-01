public class Result1To000 {
    public static void main(String[] args) {
        int sum = 0;  
        int i = 1;    

        while (i <= 100) {
            sum += i;  
        System.out.println(" i: " + i + ", Result in whileLoop : " + sum);
            i++;       
        }

        System.out.println("Result in whileLoop 1 - 100 is : " + sum);
    }
    }

