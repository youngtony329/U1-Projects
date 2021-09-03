import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    String fruit, noun, name, adjective, color, adjective2, adjective3, noun2, verb, verb2, noun3, verb3, animal;

        System.out.println("Please input a fruit");
        fruit = read.nextLine();

        System.out.println("Please input a noun");
        noun = read.nextLine();

        System.out.println("Please input a name");
        name = read.nextLine();

        System.out.println("Please input a adjective");
        adjective = read.nextLine();

        System.out.println("Please input a color");
        color = read.nextLine();

        System.out.println("Please input a adjective");
        adjective2 = read.nextLine();

        System.out.println("Please input a adjective");
        adjective3 = read.nextLine();

        System.out.println("Please input a noun");
        noun2 = read.nextLine();

        System.out.println("Please input a verb");
        verb = read.nextLine();

        System.out.println("Please input a verb");
        verb2 = read.nextLine();

        System.out.println("Please input a noun");
        noun3 = read.nextLine();

        System.out.println("Please input a verb");
        verb3 = read.nextLine();

        System.out.println("Please input a animal");
        animal = read.nextLine();

        System.out.println("You wake up one day and you live in a " + fruit + " you are really hungry and you eat a " + noun + ". your friend " + name +
                " has a really" + adjective + " that is " + color + ". you both went outside and it was " + adjective2 + " you thought to yourself its super " + adjective3 +
                " your friend said the they were going to the " + noun2 + " but you thought that your mother was " + verb + " and your dog " + verb2 +
                " your car went to the" + noun3 + " but left without you so you went " + verb3 + " and left your " + animal + " at the grocery store.");




    }
}


/*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */