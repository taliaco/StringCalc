
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
			return getSum(numbers);
		}
	}
	private int getSum(String[] numbers){
		int sum =0;
		for (String i:numbers){
			sum += Integer.parseInt(i);
		}
		return sum;
	}

}
