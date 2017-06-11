package Questao1;

public class APP {

	public static void main(String[] args) {

		Par<String, Double> i = new Par<String, Double>("persio", 9.6);

		Par<Integer, String> ii = new Par<Integer, String>(12, "roger");

		Par<Float, Float> iii = new Par<Float, Float>(6.0f, 3.0f);
		

		System.out.println(i.toString() + "\n" + ii.toString() + "\n" + iii.toString());

	}

}
