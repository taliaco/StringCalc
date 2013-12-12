
public class StringCalc {

	public int Add(String string) {
		// TODO Auto-generated method stub
		
		String[] numbers = string.split(",|\n");
		
		if(string.isEmpty())
			return 0;
		else if (string.length()==1){
			return Integer.parseInt(string);
		}
		else{
			int num1 = Integer.parseInt(numbers[0]);
			int num2 = Integer.parseInt(numbers[1]);
			return (num1+num2);
		}
	}

}
