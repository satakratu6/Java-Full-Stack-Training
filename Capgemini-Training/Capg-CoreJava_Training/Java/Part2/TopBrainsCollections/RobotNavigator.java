import java.util.*;

public class RobotNavigator {

    public static void main(String[] args) {

        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int position = 0;

        while(true){

            System.out.println("\n1. Move Forward");
            System.out.println("2. Move Backward");
            System.out.println("3. Undo Last Move");
            System.out.println("4. Redo Last Move");
            System.out.println("5. Show Current Position");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch(choice){

                case 1:

                    System.out.print("Enter steps: ");
                    int f = sc.nextInt();

                    String forwardMove = "FORWARD " + f;
                    backStack.push(forwardMove);
                    forwardStack.clear();

                    position += f;

                    System.out.println("Moved Forward " + f + " steps.");
                    break;


                case 2:

                    System.out.print("Enter steps: ");
                    int b = sc.nextInt();

                    String backwardMove = "BACKWARD " + b;
                    backStack.push(backwardMove);
                    forwardStack.clear();

                    position -= b;

                    System.out.println("Moved Backward " + b + " steps.");
                    break;


                case 3:

                    if(backStack.isEmpty()){
                        System.out.println("Nothing to undo.");
                        break;
                    }

                    String lastMove = backStack.pop();
                    String[] parts = lastMove.split(" ");
                    String direction = parts[0];
                    int steps = Integer.parseInt(parts[1]);

                    if(direction.equals("FORWARD")){
                        position -= steps;
                        forwardStack.push("FORWARD " + steps);
                        System.out.println("Undo: Moving BACKWARD " + steps);
                    }else{
                        position += steps;
                        forwardStack.push("BACKWARD " + steps);
                        System.out.println("Undo: Moving FORWARD " + steps);
                    }

                    break;


                case 4:

                    if(forwardStack.isEmpty()){
                        System.out.println("Nothing to redo.");
                        break;
                    }

                    String redoMove = forwardStack.pop();
                    String[] redoParts = redoMove.split(" ");
                    String redoDir = redoParts[0];
                    int redoSteps = Integer.parseInt(redoParts[1]);

                    if(redoDir.equals("FORWARD")){
                        position += redoSteps;
                        System.out.println("Redo: Moving FORWARD " + redoSteps);
                    }else{
                        position -= redoSteps;
                        System.out.println("Redo: Moving BACKWARD " + redoSteps);
                    }

                    backStack.push(redoMove);

                    break;


                case 5:

                    System.out.println("Current Position: " + position);
                    break;


                case 6:

                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
