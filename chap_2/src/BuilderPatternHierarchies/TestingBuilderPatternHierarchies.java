package BuilderPatternHierarchies;

import static BuilderPatternHierarchies.Pizza.Topping.*;
import static BuilderPatternHierarchies.NyPizza.Size.*;

public class TestingBuilderPatternHierarchies {

	public static void main(String[] args) {
		
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(MUSHROOM).addTopping(ONION).build();
        
        Calzone cal = new Calzone.Builder().addTopping(MUSHROOM).sauceInside().build(); 
        
        System.out.println(cal);
	}
}
