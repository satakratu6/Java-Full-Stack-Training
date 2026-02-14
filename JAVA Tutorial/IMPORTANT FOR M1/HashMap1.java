// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Salary{
    static HashMap<String, Integer> empList=new HashMap<>();
    public int totalSalary(){
        int sum=0;
        for(int k:empList.values()){
            sum+=k;
        }
        return sum;
    }
    public String getSalary(String designation){
        for(String des: empList.keySet()){
            if(designation.equals(des)){
                return "Salary is "+empList.get(des);
            } 
        }
        return "No designation Match";
    }
    public void updateSalary(String designation, int newSalary){
        for(String des:empList.keySet()){
            if(designation.equals(des)){
                empList.put(des, newSalary);
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        Salary obj=new Salary();
        obj.empList.put("CEO",20000);
        obj.empList.put("Developer",5000);
        System.out.println(obj.totalSalary());
        obj.updateSalary("Developer", 6000);
        System.out.println(obj.getSalary("Developer"));
    }
}