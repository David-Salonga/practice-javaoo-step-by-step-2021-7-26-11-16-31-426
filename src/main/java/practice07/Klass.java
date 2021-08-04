package practice07;

public class Klass {
    private String name;
    private Integer klass;



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
}
