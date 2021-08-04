package practice05;

public class Teacher extends Person{

    private Integer klass;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);


    }


    public Integer getKlass() {
        return klass;
    }

    public String introduce(){

        if (klass != null){
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", getName(), getAge(), klass);
        } else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", getName(), getAge());
//  "My name is " + name + ". I am " + age + " years old.";
    }

}
