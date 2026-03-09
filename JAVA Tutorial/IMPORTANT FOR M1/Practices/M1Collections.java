import java.util.*;

public class M1Collections {

    private Map<String, LinkedHashMap<String, Integer>> data = new HashMap<>();

    // CREATE (add new outer key)
    public void create(String outerKey) {
        data.putIfAbsent(outerKey, new LinkedHashMap<>());
    }

    // INSERT / UPDATE inner value
    public void put(String outerKey, String innerKey, int value) {
        data.computeIfAbsent(outerKey, k -> new LinkedHashMap<>())
            .put(innerKey, value);
    }

    // READ
    public Integer get(String outerKey, String innerKey) {
        if (data.containsKey(outerKey)) {
            return data.get(outerKey).get(innerKey);
        }
        return null;
    }

    // DELETE inner key
    public void deleteInner(String outerKey, String innerKey) {
        if (data.containsKey(outerKey)) {
            data.get(outerKey).remove(innerKey);
        }
    }

    // DELETE outer key
    public void deleteOuter(String outerKey) {
        data.remove(outerKey);
    }

    // FIND outer key which contains the highest integer value
    public String getOuterKeyWithHighestValue() {

        String resultKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, LinkedHashMap<String, Integer>> outer : data.entrySet()) {

            for (Integer value : outer.getValue().values()) {

                if (value > maxValue) {
                    maxValue = value;
                    resultKey = outer.getKey();
                }
            }
        }

        return resultKey;
    }

    public void print() {
        System.out.println(data);
    }

    public static void main(String[] args) {

        M1Collections manager = new M1Collections();

        manager.put("GroupA", "A1", 10);
        manager.put("GroupA", "A2", 30);
        manager.put("GroupB", "B1", 50);
        manager.put("GroupC", "C1", 25);

        manager.print();

        System.out.println("Highest value belongs to outer key: "
                + manager.getOuterKeyWithHighestValue());
    }
}