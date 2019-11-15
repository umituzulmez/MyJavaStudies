package assignment2;

public class q2 {

	public static void main(String[] args) {
		/*Tax Calculator:

    - Let user enter his income

    - Calculate the tax amount according to below table

    - Print the tax amount

Income	Tax Ratio
income ≤150,000,000	%25
income ≤ 300,000,000	%30
income ≤ 600,000,000	%35
income ≤ 1,200,000,000	%40
income > 1,200,000,000	%50
Sample Output-1

Your Income : 1500

The tax amount you have to pay : 375.0

Sample Output-2

Your Income : 1200000

The tax amount you have to pay : 300000.0

Note: IF Your Income is 200,000,000, your tax will be calculated this way: 
%25 for 150,000,000 and %30 for the rest of the amount which is 50,000,000
		 */

		int income;
	
		double taxRatio, taxAmount;
		
		income = 500_000_000;
		taxRatio = 0;
		
		if (income<=150_000_000){
			taxRatio = 0.25;
			
		}else if (income>150_000_000 && income<=300_000_000){
			taxRatio = 0.30;
			taxAmount = (150_000_000 * 0.25) + ((income - 150_000_000) * 0.30); 
			
		}else if (income>300_000_000 && income<=600_000_000){
			taxRatio = 0.35;
			taxAmount = (150_000_000 * 0.25) + (150_000_000 * 0.30) + ((income - 300_000_000) * 0.35);
			
		}else if (income>600_000_000 && income<=1_200_000_000){
			taxRatio = 0.40;
			taxAmount = (150_000_000 * 0.25) + (150_000_000 * 0.30) + (300_000_000 * 0.35) + ((income - 600_000_000) * 0.40);
			
		}else if (income>1_200_000_000){
			taxRatio = 0.50;
			taxAmount = (150_000_000 * 0.25) + (150_000_000 * 0.30) + (300_000_000 * 0.35) + (600_000_000 * 0.40) + ((income - 1_200_000_000) * 0.50);
			
		}
		
			taxAmount = income * taxRatio;
		
			System.out.println("Your Tax Amount is " + taxAmount);
			
	}

}

//int income=1200000;double taxAmount_1 = income * 0.25;double taxAmount_2 = ((income - 150000000) * 0.30) + (150000000 * 0.25);double taxAmount_3 = ((income - 300000000) * 0.35) + taxAmount_2;double taxAmount_4 = ((income - 600000000) * 0.40) + taxAmount_2 + taxAmount_3;double taxAmount_5 = ((income - 1200000000) * 0.50) + taxAmount_2 + taxAmount_3 + taxAmount_4;if (income <= 150000000) {    System.out.println("Your income: " + income);    System.out.println("The tax amount is you have to pay: " + taxAmount_1);} else if(income <= 300000000) {System.out.println("Your income: " + income);System.out.println("The tax amount is you have to pay: " + taxAmount_2);} else if(income <= 600000000) {System.out.println("Your income: " + income);System.out.println("The tax amount is you have to pay: " + taxAmount_3);} else if(income <= 1200000000) {System.out.println("Your income: " + income);System.out.println("The tax amount is you have to pay: " + taxAmount_4);} else if(income > 1200000000) {System.out.println("Your income: " + income);System.out.println("The tax amount is you have to pay: " + taxAmount_5);} else {System.out.println("Please enter valid income...");}}}

