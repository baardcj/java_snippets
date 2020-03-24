package builderPatternHierarchies;

import static builderPatternHierarchies.Pizza.Topping.*;
import static builderPatternHierarchies.NyPizza.Size.*;

public class TestingBuilderPatternHierarchies {

	public static void main(String[] args) {
		
        NyPizza piz = new NyPizza.Builder(SMALL).addTopping(MUSHROOM).addTopping(ONION).build();
        
        Calzone cal = new Calzone.Builder().addTopping(MUSHROOM).sauceInside().build(); 
        
        System.out.println(piz);
        System.out.println(cal);
	} 
}
