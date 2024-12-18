package work;

public class Demo {

	public static void main(String[] args) {
		Car c=new Car();
		c.name="vinay";
		c.capacity=6;
		c.speed=100;
		c.setMillage(20);
		System.out.println(c.name+"\n"+c.capacity+"\n"+c.speed+"\n"+c.getMillage());
	}

}
