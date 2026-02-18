enum ShiftType {
    MORNING("09:00", "17:00"),
    EVENING("14:00", "22:00"),
    NIGHT("22:00", "06:00");

    private final String startTime;
    private final String endTime;

    ShiftType(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getTiming() {
        return startTime + " - " + endTime;
    }
}

class Employee {
    private String employeeId;
    private String employeeName;
    private ShiftType assignedShift;

    public Employee(String employeeId, String employeeName, ShiftType assignedShift) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.assignedShift = assignedShift;
    }

    public String getShiftInfo() {
        return "Employee " + employeeId +
               " works in " + assignedShift +
               " shift (" + assignedShift.getTiming() + ")";
    }
}

class AttendanceService {

    public void markAttendance(Employee employee) {
        System.out.println("Attendance marked for " + employee.getShiftInfo());
    }

    public void displayShiftDetails(Employee employee) {
        System.out.println(employee.getShiftInfo());
    }
}

public class Solution {
    public static void main(String[] args) {

        AttendanceService service = new AttendanceService();

        Employee e1 = new Employee("E101", "Rahul", ShiftType.MORNING);
        service.displayShiftDetails(e1);
        service.markAttendance(e1);

        Employee e2 = new Employee("E102", "Anita", ShiftType.NIGHT);
        service.displayShiftDetails(e2);
        service.markAttendance(e2);
    }
}
