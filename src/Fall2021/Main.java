package Fall2021;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.next();
        System.out.println("Enter your surname");
        String surname= scan.next();
        System.out.println("Enter your credit card number");
        String number= scan.next();
        System.out.println(nameSurname(name, surname));
        System.out.println(creditCard(number));

    }
    public static String nameSurname(String name, String surname){

        char firstLater= name.toUpperCase(Locale.ROOT).charAt(0);
        String finalName= firstLater+name.substring(1).toLowerCase(Locale.ROOT);

        char firstLetter2=surname.toUpperCase(Locale.ROOT).charAt(0);
        String finalSurname= firstLetter2+surname.toLowerCase(Locale.ROOT).substring(1);

        return "Name: "+finalName+ " Surname: "+finalSurname;
    }

    public static String creditCard(String number){
        String lastNumber="";
            if (number.length()!=16) {
                System.out.println("Invalid credit card number.");

            } else {
                int counter = 0;
                do{
                for (int i = 0; i < number.length(); i++) {
                    lastNumber += number.charAt(i);
                    counter++;
                    if (counter == 4) {
                        lastNumber += " ";
                        counter = 0;

                    }
                    }//System.out.println("Your credit card number: "+lastNumber);
                }while (lastNumber.length()<19);

            }return "Your credit card number: "+lastNumber;
        }
}
