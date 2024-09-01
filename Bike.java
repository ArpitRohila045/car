package Car;

public class Bike implements Bike_Engine{

    @Override
    public void Start() {
        System.out.println("Start like Bike Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop like Bike Engine");
    }
}
