package Car;

public class Truck implements Truck_Engine{

    @Override
    public void Start() {
        System.out.println("Start like truck engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop like truck engine");

    }
}
