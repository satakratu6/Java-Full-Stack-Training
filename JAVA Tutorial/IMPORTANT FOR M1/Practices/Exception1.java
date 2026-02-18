class CarSpeed{
    String speed;
}

class CarSpeedImplementation{

    public String setCarSpeed(CarSpeed sp, int spd){

        try{

            if(spd < 30 || spd > 90){
                throw new SpeedInvalidException("Exception in Speed Validation");
            }

            sp.speed = "Valid";

        }catch(SpeedInvalidException e){
            sp.speed = e.getMessage();
        }

        return sp.speed;
    }
}

class SpeedInvalidException extends Exception{

    SpeedInvalidException(String msg){
        super(msg);
    }
}

class Exception1 {
    public static void main(String[] args) {

        CarSpeed sp = new CarSpeed();
        CarSpeedImplementation obj = new CarSpeedImplementation();

        System.out.println(obj.setCarSpeed(sp, 50)); // Valid
        System.out.println(obj.setCarSpeed(sp, 20)); // Exception message
    }
}