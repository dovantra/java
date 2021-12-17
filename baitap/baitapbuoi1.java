import java.util.Scanner;

public class baitapbuoi1 {
    public static void main(String[] args) {
        Scanner caculator = new Scanner(System.in);
        
        System.out.println("Gía trị của a");
         int a = caculator.nextInt();
        System.out.println("Gía trị của b");
        int b = caculator.nextInt();




        System.out.println("tổng 2 số là:"+(a+b));
        System.out.println("Hiệu 2 số là:"+(a-b));
        System.out.println("tích 2 số là"+(a/b));
        System.out.println("Thương 2 số là"+(a*b));
        

        caculator.close();

        


    }
    
}
