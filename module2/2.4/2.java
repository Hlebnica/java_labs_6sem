class MyClass {
    public static int count = 0;
    
    public MyClass() {
        count++;
    }
    
    public static int countObj() {
       return count;
    }
}