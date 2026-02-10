package topbrainsfunctional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeProductivityTracking {

	public static void main(String[] args) {
		List<ProductivityLog> list=new ArrayList<>();
		String logId[]= {"L01","L02","L03","L04","L05","L06","L07","L08","L09","L10"};
		String employeeName[]= {"Amit","Rohit","Neha","Amit","Rohit","Sneha","Neha","Amit","Sneha","Rohit"};
		String taskType[]= {"Coding","Testing","Design","Coding","Testing","Design","Coding","Testing","Coding","Design"};
		double hoursSpent[]= {6.5,3.0,7.0,4.0,6.0,2.5,5.5,2.0,3.0,8.0};
		for(int i=0;i<logId.length;i++) {
			list.add(new ProductivityLog(logId[i], employeeName[i], taskType[i], hoursSpent[i]));
		}
		System.out.println("--- Logs with More Than 5 Hours ---");
		list.stream()
		.filter(s->s.hoursSpent>5).forEach(s->System.out.println(s.logId+" - "+s.employeeName+" - "+s.taskType+" - "+s.hoursSpent));
		Map<String, Double> result =
			    list.stream()
			        .collect(Collectors.groupingBy(
			            ProductivityLog::getTaskType,
			            Collectors.summingDouble(ProductivityLog::getHoursSpent)
			        ));
		System.out.println();
		System.out.println("--- Total Hours per Task Type ---");
			result.forEach((task, totalHours) ->
			    System.out.println(task + " - " + totalHours+" hours")
			);
		System.out.println();
		
		Map.Entry<String, Double> topEmployee=
				list.stream()
					.collect(Collectors.groupingBy(
							ProductivityLog::getEmployeeName,
							Collectors.summingDouble(ProductivityLog::getHoursSpent)
							))
					.entrySet()
					.stream()
					.max(Map.Entry.comparingByValue())
					.orElse(null);
		System.out.println("--- Employee with Highest Total Hours ---");
		System.out.println(topEmployee.getKey()+" - "+topEmployee.getValue()+" hours");
		System.out.println();
//		list.stream()
//			.sorted(Comparator.comparingDouble(ProductivityLog::getHoursSpent).reversed())
//			.forEach(s->System.out.println(s.logId+" - "+s.employeeName+" - "+s.taskType+" - "+s.hoursSpent));
		
		list.stream()
	    .sorted(
	        Comparator
	            .comparingDouble(ProductivityLog::getHoursSpent)
	            .reversed()
	            .thenComparing(ProductivityLog::getLogId)
	    )
	    .forEach(s ->
	        System.out.println(
	            s.getLogId() + " - " +
	            s.getEmployeeName() + " - " +
	            s.getTaskType() + " - " +
	            s.getHoursSpent()
	        )
	    );

		System.out.println();
		System.out.println("--- Mapped Formatted Strings ---");
		list.stream()
	    .map(s -> s.employeeName + " spent " +
	              s.hoursSpent + " hours on " +
	              s.taskType)
	    .forEach(System.out::println);

	}
	

}
class ProductivityLog{
	String logId;
	String employeeName;
	String taskType;
	double hoursSpent;
	public ProductivityLog(String logId, String employeeName, String taskType, double hoursSpent) {
		this.logId = logId;
		this.employeeName = employeeName;
		this.taskType = taskType;
		this.hoursSpent = hoursSpent;
	}
	@Override
	public String toString() {
		return logId + employeeName + taskType
				 + hoursSpent ;
	}
	public String getLogId() {
		return logId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getTaskType() {
		return taskType;
	}
	public double getHoursSpent() {
		return hoursSpent;
	}
	
	
}
