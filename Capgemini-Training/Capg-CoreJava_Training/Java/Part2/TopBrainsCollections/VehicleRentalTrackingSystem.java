package TopBrainsCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VehicleRentalTrackingSystem {
    public static void main(String[] args) {

        List<Rental> list = new ArrayList<>();

        list.add(new Rental("R001", "Sedan", "John", "09:00", "10:00"));
        list.add(new Rental("R002", "Sedan", "Sarah", "09:30", "10:30"));
        list.add(new Rental("R003", "Sedan", "Mark", "11:00", "12:00"));
        list.add(new Rental("R004", "SUV", "Emma", "08:00", "09:00"));
        list.add(new Rental("R005", "SUV", "John", "09:00", "10:00"));
        list.add(new Rental("R006", "SUV", "Sarah", "10:00", "11:00"));

        Map<String, List<Rental>> map = new LinkedHashMap<>();
        Set<String> employees = new HashSet<>();

        for (Rental r : list) {
            map.computeIfAbsent(r.getVehicleType(), k -> new ArrayList<>()).add(r);
            employees.add(r.getEmployeeName());
        }

        System.out.println("--- Rentals Grouped by Vehicle Type ---\n");

        for (String vehicle : map.keySet()) {
            System.out.println("Vehicle: " + vehicle);
            for (Rental r : map.get(vehicle)) {
                System.out.println(r.getRentalId() + " - " + r.getEmployeeName()
                        + " - " + r.getStartTime() + " to " + r.getEndTime());
            }
            System.out.println();
        }

        System.out.println("--- Unique Employees ---");
        for (String e : employees) {
            System.out.println(e);
        }

        System.out.println("\n--- Total Hours Rented Per Vehicle Type ---");
        for (String vehicle : map.keySet()) {
            double total = 0;
            for (Rental r : map.get(vehicle)) {
                total += r.getDuration();
            }
            System.out.println(vehicle + " - " + total + " hours");
        }

        System.out.println("\n--- Conflicting Rentals ---");
        for (String vehicle : map.keySet()) {
            List<Rental> rentals = map.get(vehicle);
            boolean found = false;

            for (int i = 0; i < rentals.size(); i++) {
                for (int j = i + 1; j < rentals.size(); j++) {
                    if (rentals.get(i).conflictsWith(rentals.get(j))) {
                        if (!found) {
                            System.out.println("Vehicle " + vehicle + ":");
                            found = true;
                        }
                        System.out.println("Conflict between " +
                                rentals.get(i).getRentalId() + " (" +
                                rentals.get(i).getStartTime() + "–" +
                                rentals.get(i).getEndTime() + ") and " +
                                rentals.get(j).getRentalId() + " (" +
                                rentals.get(j).getStartTime() + "–" +
                                rentals.get(j).getEndTime() + ")");
                    }
                }
            }
        }
    }
}


class Rental {
    private String rentalId;
    private String vehicleType;
    private String employeeName;
    private String startTime;
    private String endTime;

    public Rental(String rentalId, String vehicleType, String employeeName, String startTime, String endTime) {
        this.rentalId = rentalId;
        this.vehicleType = vehicleType;
        this.employeeName = employeeName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getRentalId() { return rentalId; }
    public String getVehicleType() { return vehicleType; }
    public String getEmployeeName() { return employeeName; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }

    private int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    public double getDuration() {
        return (toMinutes(endTime) - toMinutes(startTime)) / 60.0;
    }

    public boolean conflictsWith(Rental other) {
        int start1 = toMinutes(this.startTime);
        int end1 = toMinutes(this.endTime);
        int start2 = toMinutes(other.startTime);
        int end2 = toMinutes(other.endTime);

        return start1 < end2 && start2 < end1;
    }
}
