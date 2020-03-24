package BuilderPatternHierarchies;

import static BuilderPatternHierarchies.NyPizza.Size.SMALL;
import static BuilderPatternHierarchies.Pizza.Topping.MUSHROOM;
import static BuilderPatternHierarchies.Pizza.Topping.ONION;

import java.util.*;


public class NyPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }
    
    @SuppressWarnings("unused")
	private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override public NyPizza build() {
            return new NyPizza(this);
        }

        @Override protected Builder self() { 
        	return this; 
        }
    } 
    
    
    

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override public String toString() {
        return "New York Pizza with " + toppings;
    }
}