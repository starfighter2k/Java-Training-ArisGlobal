

public class MyThread2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employee employee = new Employee();
        employee.setBasic(1000);
        DAThread daThread = new DAThread(employee);
        HRAThread hraThread = new HRAThread(employee);
        Thread thread1 = new Thread(daThread);
        Thread thread2 = new Thread(hraThread);
        thread1.start();
        thread2.start();
        try {
//			Thread.sleep(10000);
        	thread1.join();
        	thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        employee.setNetSal(employee.getBasic() + employee.getDa() +
                employee.getHra());
        System.out.println("Net Salary : " + employee.getNetSal());
    }

}