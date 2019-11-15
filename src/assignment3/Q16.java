package assignment3;

public class Q16 {

	public static void main(String[] args) {
		
		int a = 1;
		int endNumber = 10;
		
		while(a<=endNumber) {
				
			if(a%2!=0) {
				
				System.out.print(a);
				
				a++;
				
			}else {
				
				System.out.print(", ");
				
				a++;
			}
							
		}
			
	}

}

//int start = 1;int end = 11;String print="";while (start <= end) {    if(start % 2 != 0){        print=print+start;        //Logic to add comma        if(end % 2 == 0){ //If end is an even number            if(start != (end - 1)) { //check to not add , after printing last numberprint=print+", ";            }        } else { //If end is an odd numberif(start != end) { //check to not add , after printing last number    print=print+", ";}        }    }    start++;}System.out.println(print);}}
