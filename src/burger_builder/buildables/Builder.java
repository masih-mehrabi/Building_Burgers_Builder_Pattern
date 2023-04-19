package burger_builder.buildables;

import burger_builder.buildables.burgeringredients.*;

public interface Builder<T> {

	
	
	Builder<T> addPatty(Patty patty);
	Builder<T> addBun(Bun bun);
	Builder<T> addLettuce(Lettuce lettuce);
    Builder<T> addTomato(Tomato tomato);
    Builder<T> addOnion(Onion onion);
	Builder<T> addPickle(Pickle pickle);
	Builder<T> addCheese(Cheese cheese);
	Builder<T> addSauce(Sauce sauce);
	Builder<T> reset();
	T getResult();

}
