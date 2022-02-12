
public class FizzBuzz {

	public static void main(String[] args) {
		
		System.out.println("====== FizzBuzz =======");
		for(int i=1;i<=100;i++) {
			System.out.println(convertFizzBuzz(i));
		}
		
		System.out.println("====== End =======");
	}
	
	public static String convertFizzBuzz(int number) {
		if(number % 15 == 0)
			return "FizzBuzz";
		if(number % 3 == 0)
			return "Fizz";
		if(number % 5 == 0)
			return "Buzz";
		
		return Integer.toString(number);
	}

}
