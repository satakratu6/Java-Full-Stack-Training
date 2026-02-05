package TopBrainsCollections;

import java.util.*;

class Vehicle {

    private String vehicleNumber;
    private String type;
    private String checkpoint;
    private long timestamp;

    Vehicle(String vehicleNumber, String type, String checkpoint, long timestamp){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.checkpoint = checkpoint;
        this.timestamp = timestamp;
    }

    public String getVehicleNumber(){ return vehicleNumber; }
    public String getType(){ return type; }
    public String getCheckpoint(){ return checkpoint; }
    public long getTimestamp(){ return timestamp; }

    public String toString(){
        return "Vehicle[" + vehicleNumber + ", " + type + ", " + checkpoint + ", " + timestamp + "]";
    }

    public int hashCode(){
        return Objects.hash(vehicleNumber, timestamp);
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Vehicle)) return false;
        Vehicle v = (Vehicle)o;
        return vehicleNumber.equals(v.vehicleNumber) && timestamp == v.timestamp;
    }
}

public class SmartCityTrafficManagementSystem{

    private ArrayList<Vehicle> logs = new ArrayList<>();
    private LinkedList<Vehicle> lastEntries = new LinkedList<>();
    private HashMap<String, List<Vehicle>> checkpointMap = new HashMap<>();
    private HashMap<String, Vehicle> vehicleLookup = new HashMap<>();

    private PriorityQueue<Vehicle> emergencyQueue =
            new PriorityQueue<>((a,b) -> priority(b) - priority(a));

    private static int priority(Vehicle v){
        if(v.getType().equalsIgnoreCase("Ambulance")) return 3;
        if(v.getType().equalsIgnoreCase("FireTruck")) return 2;
        return 1;
    }

    private void addEntry(String number, String type, String checkpoint){

        long time = 1699999999999L;
        Vehicle v = new Vehicle(number, type, checkpoint, time);

        logs.add(v);
        vehicleLookup.put(number, v);

        checkpointMap.computeIfAbsent(checkpoint, k -> new ArrayList<>()).add(v);

        lastEntries.add(v);
        if(lastEntries.size() > 5) lastEntries.removeFirst();

        if(priority(v) > 1) emergencyQueue.offer(v);

        System.out.println("Entry added!");
    }

    private void removeDuplicates(){

        HashSet<Vehicle> set = new HashSet<>(logs);
        logs.clear();
        logs.addAll(set);

        checkpointMap.clear();

        for(Vehicle v : logs){
            checkpointMap.computeIfAbsent(v.getCheckpoint(), k -> new ArrayList<>()).add(v);
        }

        System.out.println("Duplicates removed!");
    }

    private void displayByCheckpoint(Scanner sc){

        System.out.print("Enter checkpoint name: ");
        String cp = sc.nextLine();

        List<Vehicle> list = checkpointMap.get(cp);

        if(list == null){
            System.out.println("No vehicles found.");
            return;
        }

        System.out.println("Vehicles at " + cp + ":");
        list.forEach(System.out::println);
    }

    private void processEmergencyQueue(){

        if(emergencyQueue.isEmpty()){
            System.out.println("No emergency vehicles.");
            return;
        }

        System.out.println("Processing emergency vehicle:");
        System.out.println(emergencyQueue.poll());
    }

    private void trafficReport(){

        System.out.println("--- Traffic Report ---");
        System.out.println("Checkpoint congestion:");

        HashMap<String,Integer> countMap = new HashMap<>();

        for(Vehicle v : logs){
            countMap.put(v.getCheckpoint(),
                    countMap.getOrDefault(v.getCheckpoint(),0)+1);
        }

        String busiest = null;
        String least = null;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Map.Entry<String,Integer> e : countMap.entrySet()){

            System.out.println(e.getKey() + ": " + e.getValue());

            if(e.getValue() > max){
                max = e.getValue();
                busiest = e.getKey();
            }

            if(e.getValue() < min){
                min = e.getValue();
                least = e.getKey();
            }
        }

        if(busiest != null){
            System.out.println("Busiest: " + busiest);
            System.out.println("Least Busy: " + least);
        }
    }

    private void showLast5(){

        System.out.println("Last 5 vehicles:");
        for(Vehicle v : lastEntries){
            System.out.println(v);
        }
    }

    public static void main(String[] args){

        SmartCityTrafficManagementSystem app = new SmartCityTrafficManagementSystem();
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n=== SMART CITY TRAFFIC MANAGEMENT ===");
            System.out.println("1. Add Vehicle Entry");
            System.out.println("2. Remove Duplicates");
            System.out.println("3. Display Vehicles by Checkpoint");
            System.out.println("4. Process Emergency Vehicle Queue");
            System.out.println("5. Traffic Report");
            System.out.println("6. Show Last 5 Vehicles");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int ch = Integer.parseInt(sc.nextLine());

            switch(ch){

                case 1:
                    System.out.print("Vehicle Number: ");
                    String num = sc.nextLine();

                    System.out.print("Type (Car/Bike/Ambulance/FireTruck): ");
                    String type = sc.nextLine();

                    System.out.print("Checkpoint: ");
                    String cp = sc.nextLine();

                    app.addEntry(num,type,cp);
                    break;

                case 2:
                    app.removeDuplicates();
                    break;

                case 3:
                    app.displayByCheckpoint(sc);
                    break;

                case 4:
                    app.processEmergencyQueue();
                    break;

                case 5:
                    app.trafficReport();
                    break;

                case 6:
                    app.showLast5();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
