// TASKS
// class Temperature

// define a String variable status

// class TemperatureImplementation

// Implement the below method:

// String setTemperature(Temperature t, int temp)
// Requirements:

// ✅ Inside this method, validate the temperature.

// If temperature is below 0 OR above 45,
// 👉 throw a custom exception named InvalidTemperatureException
// with message:

// "Temperature out of range"

// Else assign:

// "Normal"

// to t.status

// Catch Rule (IMPORTANT)

// Catch the thrown exception inside the method and:

// 👉 assign the exception message to t.status

// Return t.status.

// class InvalidTemperatureException

// Extend the Exception class

// Create a parameterized constructor that accepts a String message

// Pass the message to the superclass

// ⭐ Example Output Behavior

// If input is:

// temp = 25

// Output:

// Normal

// If input is:

// temp = 60

// Output:

// Temperature out of range

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Temperature{
    String status;
}
class TemperatureImplementation{
    public String setTemperature(Temperature t, int temp){
        try{
            if(temp<0 || temp >45){
                throw new InvalidTemperatureException("Temperature out of range");
            }
            t.status="Normal";
        } catch(InvalidTemperatureException e){
            t.status=e.getMessage();
        }
            return t.status;

    }
}

class InvalidTemperatureException extends Exception{
    InvalidTemperatureException(String message){
        super(message);
    }
}
class Main {
    public static void main(String[] args) {
        Temperature t=new Temperature();
        TemperatureImplementation tm=new TemperatureImplementation();
        System.out.println(tm.setTemperature(t,25));
        System.out.println(tm.setTemperature(t,60));
    }
}