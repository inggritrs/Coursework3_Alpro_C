import java.util.Random;

public class ComputeMethods5026211012{

	public double fToC(double degreesF){
		return ((5.0/9.0)*(degreesF - 32));
	}
	public double hypotenuse(int a , int b){
		return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
	}
	public int roll(){
	Random roll = new Random();
	int dice1 = roll.nextInt(6)+1;
	int dice2 = roll.nextInt(6)+1;
	return dice1 + dice2;
	}
}
