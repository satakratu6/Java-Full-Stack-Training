import java.util.*;
import java.util.stream.Collectors;

public class AnimalHabitat {

    private Map<String, String> habitatMap = new HashMap<>();

    public Map<String, String> getHabitatMap() {
        return habitatMap;
    }

    public void setHabitatMap(Map<String, String> habitatMap) {
        this.habitatMap = habitatMap;
    }

    public void add(String animalName, String habitatName) {
        habitatMap.put(animalName.toLowerCase(), habitatName);
    }

    public String search(String animalName) {
        return habitatMap.get(animalName.toLowerCase());
    }

    // ✅ GROUP BY HABITAT (STREAM)
    public Map<String, List<String>> groupByHabitat() {

        return habitatMap.entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        TreeMap::new,
                        Collectors.mapping(
                                e -> capitalize(e.getKey()),
                                Collectors.collectingAndThen(
                                        Collectors.toCollection(() ->
                                                new TreeSet<>(String.CASE_INSENSITIVE_ORDER)),
                                        ArrayList::new
                                )
                        )
                ));
    }

    // ✅ SORT ANIMALS
    public List<String> sortAnimalsByName() {

        return habitatMap.keySet()
                .stream()
                .map(this::capitalize)
                .distinct()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }

    // ✅ SORT HABITATS
    public List<String> sortHabitatsByName() {

        return habitatMap.values()
                .stream()
                .distinct()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }

    // ✅ FIND BY ANY FIELD
    public Map<String, String> findByAnyField(String query) {

        if(query == null || query.isBlank())
            return Collections.emptyMap();

        String q = query.toLowerCase();

        return habitatMap.entrySet()
                .stream()
                .filter(e ->
                        e.getKey().contains(q) ||
                        e.getValue().toLowerCase().contains(q)
                )
                .collect(Collectors.toMap(
                        e -> capitalize(e.getKey()),
                        Map.Entry::getValue
                ));
    }

    // ✅ FILTER BY PREFIX
    public List<String> filterAnimalsByPrefix(String prefix) {

        if(prefix == null || prefix.isBlank())
            return Collections.emptyList();

        String p = prefix.toLowerCase();

        return habitatMap.keySet()
                .stream()
                .filter(a -> a.startsWith(p))
                .map(this::capitalize)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }

    private String capitalize(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}

public class CaseStudy3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AnimalHabitat obj = new AnimalHabitat();

        while(true) {

            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.println("Enter the animal name");
                    String animal = sc.nextLine();

                    System.out.println("Enter the habitat name");
                    String habitat = sc.nextLine();

                    obj.add(animal, habitat);
                    break;

                case 2:

                    if(obj.getHabitatMap().isEmpty()) {
                        System.out.println("The map is empty");
                        break;
                    }

                    System.out.println("Enter the animal name");
                    String searchAnimal = sc.nextLine();

                    String result = obj.search(searchAnimal);

                    if(result == null) {
                        System.out.println("Data not found");
                    } else {
                        System.out.println(result);
                    }

                    break;

                case 3:
                    System.out.println("Thank you for using the application");
                    return;

                default:
                    // Option can only be 1-3, ignore others
                    break;
            }
        }
    }
}
