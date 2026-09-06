package tutorial6;

class Car
{
    private String model;

    public Car(String model)
    {
        this.model = model;
    }

    public void showModel()
    {
        System.out.println("Model: " + model);
    }
}
public class AccessModifiersCars {
	 public static void main(String[] args)
	    {
	        Car c = new Car("BMW");

	        c.showModel();
	    }
}