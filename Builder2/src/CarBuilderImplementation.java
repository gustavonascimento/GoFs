
public class CarBuilderImplementation implements CarBuilder{

	private Car car;
	
	public CarBuilderImplementation(){
		car = new Car();
	}
	
	@Override
    public void setWheels(int wheels) {
        car.setWheels(wheels);
    }
    
    @Override
    public void setColor(String color) {
        car.setColor(color);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
