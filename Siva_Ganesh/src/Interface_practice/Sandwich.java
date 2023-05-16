package Interface_practice;


class Bread {
	public Bread() {
		System.out.println("In the Bread class");
	}
}

class Cheese {
	public Cheese() {
		System.out.println("In the Cheese Class");
	}
}

class Lettuce {
	public Lettuce() {
		System.out.println("In the Lettuce  class");
	}
}

class Pickle {
	public Pickle() {
		System.out.println("In the Pickle class");
	}
}

interface FastFood {
	void newOne();
}

public class Sandwich implements FastFood {
    @Override
	public void newOne() {
		new Bread();
		new Cheese();
		new Lettuce();
		new Pickle();
	}

	public Sandwich() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich().newOne();
	}
}