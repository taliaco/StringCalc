
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
			return getSum(numbers[0], numbers[1]);
		}
	}
	private int getSum(String a, String b){
		return (Integer.parseInt(a)+Integer.parseInt(b));
	}

}
