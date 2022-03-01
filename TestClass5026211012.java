public class TestClass5026211012{
	public static void main(String[] args){
		ComputeMethods5026211012 ml = new ComputeMethods5026211012();
		double degreesF = 100.4;
		double tempinC = ml.fToC(degreesF);
		System.out.println("Temp in celcius is " +tempinC);
		double hypo = ml.hypotenuse(6 , 9);
		System.out.println("Hypotenuse is " +hypo);
		int sumRoll = ml.roll();
		System.out.println("The sum of the dice value is "+sumRoll);
	}

}