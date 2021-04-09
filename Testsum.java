public class Testsum {
    // 1. 입력과 출력이 모두 있는 메소드
    public int sum(int a, int b){
        return a+b;
    }

    // 2. 입력이 없는 메소드
    public String say(){
        return "Hi";
    }

    // 3. 입력은 있고 출력은 없는 메소드
    // 리턴이 없으면 출력이 없는거다
    // 돌려주는 값은 return 명령어 로만 가능하다 ** 중요
    public void sum2(int a, int b){
        System.out.println(a+"과 "+b+" 의 합은 "+(a+b)+"입니다.");
    }

    // 4. 입력도 없고 출력도 없는 메소드
    public void say2(){
        System.out.println("Hi");
    }

    // 메소드에서 리턴값은 오로지 return 문에 의해서만 생성

    public static void main(String[]args){
        int a = 3;
        int b = 4;

        Testsum myTest = new Testsum();
        int c = myTest.sum(a,b);
        System.out.println(c);

        String d = myTest.say();
        System.out.println(d);

        myTest.sum2(3,4);

        myTest.say2();


    }
    
}
