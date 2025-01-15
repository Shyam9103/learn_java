
class Mobile{
    int price;
    String type;
    static String name;

    static{
        name="smartphone";
        System.out.println("static called");
    }
    public void show(){
        System.out.println("price is "+ price +"and " + "type is "+type + "and name is "+name);
    }

    public static void show1(){
        System.out.println("Im in static method");
    }
}
public class staticvar {
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        Mobile obj2=new Mobile();

        obj1.price=13000;
        obj2.price=12000;
        obj1.type="Samsung";
        obj2.type="nokia";
        obj1.name="smart";
        obj2.name="phone";
        obj1.show();
        obj2.show();
        Mobile.show1();
    }
}
