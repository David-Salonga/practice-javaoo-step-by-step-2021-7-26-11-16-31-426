package practice06;

public class Klass {

    private String name;
    private int klass;



    public Klass( int klass) {
        this.klass = klass;
    }

    public Klass(String name, int klass) {
        this.name = name;
        this.klass = klass;
    }

    public int getNumber() {
        return klass;
    }



    public String getDisplayName() {
        return "Class " + klass;
    }
}
