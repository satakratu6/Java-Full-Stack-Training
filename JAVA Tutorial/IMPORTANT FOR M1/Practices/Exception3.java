class Person1{
	String name;
	String dateOfBirth;
	String email;
	public Person1(String name, String dateOfBirth, String email) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	
	
}
class Implementation{

    public String validator(Person1 details)
            throws InvalidDateException, InvalidEmailException {

        // Validate Date
    	String dob=details.getDateOfBirth();
        if(!dob.matches("\\d{2}-\\d{2}-\\d{4}"))
            throw new InvalidDateException("date year must be less than 2000");

        int year = Integer.parseInt(dob.substring(6));

        if(year >= 2000)
            throw new InvalidDateException("date year must be less than 2000");


        // Validate Email
        String email = details.getEmail();

        if(!email.endsWith("@doselect.com"))
            throw new InvalidEmailException(
                    "only @doselect.com domain email are accepted"
            );

        return "valid details";
    }


    public String submitDetails(Person1 details){

        try{
            return validator(details);

        }catch(InvalidDateException | InvalidEmailException e){

            return "invalid details";

        }catch(Exception e){

            return "other exception";
        }
    }
}

class InvalidDateException extends Exception{
	public InvalidDateException(String msg) {
		super(msg);
	}
}
class InvalidEmailException extends Exception{
	public InvalidEmailException(String msg) {
		super(msg);
	}
}
public class Exception3 {

	public static void main(String[] args) {
		 Implementation obj = new Implementation();

	        Person1 p1 = new Person1("John","12-05-1998","john@doselect.com");
	        System.out.println(obj.submitDetails(p1)); // valid details

	        Person1 p2 = new Person1("Sam","12-05-2002","sam@doselect.com");
	        System.out.println(obj.submitDetails(p2)); // invalid details

	        Person1 p3 = new Person1("Alex","12-05-1995","alex@gmail.com");
	        System.out.println(obj.submitDetails(p3)); // invalid details
	}

}
