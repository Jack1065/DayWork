package JavaHW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        /* Program which prompts user for favorite video game and prints out the similarities 
        between my favorite and their favorite game */
        Scanner input = new Scanner(System.in);
        String[] myFavorites = new String[]{"minecraft", "2009", "4.8", "Notch"};
        
        System.out.println("Whats your favorite game?\n");
        System.out.print("Enter game: ");
        String gameName = input.nextLine();

            if(gameName.equals("")){
                System.out.println("Invalid game name, exiting program");
                System.exit(0);
            }
        
        System.out.println("\nWhat year did your favorite game release?: ");
        System.out.print("Enter year: ");
       
        String Yearparse = null;
        Yearparse = input.nextLine();
        int Year = 0;

        //try catch block in order to catch an errors when parsing the year
        try{ 
            Year = Integer.parseInt(Yearparse);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid year, exiting program");
            System.exit(0);
        }
        catch(NullPointerException e){
            System.out.println("null pointer exception, exiting program");
            System.exit(0);
            
        }
        //Year validation
        if(Year<0 || Year>2023){
                System.out.println("Invalid year, exiting program");
                System.exit(0);
        }

        System.out.println("\nWhat is the rating of your favorite game?: ");
        System.out.print("Enter rating: ");
        String parseFloat = input.nextLine();
        float rating = 0;

        try{
         rating= Float.parseFloat(parseFloat);
        }
        catch(NumberFormatException e){
            System.out.println("invalid rating, exiting program");
            System.exit(0);
        }
        //rating validation
        if(rating>5.0 || rating<0.0){
                System.out.println("Rating must be between 0.0 and 5.0, exiting program");
                System.exit(0);
        }

        System.out.println("\nWho created your favorite game?");
        System.out.print("Enter name: ");
            String creator = input.nextLine();

        if(creator.equals("")){
                System.out.println("\n" + "Invalid name, exiting program");
                System.exit(0);
        }
        
        System.out.printf("\nYour favorite game is %s, It came out in %d, it has a rating of %.1f, and it was created by %s\n",gameName, Year, rating, creator);
        System.out.printf("\nMy favorite game is %s, It came out in %s, it has a rating of %s, and it was created by %s\n",myFavorites[0], myFavorites[1], myFavorites[2], myFavorites[3]);
        checkForFavorites(myFavorites, gameName, creator, Year, rating);
   
       

            input.close();
        }

        public static void checkForFavorites(String[] myFavorites, String gameName, String creator, int Year, float rating){
            //conditionals checking similarities between myfavorite array and user input
            if(gameName.equalsIgnoreCase(myFavorites[0])){
                System.out.println("Both of our favorite games are " + myFavorites[0]);
            }
            if(Integer.toString(Year).equalsIgnoreCase(myFavorites[1])){
                System.out.println("Both our Favorite games came out in " + myFavorites[1]);
            }
            if(Float.toString(rating).equalsIgnoreCase(myFavorites[2])){
                System.out.println("Both our favorite games have a rating of " + myFavorites[2]);
            }
            if(creator.equalsIgnoreCase(myFavorites[3])){
                System.out.println("both our favorite games were created by " + myFavorites[3]);
            }

            
    }
}


