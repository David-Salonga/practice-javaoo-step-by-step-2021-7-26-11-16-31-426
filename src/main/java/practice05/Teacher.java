package practice05;

public class Teacher extends Person{

    private int klass;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }


    public int getKlass() {
        return klass;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", getName(), getAge(), klass);
//                "My name is " + name + ". I am " + age + " years old.";
    }
}
