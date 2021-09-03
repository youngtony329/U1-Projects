import javax.swing.JOptionPane;

public class RPGCharacter {
    public static void main(String[] args) {

        int strength, dexterity, spirit, intelligence, speed, damage, armor, manaCapacity, spellStrength;
        String firstName, lastName;

        firstName = JOptionPane.showInputDialog("What is your first name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");

        strength = Integer.parseInt(JOptionPane.showInputDialog("What is your strength level?"));
        dexterity = Integer.parseInt(JOptionPane.showInputDialog("What is your dexterity level?"));
        spirit = Integer.parseInt(JOptionPane.showInputDialog("What is your spirit level?"));
        intelligence = Integer.parseInt(JOptionPane.showInputDialog("What is your intelligence level?"));
        speed = Integer.parseInt(JOptionPane.showInputDialog("What is your speed level?"));

        damage = speed * strength;
        armor = dexterity;
        manaCapacity = spirit;
        spellStrength = spirit * intelligence;

        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName + " Your damage capacity is: " + damage);
        JOptionPane.showMessageDialog(null, "Your armor capacity is: " + armor);
        JOptionPane.showMessageDialog(null, "Your mana capacity is: " + manaCapacity);
        JOptionPane.showMessageDialog(null, "Your spell strength is: " + spellStrength);

        System.exit(0);


    }
}


 /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */