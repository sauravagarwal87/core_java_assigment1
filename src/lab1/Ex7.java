package lab1;

import java.util.Scanner;

public class Ex7 {
	
	static boolean checkNumber(int number){
		boolean increasing = false;
        while(number>0) {
            int lastDigit = number % 10;
            number /= 10;
            int nextLastDigit = number % 10;
            
            if(nextLastDigit<=lastDigit) {
                increasing=true;
            }
            else {
                increasing=false;
                break;
            }
        }
        return increasing;
    }

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(Ex7.checkNumber(number));
		sc.close();
		
	}
}
