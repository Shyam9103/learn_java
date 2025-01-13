
class A{

    public A(){
        System.out.println("Im in A.");
    }

    public A(int n){
        System.out.println("Im in A int " + n);
    }
}

class B extends A{

    public B(){
        System.out.println("Im in B.");
    }

    public B(int n){
        this();
        System.out.println("Im in B int " + n);

    }
}
public class inheritance {
    public static void main(String[] args) {
        B obj=new B(5);
    }
}

//key take aways super(),this(),extends.
