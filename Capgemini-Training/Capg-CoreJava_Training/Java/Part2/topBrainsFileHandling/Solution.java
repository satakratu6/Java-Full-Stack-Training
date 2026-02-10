import java.io.*;
import java.util.*;

public class Solution {

    private static final String FILE_NAME = "quotes.txt";

    public static void addQuote(Scanner sc) {

        try(FileWriter fw = new FileWriter(FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.print("Enter quote: ");
            String quote = sc.nextLine();

            bw.write(quote);
            bw.newLine();

            System.out.println("Quote added successfully!");

        } catch(IOException e){
            System.out.println("Error writing file.");
        }
    }

    public static List<String> readQuotes(){

        List<String> quotes = new ArrayList<>();

        File file = new File(FILE_NAME);

        if(!file.exists()){
            return quotes;
        }

        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;

            while((line = br.readLine()) != null){
                quotes.add(line);
            }

        }catch(IOException e){
            System.out.println("Error reading file.");
        }

        return quotes;
    }

    public static void viewQuotes(){

        List<String> quotes = readQuotes();

        System.out.println("---- All Quotes ----");

        if(quotes.isEmpty()){
            System.out.println("No quotes available.");
            return;
        }

        for(String q : quotes){
            System.out.println(q);
        }
    }

    public static void searchQuotes(Scanner sc){

        List<String> quotes = readQuotes();

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine().toLowerCase();

        System.out.println("---- Search Results ----");

        boolean found = false;

        for(String q : quotes){

            if(q.toLowerCase().contains(keyword)){
                System.out.println(q);
                found = true;
            }
        }

        if(!found){
            System.out.println("No results found.");
        }
    }

    public static void sortQuotes(){

        List<String> quotes = readQuotes();

        if(quotes.isEmpty()){
            System.out.println("No quotes to sort.");
            return;
        }

        Collections.sort(quotes);

        System.out.println("---- Sorted Quotes ----");

        for(String q : quotes){
            System.out.println(q);
        }

        try(PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))){

            for(String q : quotes){
                pw.println(q);
            }

        }catch(IOException e){
            System.out.println("Error updating file.");
        }
    }

    public static void quoteOfTheDay(){

        List<String> quotes = readQuotes();

        if(quotes.isEmpty()){
            System.out.println("No quotes available.");
            return;
        }

        Random rand = new Random();

        String quote = quotes.get(rand.nextInt(quotes.size()));

        System.out.println("---- Quote of the Day ----");
        System.out.println(quote);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n=== Digital Library for Quotes ===");
            System.out.println("1. Add Quote");
            System.out.println("2. View All Quotes");
            System.out.println("3. Search Quotes");
            System.out.println("4. Sort Quotes");
            System.out.println("5. Quote of the Day");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){

                case 1:
                    addQuote(sc);
                    break;

                case 2:
                    viewQuotes();
                    break;

                case 3:
                    searchQuotes(sc);
                    break;

                case 4:
                    sortQuotes();
                    break;

                case 5:
                    quoteOfTheDay();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
