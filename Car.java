class Car extends Vehicle{ 
    public void accelerate(){
        System.out.println("vuum like a subaru");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.ignite();
    }
}
class Vehicle{
    public void accelerate(){
        System.out.println("vuum");
    }

    public void ignite(){
        System.out.println("car started");
    }
}