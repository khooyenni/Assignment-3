import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Q1();
		Q2();
		Q3();
		Q4();
		
		in.close();
	};
	
	public static void Q1() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int age = in.nextInt();
		System.out.println("Age : " + age);
		System.out.println();
		
		if(age>=20) {
			System.out.print("Congratulation, you are eligible to apply the business loan." );
			System.out.println();
		}else
			System.out.print("Sorry, you are not eligible to apply the business loan.");
		System.out.println();
		
		System.out.print("Enter you name: ");
		String name = in.next();
		
		System.out.print("Enter your citizenship:");
		String citizenship = in.next();
		
		System.out.print("Enter your home address:");
		String home = in.next();
		
		System.out.println();
		
		String[][] answer1 = {{"Name: ", "Citizenship: ", "Home Address: "},
								{name, citizenship,home}
		};
		Q1Array(answer1);
		System.out.println();
	}	
	
	public static void Q1Array(String[][]x) {
		System.out.println(x[0][0] + x[1][0]);
		System.out.println(x[0][1] + x[1][1]);
		System.out.println(x[0][2] + x[1][2]);
	}
	
	public static void Q2() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type of Business Loan Provide: ");
		String loan1 = in.next();
		String loan2 = in.next();
		String loan3 = in.next();
		
		System.out.println();
		
		System.out.println("Type of Business Loan Provide: ");
		String[]LoanProvide= {loan1, loan2, loan3};
		Q2Array1(LoanProvide);
		System.out.println();
	}
	
	public static void Q2Array1(String[]y) {
		int j=0;
		while(j<y.length) {
			System.out.println(y[j]);
			j++;
		};
	}
	
	public static void Q3() {
		Scanner in = new Scanner(System.in);	
		System.out.println("Interest for business loan :");
		String[][]loan= {{"1. More or equal to RM10000 is ","2. Less than RM10000 is ",},
						{"6%.","7%."}
		};
		Q3Array(loan);
		System.out.println();
	}	
	
	public static void Q3Array(String[][]z) {
		System.out.println(z[0][0] +z[1][0]);
		System.out.println(z[0][1] +z[1][1]);
	}

	public static void Q4() {
		Scanner in = new Scanner(System.in);	
		System.out.println("Enter the amount borrowed: ");
		int amount = in.nextInt();
		System.out.println("Amount borrowed : " + "RM" + amount);
		System.out.println();
		
		System.out.println("The number of months to pay the loan back: ");
		int months = in.nextInt();
		System.out.println("The number of months to pay the loan back : " + months + "months");
		System.out.println();
		
		
		int interest1 = 6;
		int interest2 = 7;	
		if(amount>=10000) {
			System.out.println("Interest per year is : " + interest1 + "%");
		}else if(amount<10000){
			System.out.println("Interest per year is : " + interest2 + "%");
		}
		System.out.println();
		
		double rate1 = amount * (0.06/12);
		double rate2 = amount * (0.07/12);
		if(amount>=10000) {
			System.out.printf("Total interest per month : RM%.2f ", rate1);
		}else if(amount<10000){
			System.out.printf("Total interest per month : RM%.2f ", rate2);
		}
		System.out.println();
		
		double tinterestloan1 = months * rate1;
		double tinterestloan2 = months * rate2;
		if(amount>=10000) {
			System.out.printf("Total interest per loan : RM%.2f ", tinterestloan1);
		}else if(amount<10000){
			System.out.printf("Total interest per loan : RM%.2f ", tinterestloan2);
		}
		System.out.println();
		
		double mpayment1 = rate1 + (amount/12);
		double mpayment2 = rate2 + (amount/12);
		if(amount>=10000) {
			System.out.printf("Monthy payment  : RM%.2f ", mpayment1);
		}else if(amount<10000){
			System.out.printf("Monthy payment  : RM%.2f ", mpayment2);
		}
		System.out.println();
		
		double tpayback1 = tinterestloan1+ amount;
		double tpayback2 = tinterestloan1+ amount;
		if(amount>=10000) {
			System.out.printf("Total borrowing cost : RM%.2f ", tpayback1);
		}else if(amount<10000){
			System.out.printf("Total borrowing cost : RM%.2f ", tpayback2);
		}
		System.out.println();
		
		System.out.println("Please come again and thank you for choosing us. ");
		
	}
	
}


	}

}
