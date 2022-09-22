public class Inheri {
    String color;
    String brand;
    String modelName;
    int modelYear;
    public void EngineCapacity(){
        System.out.println("2000cc");
    }
}

class Car extends Inheri
{
    public static void main(String[] args) {
        Car bmw=new Car();

        bmw.modelName="3 series";
        bmw.color="black";
        bmw.modelYear=2022;
        System.out.println(bmw.brand);
        System.out.println(bmw.modelName);
        System.out.println(bmw.color);
        System.out.println(bmw.modelYear);
        bmw.EngineCapacity();
    }
}
