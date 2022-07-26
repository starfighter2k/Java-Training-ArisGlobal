class Employee {
    private int basic;
    private double da;
    private double hra;
    private double netSal;
    public int getBasic() {
        return basic;
    }
    public void setBasic(int basic) {
        this.basic = basic;
    }
    public double getDa() {
        return da;
    }
    public void setDa(double da) {
        this.da = da;
    }
    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }
    public double getNetSal() {
        return netSal;
    }
    public void setNetSal(double netSal) {
        this.netSal = netSal;
    }
   
   
}
class DAThread extends Thread {
    private Employee employee;
    public DAThread(Employee employee) {
        this.employee = employee;
    }
    public void run() {
        double resDA = 0;
        resDA = .5 * employee.getBasic();
        employee.setDa(resDA);
    }
}
class HRAThread extends Thread {
    private Employee employee;
    public HRAThread(Employee employee) {
        this.employee = employee;
    }
    public void run() {
        double resHRA = 0;
        resHRA = .5 * employee.getBasic();
        employee.setHra(resHRA);
    }
}
