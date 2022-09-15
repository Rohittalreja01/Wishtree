
package inheritance;


public class Employee {

	     int empid;
	     String empName;
	     float salary;
	     
	     public void getEmplDetails(int empid,String empName,float salary)
	     {
	    	 this.empid=empid;
	    	 this.empName=empName;
	    	 this.salary=salary;
	     }
	     public void showEmpRecord()
	     {
	    	 System.out.println("employee id is:"+empid);
	    	 System.out.println("employee nameis"+empName);
	    	 System.out.println("employee salary is:"+salary);
	    	 
	     }
	     class Manager extends Employee
	     {
	    	 float incentive;
	    	 public void setIncentive(float incentive)
	    	 {
	    		 this.incentive=incentive;
	    	 }
	    	 public float getIncentive()
	    	 {
	    		 return incentive;
	    	 }
	    	 public void showManagerDetails()
	    	 {
	    		 showEmpRecord();
	    		 System.out.println("incentive is:"+getIncentive());
	    	 }
	     }

}
