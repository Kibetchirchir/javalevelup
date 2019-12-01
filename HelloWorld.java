public class HelloWorld{
    int x;
    String y;
    public HelloWorld(int model, String type){
        x = model;
        y = type;
    }
    public void myMethod(){
        System.out.println("My car is " + y + " and the make is " + x);
    }
    public static void methodExample(String name, int age) {
        String status;   
        if(age < 18){
            status = "a Child";
        }else{
            status = "an Adult";
        }
        System.out.println(name + " is " + status);
    }
    public static int ageIn5yrs(int age){
        int ageIN5 = age + 5;
        return ageIN5;
    }
    public static String ageIn5yrs(double age){
        String error = "invalid age meaning ageIn5yrs was overloaded";
        return error;
    }
    public static void main(String[] args) {
        methodExample("Chirchir", 22);
        methodExample("Kenneth", 15);
        System.out.println(ageIn5yrs(5));
        System.out.println(ageIn5yrs(5.5));
        HelloWorld myObj = new HelloWorld(2012, "corolla");
        myObj.myMethod();
    }
}