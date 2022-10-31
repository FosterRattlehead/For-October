package Start;
import java.io.*;
import java.util.Scanner;

public class BankinfoRecord {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello please enter your name!");
        String name=scanner.nextLine();






        System.out.println("Good to meet you " + name+ "!" +" now enter your social security!");
        int ss = scanner.nextInt();
        scanner.nextLine();





        System.out.println("Okay "+ name+"! how much would you like to have in your account");
        double money= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("finally we just need your email "+ name+"!");
        String email = scanner.nextLine();





        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.text"));
            writer.write("user "+name+ " information"+"\n"+"\n"+"\n");
            writer.write("User social security: "+ ss+"\n"+"\n"+"\n");
            writer.write("User joined our bank with "+ money+ "$"+"\n"+"\n"+"\n");
            writer.write("Users email for contect and login info: "+ email+"\n"+"\n"+"\n");

            writer.close();
        }
        catch (IOException e) {

        }









    }
}
