class calculator{
    public void add(){
        System.out.println("Add is called");
    }

    public int add(int num1,int num2){
        return num1+num2;
    }
}

class methods{
    public static void main(String a[]){
calculator calc=new calculator();
calc.add();

int result=calc.add(4,5);
System.out.println(result);
    }
}