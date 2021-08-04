package practice06;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;

    }

    public Teacher(String name, int age) {
        super(name, age);

    }


    public Klass getKlass() {
        return klass;
    }

    public String introduce() {

    if(klass != null){
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.", getName(), getAge(), getKlass().getDisplayName());
    } else
    return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", getName(), getAge());

        //"My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."
    }
}
