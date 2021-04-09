public class HouseDog extends Dog {
    
    public HouseDog(String name) {
        this.setName(name);
    }  // 생성자 : 1 메소드명이 클래스명과 동일
       //       : 2 return 이 없다.

    public HouseDog(int type){
        if (type==1){
            this.setName("yorkshire");
        } else if (type==2){
            this.setName("bulldog");
        }
    }

    public void sleep() {
        System.out.println(this.name+" zzz in house");
    } 

    public void sleep(int hour){
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(yorkshire.name);
}
}