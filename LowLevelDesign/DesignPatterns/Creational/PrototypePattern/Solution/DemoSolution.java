package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.PrototypePattern.Solution;

public class DemoSolution {

    public static void main(String[] args){
        System.out.println("=========Prototype Design Pattern=========");

        // Create initial prototypes (expensive operations)
        Student student = new Student(5,"Rita","CSE",224);
        student.printDetails();

        // Clone objects (fast operations)
        Student studentClone = (Student) student.clone();
        studentClone.setInHighSchool(true);
        studentClone.printDetails();
        System.out.println("Same Object? "+ (student == studentClone));
    }
    
}
