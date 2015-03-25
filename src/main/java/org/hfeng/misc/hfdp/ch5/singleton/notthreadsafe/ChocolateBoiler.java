package org.hfeng.misc.hfdp.ch5.singleton.notthreadsafe;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() throws Exception{
		if (uniqueInstance == null) {
	        SECONDS.sleep(1);
			System.out.println("Creating unique instance of Chocolate Boiler, should happen only once!");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
            System.out.println("Filling");
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
            System.out.println("Empty!");
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
            System.out.println("We boiled already! NO MORE Boil should ever happen!");
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

}
