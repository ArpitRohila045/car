package Car;

public interface Engine extends Car_Engine, Bike_Engine ,Truck_Engine{
    public void Start();
    public void stop();
}
