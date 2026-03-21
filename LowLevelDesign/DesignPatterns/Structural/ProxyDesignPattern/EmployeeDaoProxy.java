package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    private EmployeeDao empDaoObj;
    private String clientRole;

    public EmployeeDaoProxy(String clientRole){
        empDaoObj = new EmployeeDaoImpl();
        this.clientRole = clientRole;
    }

    @Override
    public void getEmployeeInfo(int empId) {
        if(clientRole.equals("ADMIN") || clientRole.equals("CLIENT")){
            empDaoObj.getEmployeeInfo(empId);
        }else{
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public void createEmployee(EmployeeDo obj) {
        if(clientRole.equals("ADMIN") ){
            empDaoObj.createEmployee(obj);
        }else{
            throw new RuntimeException("Access Denied");
        }
    }
}
