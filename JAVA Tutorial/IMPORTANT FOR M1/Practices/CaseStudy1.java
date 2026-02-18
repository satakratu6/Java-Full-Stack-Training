// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;

class WebInsight {

    private String siteId;
    private String region;
    private int dailyVisitors;
    private double totalClicks;

    public WebInsight() {}

    public WebInsight(String siteId, String region, int dailyVisitors, double totalClicks) {
        this.siteId = siteId;
        this.region = region;
        this.dailyVisitors = dailyVisitors;
        this.totalClicks = totalClicks;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getDailyVisitors() {
        return dailyVisitors;
    }

    public void setDailyVisitors(int dailyVisitors) {
        this.dailyVisitors = dailyVisitors;
    }

    public double getTotalClicks() {
        return totalClicks;
    }

    public void setTotalClicks(double totalClicks) {
        this.totalClicks = totalClicks;
    }

    public String toString() {
        return siteId;
    }
}

class WebInsightBusinessLogic{
    public void addInsight(Map<String, WebInsight> insightMap, WebInsight insight){
        insightMap.put(insight.getSiteId(),insight);
    }
    public void removeInsight(Map<String, WebInsight> insightMap, String siteId){
        insightMap.remove(siteId);
    }
    public double getTotalClicks(Map<String, WebInsight> insightMap){
        return insightMap.values().stream().mapToDouble(WebInsight::getTotalClicks).sum();
    }
    public WebInsight getSiteWithMostVisitors(Map<String, WebInsight> insightMap){
        return insightMap.values().stream().max(Comparator.comparingInt(WebInsight::getDailyVisitors)).orElse(null);
    }
    public List<WebInsight> getInsightsSortedByVisitors(Map<String, WebInsight> insightMap){
        return insightMap.values().stream().sorted(Comparator.comparingInt(WebInsight::getDailyVisitors)).collect(Collectors.toList());
    }
    public Map<String, List<WebInsight>> groupByRegion(Map<String, WebInsight> insightMap){
        return insightMap.values().stream().collect(Collectors.groupingBy(WebInsight::getRegion));
    }


}


public class CaseStudy1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, WebInsight> insightMap = new HashMap<>();
        WebInsightBusinessLogic logic = new WebInsightBusinessLogic();

        while(true){

            System.out.println("1. Add Insight");
            System.out.println("2. Remove Insight");
            System.out.println("3. Total Clicks");
            System.out.println("4. Site With Most Visitors");
            System.out.println("5. Sort By Visitors");
            System.out.println("6. Group By Region");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.println("Enter the site ID");
                    String id = sc.nextLine();

                    System.out.println("Enter the region");
                    String region = sc.nextLine();

                    System.out.println("Enter daily visitors");
                    int visitors = sc.nextInt();

                    System.out.println("Enter total clicks");
                    double clicks = sc.nextDouble();
                    sc.nextLine();

                    WebInsight insight = new WebInsight(id, region, visitors, clicks);
                    logic.addInsight(insightMap, insight);
                    break;

                case 2:
                    System.out.println("Enter the site ID");
                    String removeId = sc.nextLine();
                    logic.removeInsight(insightMap, removeId);
                    break;

                case 3:
                    double total = logic.getTotalClicks(insightMap);
                    if(total == -1)
                        System.out.println("The map is empty");
                    else
                        System.out.println(total);
                    break;

                case 4:
                    WebInsight top = logic.getSiteWithMostVisitors(insightMap);
                    if(top == null)
                        System.out.println("The map is empty");
                    else
                        System.out.println(top);
                    break;

                case 5:
                    List<WebInsight> sorted = logic.getInsightsSortedByVisitors(insightMap);
                    if(sorted.isEmpty())
                        System.out.println("The map is empty");
                    else
                        sorted.forEach(System.out::println);
                    break;

                case 6:
                    Map<String, List<WebInsight>> grouped = logic.groupByRegion(insightMap);
                    if(grouped.isEmpty())
                        System.out.println("The map is empty");
                    else
                        System.out.println(grouped);
                    break;

                case 7:
                    System.out.println("Thank you for using the application");
                    return;
            }
        }
    }
}
