package practice06;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;

    }


    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.", getName(), getAge(), getKlass().getDisplayName());

        //"My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."
    }
}
