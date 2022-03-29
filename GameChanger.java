
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class GameChanger {


    public static void main(String[] args) {
        Welcome();
        Roseter1();
        Roseter2();
    }

    public static void Welcome(){
        System.out.println("Welcome to Game Changer");

        Scanner Team1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Team 1's name");

        String Team1String = Team1.nextLine();  // Read user input
        System.out.println("Team 1 is: " + Team1String);  // Output user input

        Scanner Team2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Team 2's name");

        String Team2String = Team2.nextLine();  // Read user input
        System.out.println("Team 2 is: " + Team2String);  // Output user input


        System.out.println("YOUR TEAMS ARE: " + Team1String + " AND " + Team2String);  // Output user input
        
    }

    

    public static String[] Roseter1(){
        System.out.println("ENTER YOUR FIELDING ROSTER FOR TEAM 1: ");
        Scanner PT1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("P: ");
        String PT1S = PT1.nextLine();

        Scanner CT1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("C: ");
        String CT1S = CT1.nextLine();

        Scanner B1T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("1B: ");
        String B1T1S = B1T1.nextLine();

        Scanner B2T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("2B: ");
        String B2T1S = B2T1.nextLine();

        Scanner SST1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("SS: ");
        String SST1S = SST1.nextLine();

        Scanner B3T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("3B: ");
        String B3T1S = B3T1.nextLine();

        Scanner LFT1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("LF: ");
        String LFT1S = LFT1.nextLine();

        Scanner CFT1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("CF: ");
        String CFT1S = CFT1.nextLine();

        Scanner RFT1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("RF: ");
        String RFT1S = RFT1.nextLine();

        String[] namesT1field = {PT1S, CT1S, B1T1S, B2T1S, B3T1S, SST1S, LFT1S, CFT1S, RFT1S};
        String[] positions = {"P", "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF"}; 
        
        System.out.println("YOUR FIELDING ROSTER IS: " );
        for(int i = 0; i < 9 ; i++){
            System.out.println(positions[i] +  ": " + namesT1field[i]);
        }

        Scanner correctRoster = new Scanner(System.in);  // Create a Scanner object
        System.out.print("IS YOUR ROSTER CORRECT? Y or N: ");
        String correctRS = correctRoster.nextLine();

        if(correctRS.equals("Y")){
            printField(namesT1field);
            return namesT1field;
        }
        else if(correctRS.equals("y")){
            printField(namesT1field);
            return namesT1field;
        }
        else{
            Roseter1();
            return namesT1field;
        }


    }

    public static String[] Roseter2(){
        System.out.println("ENTER YOUR FIELDING ROSTER FOR TEAM 2: ");
        Scanner PT2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("P: ");
        String PT2S = PT2.nextLine();

        Scanner CT2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("C: ");
        String CT2S = CT2.nextLine();

        Scanner B1T2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("1B: ");
        String B1T2S = B1T2.nextLine();

        Scanner B2T2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("2B: ");
        String B2T2S = B2T2.nextLine();

        Scanner SST2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("SS: ");
        String SST2S = SST2.nextLine();

        Scanner B3T2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("3B: ");
        String B3T2S = B3T2.nextLine();

        Scanner LFT2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("LF: ");
        String LFT2S = LFT2.nextLine();

        Scanner CFT2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("CF: ");
        String CFT2S = CFT2.nextLine();

        Scanner RFT2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("RF: ");
        String RFT2S = RFT2.nextLine();

        String[] namesT2field = {PT2S, CT2S, B1T2S, B2T2S, B3T2S, SST2S, LFT2S, CFT2S, RFT2S};
        String[] positions = {"P", "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF"}; 
        
        System.out.println("YOUR FIELDING ROSTER IS: " );
        for(int i = 0; i < 9 ; i++){
            System.out.println(positions[i] +  ": " + namesT2field[i]);
        }

        Scanner correctRoster = new Scanner(System.in);  // Create a Scanner object
        System.out.print("IS YOUR ROSTER CORRECT? Y or N: ");
        String correctRS = correctRoster.nextLine();

        if(correctRS.equals("Y")){
            printField(namesT2field);
            return namesT2field;
        }
        else if(correctRS.equals("y")){
            printField(namesT2field);
            return namesT2field;
        }
        else{
            Roseter2();
            return namesT2field;
        }


    }

    public static boolean printField(String[] roster){
        System.out.println("                     "+ "CF: " + roster[7]); 
        System.out.println("                      .........");
        System.out.println("                   .              .");
        System.out.println("                ..                  ..");
        System.out.println("               .                      .");
        System.out.println("            ..                         .. " +"RF: " +roster[6] );
        System.out.println("           .                             .");
        System.out.println("           .                             .");
        System.out.println("            \\             __             /");
        System.out.println("             \\           |__|           /");
        System.out.println("              \\         /    \\         /");
        System.out.println("               \\       /      \\       /");
        if(roster[5].length() > 16){
            String[] array=roster[5].split("(?<=\\G.{16})");
    
            roster[5] = array[0];     
        }
        for(int i = 0; i < (17 - roster[5].length()) ;i++){
            System.out.print(" ");
        }
        System.out.print("SS: " + roster[5]);
        System.out.println(" /        \\  2nd Base: " + roster[3] );
        System.out.println("                     /          \\");
        System.out.println("                    /            \\");
        System.out.println("                  _/              \\_");
        if(roster[4].length() > 7){
            String[] array=roster[4].split("(?<=\\G.{7})");
    
            roster[4] = array[0];     
        }
        for(int i = 0; i < (7 - roster[4].length()) ;i++){
            System.out.print(" ");
        }

        
        if(roster[4].length() == 0){
            System.out.print("         ");
        }
        else{
            for(int i = 0; i < (7 - roster[4].length()) ;i++){
                System.out.print(" ");
            }
        }

        System.out.print("3rd Base: " + roster[4]);



        System.out.println("|_|              |_| 1st Base: " + roster[2]);
        System.out.println("                   \\              /");
        System.out.println("                    \\            /");
        System.out.println("                     \\          /");
        System.out.println("                      \\        /");
        System.out.println("                       \\      /");
        System.out.println("                         ____");
        System.out.println("                        |    |");
        System.out.println("                        \\    / ");
        System.out.println("                         "+roster[1]);
        


        
        return true;
    }
    

    public static boolean playingfield(){
        System.out.println("WHO IS PLAYING THE FIELD: "  );

        System.out.println("");
        return true;
    }

    /**
    public static String[] HittingRoseter1(String[] roster){
        System.out.println("ENTER YOUR HITTING ROSTER FOR TEAM" );
        System.out.println("ENTER THE NUMBER ASSOCIATED WITH CORRECT PLAYER:");
        for (int j = 0; j < roster.length; j++){
            System.out.print(j + ": " + roster[j] + " | ");
        }
        
        Scanner HT1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("1: ");
        int HT1S = HT1.nextInt();

        Scanner H2T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("2: ");
        int H2T1S = H2T1.nextInt();

        Scanner H3T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("3: ");
        int H3T1S = H3T1.nextInt();

        Scanner H4T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("4: ");
        int H4T1S = H4T1.nextInt();

        Scanner H5T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("5: ");
        int H5T1S = H5T1.nextInt();

        Scanner H6T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("6: ");
        int H6T1S = H6T1.nextInt();

        Scanner H7T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("7: ");
        int H7T1S = H7T1.nextInt();

        Scanner H8T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("8: ");
        int H8T1S = H8T1.nextInt();

        Scanner H9T1 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("9: ");
        int H9T1S = H9T1.nextInt();

        Integer[] namesT1field = {HT1S, H2T1S, H3T1S, H4T1S, H5T1S, H6T1S, H7T1S, H8T1S, H9T1S};
        String[] positions = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}; 
        
        System.out.println("YOUR HITTING ROSTER IS: " );
        for(int i = 0; i < 9 ; i++){
            System.out.println(positions[i] +  ": " + namesT1field[i]);
        }

        Scanner correctRoster = new Scanner(System.in);  // Create a Scanner object
        System.out.print("IS YOUR ROSTER CORRECT? Y or N: ");
        String correctRS = correctRoster.nextLine();

    }
    */



}


