package DataStructures;

import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String names = input.nextLine();
        String[] name1 = names.split(" ");
        if(name1.length>1 || name1[1] == ""){
            System.out.println("test");
            input.close();
            return;
        }
        System.out.println("hello" + name1[0] +" and " + name1[1]);
        input.close();
    }
}
