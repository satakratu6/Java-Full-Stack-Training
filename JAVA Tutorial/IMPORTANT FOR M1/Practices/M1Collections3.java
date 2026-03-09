import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class StockManager {

    private Map<String, List<Double>> stockPrices = new HashMap<>();

    public void addStockPrice(String stock, double price) {
        stockPrices.putIfAbsent(stock, new ArrayList<>());
        stockPrices.get(stock).add(price);
    }

    public String getStockTrend(String stock) {
        if (!stockPrices.containsKey(stock) || stockPrices.get(stock).isEmpty()) {
            return "No data";
        }

        List<Double> p = stockPrices.get(stock);
        boolean inc = true, dec = true, same = true;

        for (int i = 1; i < p.size(); i++) {
            if (p.get(i) <= p.get(i - 1)) inc = false;
            if (p.get(i) >= p.get(i - 1)) dec = false;
            if (!p.get(i).equals(p.get(i - 1))) same = false;
        }

        if (same) return "Stable";
        if (inc) return "Increasing";
        if (dec) return "Decreasing";
        return "Mixed";
    }

    public String getHighestPrice(String stock) {
        if (!stockPrices.containsKey(stock) || stockPrices.get(stock).isEmpty()) {
            return "No data";
        }

        double mx = Collections.max(stockPrices.get(stock));
        return String.format("%.2f", mx);
    }

    public void removeStock(String stock) {
        stockPrices.remove(stock);
    }
}

public class M1Collections3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockManager m = new StockManager();

        int n = Integer.parseInt(sc.nextLine());
        List<String> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] cmd = sc.nextLine().split(" ");

            switch (cmd[0]) {
                case "addStockPrice":
                    m.addStockPrice(cmd[1], Double.parseDouble(cmd[2]));
                    break;

                case "removeStock":
                    m.removeStock(cmd[1]);
                    break;

                case "getStockTrend":
                    res.add(m.getStockTrend(cmd[1]));
                    break;

                case "getHighestPrice":
                    res.add(m.getHighestPrice(cmd[1]));
                    break;
            }
        }

        for (String s : res) {
            System.out.println(s);
        }
    }
}