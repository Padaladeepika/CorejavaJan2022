package test;

public class Switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Clean India Green India";
int vowelCount = 0;
		
		for(int index=0;index<str1.length();index++) {
			
			char temp = str1.charAt(index);
			
			switch(temp) {
			
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					vowelCount = vowelCount+1 ;
					break;
				default:
					System.out.println("Inside default");

			}	
		}
		
		System.out.println("Total voWels are " + vowelCount);
		
	}

}

