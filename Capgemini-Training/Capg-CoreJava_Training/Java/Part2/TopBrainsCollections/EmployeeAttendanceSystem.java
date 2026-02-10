package TopBrainsCollections;

public class EmployeeAttendanceSystem {

	public static void main(String[] args) {
		Employee emp1=new Employee(1, "Ravi", 22,"18");
		Employee emp2=new Employee(2, "Meena", 22,"15");
		Employee emp3=new Employee(3, "Ravi", 22,"null");
		AttendanceService a=new AttendanceService();
		a.isSalaryEligible(emp1);
		a.isSalaryEligible(emp2);
		a.isSalaryEligible(emp3);
	}

}

class Employee{
	int employeeId;
	String employeeName;
	Integer totalWorkingDays;
	String daysPresent;
	public Employee(int employeeId, String employeeName, Integer totalWorkingDays, String daysPresent) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.totalWorkingDays = totalWorkingDays;
		this.daysPresent = daysPresent;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getTotalWorkingDays() {
		return totalWorkingDays;
	}
	public void setTotalWorkingDays(Integer totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}
	public String getDaysPresent() {
		return daysPresent;
	}
	public void setDaysPresent(String daysPresent) {
		this.daysPresent = daysPresent;
	}
	
	
}

class AttendanceService {

    public Integer parseAttendance(String daysPresent) {
        if (daysPresent == null || daysPresent.equalsIgnoreCase("null")) {
            return 0;
        }
        return Integer.parseInt(daysPresent);
    }

    public int calculateAttendancePercentage(Employee e) {
        if (e.getTotalWorkingDays() == null || e.getTotalWorkingDays() == 0) {
            return 0;
        }
        return (parseAttendance(e.getDaysPresent()) * 100) / e.getTotalWorkingDays();
    }

    public void isSalaryEligible(Employee e) {
        int percentage = calculateAttendancePercentage(e);

        if (percentage > 75) {
            System.out.println("Employee: " + e.getEmployeeName() + " --> Attendance: " + percentage + "% --> Salary Eligible");
        } else {
            System.out.println("Employee: " + e.getEmployeeName() + " --> Attendance: " + percentage + "% --> Not Eligible");
        }
    }
}
