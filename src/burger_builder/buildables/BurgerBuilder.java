package burger_builder.buildables;

import burger_builder.buildables.burgeringredients.*;

public class BurgerBuilder implements Builder<Burger> {
	
	
	private Burger burger;
	
	
	public BurgerBuilder() {
	
	this.burger = new Burger();
	
	}
	
	
	
	@Override
	public Builder<Burger> addPatty(Patty patty) {
		if (burger.getBurgerPatty1() == null) {
			burger.setBurgerPatty1(patty);
			
		} else if (burger.getBurgerPatty1() != null && burger.getBurgerPatty2() != null) {
			throw new  IllegalStateException("Both slots are full!");
		} else {
			burger.setBurgerPatty2(patty);
			
		}
		
		return this;
	}
	
	
	
	@Override
	public Builder<Burger> addBun(Bun bun) {
		burger.setBun(bun);
		return this;
	}
	
	@Override
	public Builder<Burger> addLettuce(Lettuce lettuce) {
		burger.setLettuce(lettuce);
		return this;
	}
	
	@Override
	public Builder<Burger> addTomato(Tomato tomato) {
		burger.setTomato(tomato);
		return this;
	}
	
	@Override
	public Builder<Burger> addOnion(Onion onion) {
		burger.setOnion(onion);
		return this;
	}
	
	@Override
	public Builder<Burger> addPickle(Pickle pickle) {
		burger.setPickle(pickle);
		return this;
	}
	
	@Override
	public Builder<Burger> addCheese(Cheese cheese) {
		if (burger.getCheese1() == null) {
			burger.setCheese1(cheese);
		} else if (burger.getCheese1() != null && burger.getCheese2() != null) {
			throw new  IllegalStateException("Both slots are full!");
		} else {
			burger.setCheese2(cheese);
		}
		return this;
	}
	
	@Override
	public Builder<Burger> addSauce(Sauce sauce) {
		if (burger.getSauce1() == null) {
			burger.setSauce1(sauce);
			
		} else if (burger.getSauce1() != null && burger.getSauce2() == null) {
			burger.setSauce2(sauce);
			
		}  else if (burger.getSauce1() != null && burger.getSauce2() != null && burger.getSauce3() == null) {
			burger.setSauce3(sauce);
			
		} else {
			throw new  IllegalStateException("Both slots are full!");
			
		}
		return this;
	}
	
	@Override
	public Builder<Burger> reset() {
		return new BurgerBuilder();
	}
	
	@Override
	public Burger getResult() {
		return this.burger;
	}
}
