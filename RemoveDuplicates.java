package week3.day2;


	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String input="java";
		String[] arrstring=text.split(" ");
		StringBuilder newValue = new StringBuilder();
		for(String s:arrstring) {
			if(s.equalsIgnoreCase(input)) {
				count++;
			}
			if(count > 1) {
				if(!s.equalsIgnoreCase(input)) {
					newValue.append(s+" ");	
				}
				//System.out.println("Dupilcate Value is more than one "+"Word : "+input+":count: "+count);
			}else {
				newValue.append(s+" ");	
			}
		}
		System.out.println("Old String : "+text);
		System.out.println("Word : "+input+":count: "+count);
		System.out.println("New String : "+newValue.toString());
	}

}
