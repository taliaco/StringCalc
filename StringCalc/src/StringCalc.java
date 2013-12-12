
public class StringCalc {

	public int Add(String string) throws Exception {
		// TODO Auto-generated method stub
		
		String[] numbers = string.split(",|\n");
		
		if(string.isEmpty())
			return 0;
		else if (string.length()==1){
			return StringToInt(string);
		}
		else{
			return getSum(numbers);
		}
	}
	private int getSum(String[] numbers) throws Exception{
		for (String i:numbers){
			if (StringToInt(i) < 0){
				throw new Exception("negative number");
			}
		}
		int sum =0;
		for (String i:numbers){
			sum += StringToInt(i);
		}
		return sum;
	}
	private int StringToInt(String str){
		return Integer.parseInt(str);
	}

}
