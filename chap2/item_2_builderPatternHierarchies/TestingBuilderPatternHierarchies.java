package item_2_builderPatternHierarchies;

import static item_2_builderPatternHierarchies.NyPizza.Size.*;
import static item_2_builderPatternHierarchies.Pizza.Topping.*;

public class TestingBuilderPatternHierarchies {

	public static void main(String[] args) {
		
        NyPizza piz = new NyPizza.Builder(SMALL).addTopping(MUSHROOM).addTopping(ONION).build();
        
        Calzone cal = new Calzone.Builder().addTopping(MUSHROOM).sauceInside().build(); 
        
        System.out.println(piz);
        System.out.println(cal);
	} 
}
