package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.PrototypePattern.Solution;

public class Student implements StudentPrototype{
    
    int id;
    String name;
    String branch;
    boolean inHighSchool;
    private int rollNo;

    Student(){

    }

    Student(int id,String name,String branch,int rollNo){
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.rollNo = rollNo;
    }
    
    public void setInHighSchool(boolean inHighSchool){
        this.inHighSchool = inHighSchool;

    }

    public void printDetails(){
        System.out.println("====Student Details=====");
        System.out.println(this + ": ");
        System.out.println("Id: " + id + ", Name: " + name + ", Branch: " + branch + ", Roll No: " + rollNo);
    }


    @Override
    public StudentPrototype clone() {
       return new Student(id,name,branch,rollNo);
    }
}
