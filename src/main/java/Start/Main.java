package Start;

import java.io.*;
import java.util.*;


import java.util.Scanner;
interface BankInterface {
    int addremove1=10000;
    int addremove2=50000;
    int addremove3 =100000;






}


public class Main  implements BankInterface{



    public static void main(String[] args) {
        double money1 = addremove1;
        double money2 = addremove2;
        double money3 = addremove3;
        ArrayList Staffinfo= new ArrayList<>();
        Staffinfo.add("Emad Shirna");



        File infoFile = new File("outputcopy.txt");


        double money = 0;
        int ss;
        String email;
        String name;


        //if (!infoFile.exists()) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! my name is "+ Staffinfo);
        System.out.println("Hello please enter your name!");
        name = scanner.nextLine();


        System.out.println("Good to meet you " + name + "!" + " now enter your social security!");
        ss = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Okay " + name + "! how much would you like to have in your account? You have 3 options enter 1 for 10000$, 2 for 50000$, 3 for 100000$");
        int choice = scanner.nextInt();

        if (choice==1) {
            money= money1;

        }
        else if (choice==2) {
            money=money2;

        }
        else if (choice==3) {
            money=money3;

        }

        scanner.nextLine();


        System.out.println("finally we just need your email " + name + "!");
        email = scanner.nextLine();
        scanner.close();


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(infoFile));
            writer.write("user " + name + " information" + "\n" + "\n" + "\n");
            writer.write("User social security: " + ss + "\n" + "\n" + "\n");
            writer.write("User joined our bank with " + money + "$" + "\n" + "\n" + "\n");
            writer.write("Users email for contect and login info: " + email + "\n" + "\n" + "\n");
            writer.close();


        } catch (IOException e) {

        }




    }


}

