class details{
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}

public class encapsulation {
    public static void main(String[] args) {
        details mine=new details();

        mine.setName("shyam");
        mine.setAge(21);

        mine.getName();
        mine.getAge();

    }
}
