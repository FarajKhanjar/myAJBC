package networking_JSON.restaurant_exercise_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class restaurantDataBase 
{
	public static List<Order> ordersList;

	public restaurantDataBase() 
	{
		ordersList = new ArrayList<Order>();
	}

	public void run()
	{
		Order order1 = new Order();
		order1.addDish(Dish.HAMBURGER);
		order1.addDish(Dish.FRIES);
		order1.addDish(Dish.COLA);
		
		Order order2 = new Order();
		order2.addDish(Dish.SPAGHETTI);
		order2.addDish(Dish.FRIES);
		order2.addDish(Dish.SPRITE);
		
		Order order3 = new Order();
		order3.addDish(Dish.CHICKEN);
		order3.addDish(Dish.SOUP);
		order3.addDish(Dish.COLA);
		order3.addDish(Dish.ESPRESSO);
		
		Order order4 = new Order();
		order4.addDish(Dish.SALMON);
		order4.addDish(Dish.MALABI);
		order4.addDish(Dish.COLA);
		
		Order order5 = new Order();
		order5.addDish(Dish.BEEF);
		order5.addDish(Dish.PIZZA);
		order5.addDish(Dish.POTATO);
		order5.addDish(Dish.HOT_CHOCOLATE_SOUFFLE);
		order5.addDish(Dish.COPATCHINO);
		
		Order order6 = new Order();
		order6.addDish(Dish.PIZZA);
		order6.addDish(Dish.OMELETTE);
		order6.addDish(Dish.FRIES);
		order6.addDish(Dish.FRIES);
		
		ordersList.add(order1);
		ordersList.add(order2);
		ordersList.add(order3);
		ordersList.add(order4);
		ordersList.add(order5);
		ordersList.add(order6);
	}
	
	protected static float handleGetTotalPrice(Order order) 
	{
		Iterator<Dish> iterator = order.getDishesIterator();
		float price = 0;

		while (iterator.hasNext()) {
			price += iterator.next().getPrice();
		}

		return price;
	}
}