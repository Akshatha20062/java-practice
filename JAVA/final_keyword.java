final class car {
    private String model;

    public car(String model){
        this.model = model;
    }

    public final String getModel(){
        return model;
    }
}


public class final_keyword {
    public static void main(String[] args) {
        car car = new car("Toyota");
        System.out.println("CarModel:" + car.getModel());

    }

}