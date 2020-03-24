package BuilderPattern;


public class Test {

	public static void main(String[] args) {
		System.out.println("Running app Test!"); 
		
		NutritionFacts vaffler = new NutritionFacts.Builder(100, 10).build(); 
		
	}
	
}



