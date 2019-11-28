public class HelloWorld{
    public static void methodExample(String name, int age) {
        String status;   
        if(age < 18){
            status = "a Child";
        }else{
            status = "an Adult";
        }
        System.out.println(name + " is " + status);
    }
    public static void main(String[] args) {
        methodExample("Chirchir", 22);
        methodExample("Kenneth", 15);
    }
}