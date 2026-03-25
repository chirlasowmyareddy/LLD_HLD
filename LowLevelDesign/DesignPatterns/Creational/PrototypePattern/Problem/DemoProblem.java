package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.PrototypePattern.Problem;

public class DemoProblem {

    public static void main(String[] args){
        Student studentOrg = new Student(1,"Aman","CSE",123);
        studentOrg.printDetails();

        Student studentClone = new Student();
        studentClone.id = studentOrg.id;
        studentClone.branch = studentOrg.branch;
        studentClone.name =  studentOrg.name;
        // studentClone.rollNo = studentOrg.rollNo;//compilation error
    }
    
}
