import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

class BeeHive{
    private String hiveId;
    private String location;
    private int numberOfBees;
    private double honeyProduced;

    public BeeHive(String hiveId, String location, int numberOfBees, double honeyProduced) {
        this.hiveId = hiveId;
        this.location = location;
        this.numberOfBees = numberOfBees;
        this.honeyProduced = honeyProduced;
    }

    public String getHiveId() {
        return hiveId;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfBees() {
        return numberOfBees;
    }

    public double getHoneyProduced() {
        return honeyProduced;
    }

    public String toString() {
        return "HiveID: " + hiveId +
                ", Location: " + location +
                ", Bees: " + numberOfBees +
                ", Honey: " + honeyProduced;
    }
}

class BeeHiveBusinessLogic{

    public void addHive(Map<String, BeeHive> hiveMap, BeeHive hive) {
        hiveMap.put(hive.getHiveId(), hive);
    }

    public void removeHive(Map<String, BeeHive> hiveMap, String hiveId) {
        hiveMap.remove(hiveId);
    }

    public double getTotalHoney(Map<String, BeeHive> hiveMap) {
        return hiveMap.values()
                .stream()
                .mapToDouble(BeeHive::getHoneyProduced)
                .sum();
    }

    public BeeHive getHiveWithMostBees(Map<String, BeeHive> hiveMap) {
        return hiveMap.values()
                .stream()
                .max(Comparator.comparingInt(BeeHive::getNumberOfBees))
                .orElse(null);
    }

    public List<BeeHive> getHivesSortedByBees(Map<String, BeeHive> hiveMap){
        return hiveMap.values()
                .stream()
                .sorted(Comparator.comparingInt(BeeHive::getNumberOfBees))
                .collect(Collectors.toList());
    }

    public Map<String, List<BeeHive>> groupByLocation(Map<String, BeeHive> hiveMap){
        return hiveMap.values()
                .stream()
                .collect(Collectors.groupingBy(BeeHive::getLocation));
    }
}

public class CaseStudy2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, BeeHive> hiveMap = new HashMap<>();
        BeeHiveBusinessLogic logic = new BeeHiveBusinessLogic();

        while(true) {

            System.out.println("\n1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Total Honey");
            System.out.println("4. Most Bees");
            System.out.println("5. Sort");
            System.out.println("6. Group");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Hive ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter Number of Bees: ");
                    int bees = sc.nextInt();

                    System.out.print("Enter Honey Produced: ");
                    double honey = sc.nextDouble();

                    BeeHive hive = new BeeHive(id, location, bees, honey);
                    logic.addHive(hiveMap, hive);
                    System.out.println("Hive added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Hive ID to remove: ");
                    String removeId = sc.nextLine();
                    logic.removeHive(hiveMap, removeId);
                    System.out.println("Hive removed!");
                    break;

                case 3:
                    System.out.println("Total Honey Produced: " +
                            logic.getTotalHoney(hiveMap));
                    break;

                case 4:
                    BeeHive maxHive = logic.getHiveWithMostBees(hiveMap);
                    if(maxHive != null)
                        System.out.println("Hive with most bees:\n" + maxHive);
                    else
                        System.out.println("No hives available.");
                    break;

                case 5:
                    List<BeeHive> sorted = logic.getHivesSortedByBees(hiveMap);
                    sorted.forEach(System.out::println);
                    break;

                case 6:
                    Map<String, List<BeeHive>> grouped =
                            logic.groupByLocation(hiveMap);

                    grouped.forEach((loc, hives) -> {
                        System.out.println("\nLocation: " + loc);
                        hives.forEach(System.out::println);
                    });
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
