import java.util.Scanner;
public class Roll_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	int roll1 = rollDice();
	int roll2 = rollDice();
	int roll3 = rollDice();
	System.out.println("Enter Three Nos. Between 1 and 6");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	sc.close();
	if(num1<1 || num2<1 || num3<1) {
		System.out.println("Numbers cannot be less than 1. Shutting Game Down..... ");
		System.exit(0);
	}
	if(num1>6 || num2>6 || num3>6) {
		System.out.println("Numbers Cannot Be greater Than 6.  Shutting game Down ....");
		System.exit(0);
	}
	int sumofNum = num1+num2+num3;
	int sumofrolls = roll1+roll2+roll3;
	System.out.println("The Dice Sum : "+ sumofrolls + ". Numbers Sum : " + sumofNum);
		checkWin(sumofNum , sumofrolls);
	}
public static int rollDice() {
	double randomNumber = Math.random()*6;
	randomNumber +=1;
	return (int)randomNumber;
}
public static void checkWin(int sumofNum ,int sumofrolls ) {
	if(sumofNum > sumofrolls && sumofNum - sumofrolls <3) {
		System.out.println("Congrats You Win !!");
		
}else {System.out.println("Sorry !! You lose..");
}
}
}