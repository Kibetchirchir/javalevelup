class MyClass{
    int x;
    /**
     * this is a static method
    */
    static void myStaticMethod(){
        System.out.println("hello im static and object can be called without any instance");
    }
    /**
     * this is a public method
    */

    public void myPublicMethod(){
        System.out.println("this should be called after initializing the class");
    }
    /**
     * this is the main which is called when the class is called
    */
    public static void main(String[] args) {
        MyClass newObj = new MyClass();
        newObj.x = 3;
        System.out.println(newObj.x);

        /**
         * calling a static method
         */
        myStaticMethod();
        newObj.myPublicMethod();
    }
}