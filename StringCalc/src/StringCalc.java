
public class StringCalc {

	public int Add(String string) {
		// TODO Auto-generated method stub
		
		String[] numbers = string.split(",");
		if(string.isEmpty())
			return 0;
		else if (string.length()==1){
			return Integer.parseInt(string);
			
		}
		else{
			return (Integer.parseInt(numbers[0]) +  Integer.parseInt(numbers[1]));
		}
	}

}
