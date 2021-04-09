public class Test2 {
    

    int a;

    public void vartest(){
        this.a++;
    }

    public static void main(String[] args) {
        Test2 myTest = new Test2();
        myTest.a = 1;
        myTest.vartest();
        System.out.println(myTest.a);
    }
    
}
