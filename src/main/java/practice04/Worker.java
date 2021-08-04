package practice04;

public class Worker {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Worker. I have a job.", name, age);

        //"My name is Tom. I am 21 years old. I am a Worker. I have a job."
//        String.format("My name is %s. I am %d years old.", name, age);
    }
}
