package assignment3;

public class Q10 {

	public static void main(String[] args) {
		
		int book=4;
		int point=0;
		
		if(book==0) {
			point=0;
			
		}else if (book==1) {
			point=5;
			
			System.out.println("The number of book purchased this month is = " + book);
			System.out.println("The number of points awarded this month is = " + point);
			
		}else if (book==2) {
			point=15;
			
			System.out.println("The number of book purchased this month is = " + book);
			System.out.println("The number of points awarded this month is = " + point);
			
		}else if (book==3) {
			point=30;
			
			System.out.println("The number of book purchased this month is = " + book);
			System.out.println("The number of points awarded this month is = " + point);
			
		}else if (book>=4) {
			point=60;
			
			System.out.println("The number of book purchased this month is = " + book);
			System.out.println("The number of points awarded this month is = " + point);
		
		}else {
			
			System.out.println("invalid book purchase");
		}
		
	}

}
