package demo;
import java.util.Scanner;
public class demo01 {
	
	public class Main {
	    public static void main(String[] args) {
	        int num, sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập vào một số: ");
	        num = sc.nextInt();
	        for(int i = 1; i <= num; ++i)
	        {
	            // sum = sum + i;
	            sum += i;
	        }
	        System.out.println("Tổng các số tự nhiên từ 1 đến "+ num +" là: "+sum);
	 
	        System.out.println("------------------------------------");
	        System.out.println("Chương trình này được đăng tại Freetuts.net");
	    }
	}
}
