package day5.abstractLesson2;

public abstract class Car {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void writeSth();  //bez środka w metodzie
    public void setText(){ }
}
