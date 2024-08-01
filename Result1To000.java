public class Result1To000 {
    public static void main(String[] args) {
        int  i = 1, sum = 0;  
        while (i <= 100) {
            System.out.println(" i: " + i + ", sum : " + sum);
            sum += i;  
            i++;       
        }

        System.out.println("Result 1 To 100 Is : " + sum);
    }
    }

