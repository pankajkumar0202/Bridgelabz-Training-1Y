public class Demo1 {
    
    static int x;

    int z;

    void m1() {
        int var = 20; 
        System.out.println("m1 local var " + var);
    }

    void m2() {
        int var = 30; 
        System.out.println("m2 local var " + var);
    }

    public static void main(String[] args) {
        System.out.println("HelloWorld");

        System.out.println("main static var x " + x);

        int y = 10; 
        System.out.println("main local var y " + y);

        
        Demo1 obj = new Demo1();

        obj.m1();
        obj.m2();

        System.out.println("instance/non-static/object-level var " + obj.z);

     
        x = 50; 
    }
}