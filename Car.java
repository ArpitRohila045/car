package Car;

public class Car implements Car_Engine{


    @Override
    public void Start() {
        System.out.println("Start like Car Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop like Car Engine");
    }
}
