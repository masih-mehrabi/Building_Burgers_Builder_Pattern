package burger_builder;

import burger_builder.buildables.Burger;
import burger_builder.buildables.BurgerBuilder;
import burger_builder.buildables.IngredientsList;
import burger_builder.buildables.IngredientsListBuilder;

public final class Client {
	private Client() {
	}

	public static void main(String[] args) {

    	
    	
        BurgerRestaurant burgerRestaurant = new BurgerRestaurant();

		BurgerBuilder burgerBuilder = new BurgerBuilder();
		burgerRestaurant.buildStandardBeefBurger(burgerBuilder);
		Burger burger = burgerBuilder.getResult();

		System.out.println("You have selected the following Burger: " + burger.toString());

		IngredientsListBuilder ingredientsListBuilder = new IngredientsListBuilder();
		burgerRestaurant.buildSpecialBeefBurger(ingredientsListBuilder);
		IngredientsList specBurgeringreList = ingredientsListBuilder.getResult();

		System.out.println("You have selected the following Burger: " + specBurgeringreList.toString());

		burgerRestaurant.buildStandardChickenBurger(burgerBuilder);
		Burger chickenBurger = burgerBuilder.getResult();

		System.out.println("You have selected the following Burger: " + chickenBurger.toString());
  

	}
}
