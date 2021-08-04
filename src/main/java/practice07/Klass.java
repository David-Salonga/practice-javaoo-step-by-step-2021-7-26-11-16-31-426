package practice07;

public class Klass {
//    private static String leader;
    private String name;
    private Integer klass;
    private String leader;




    public Klass( int klass) {
        this.klass = klass;
    }

    public Klass(String name, int klass) {
        this.name = name;
        this.klass = klass;
    }




    public Integer getNumber() {
       return klass;
    }

    public String getDisplayName() {
        return "Class " + klass;
    }

//    public static void main(String[] args) {
//        assignLeader(new Student(1, "James", 8));
//    }

    public Student assignLeader(Student student) {
        leader = student.getName();
//        System.out.println(leader);
        return student;
    }

    public boolean getLeader() {
        Student student = assignLeader(new Student(1, "Jerry", 8));

        if (leader.equals(student.getName())){
            return true;
        } return false;
    }






//    The klass attribute is an Object which has number and leader attribute. But the leader attribute is not in the constructor.
//    When you build an instance of Student you need pass the Klass instance to the constructor of Student.
//    You can find more details in the test case. The Klass has an assignLeader method, which will take an instance of Student as parameter.
//    It means setting that student as the leader of the Klass. If the leader of Klass is Tom, then Tom calls the introduce method should return:


}
