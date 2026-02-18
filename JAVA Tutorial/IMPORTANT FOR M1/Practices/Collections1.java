import java.util.*;

class Employee {
    int id;
    String designation;

    Employee(int id, String designation) {
        this.id = id;
        this.designation = designation;
    }
}

class EmployeeManager {

    ArrayList<Employee> list = new ArrayList<>();
    ArrayList<Employee> updatedList = new ArrayList<>();

    void add(int id, String designation) {
        list.add(new Employee(id, designation));
    }

    void update(int id, String newDesignation) {
        for (Employee e : list) {
            if (e.id == id) {
                e.designation = newDesignation;
                updatedList.add(e);
            }
        }
    }

    void showUpdates() {
        for (Employee e : updatedList) {
            System.out.println(e.id + " " + e.designation);
        }
    }
}

public class Collections1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (sc.hasNext()) {
            String action = sc.next();

            if (action.equals("A")) {
                int id = sc.nextInt();
                String designation = sc.nextLine().trim();
                manager.add(id, designation);
            } 
            else if (action.equals("U")) {
                int id = sc.nextInt();
                String newDesignation = sc.nextLine().trim();
                manager.update(id, newDesignation);
            }
        }

        manager.showUpdates();
    }
}
