package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void getEmployeeInfo(int empId) {
        System.out.println("Fetching Employee info for ID : "+empId);
    }

    @Override
    public void createEmployee(EmployeeDo obj) {
        System.out.println("Creating Employee: "+obj);
    }
    
}
