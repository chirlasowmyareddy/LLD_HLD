package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.ProxyDesignPattern;

public class EmployeeManagementDemo {
    public static void main(String[] args){
        System.out.println("=============Proxy Design Pattern===============");

        EmployeeDao userProxyObj = new EmployeeDaoProxy("ADMIN");
        userProxyObj.getEmployeeInfo(1);//access granted
        userProxyObj.createEmployee(new EmployeeDo());//access denied

    }
}
