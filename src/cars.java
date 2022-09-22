public class cars {
    String brand;
    String color;
    String modelName;
    int modelYear;
    public void EngineFunction(){
        System.out.println("1000 cc");
    }
}
class benz extends cars{

    public void EngineFunction(){
        System.out.println("1200 cc");
    }

}
class bmw extends cars{

    public void EngineFunction(){
        System.out.println("2200 cc");
    }

}
class main extends cars{

    public static void main(String[] args) {
        cars c= new cars();
        c.EngineFunction();

        cars c1=new benz();
        c1.EngineFunction();

        bmw c2=new bmw();
        c2.EngineFunction();
    }
}
