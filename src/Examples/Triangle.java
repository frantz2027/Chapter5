package Examples;

import javax.swing.*;

public class Triangle
{
    public static void main(String[] args)
    {
        String choiceString = JOptionPane.showInputDialog(null, "What are you solving for? \n1 - for Right triangle"
                + "\n2 - for Isosceles \n3 - for Equilateral");
        int choice = Integer.parseInt(choiceString);

        if (choice == 1)
        {
            rightTriangle();
        }
        else if (choice == 2)
        {
            solveIsosceles();
        }
        else if (choice == 3)
        {
            solveEquilateral();
        }


    }
    public static void rightTriangle()
    {
        String solveChoice = JOptionPane.showInputDialog(null, "Which side do you want to solve for?\n" +
                "A- Side\nB- Side\nC- Side");
        if (solveChoice.equalsIgnoreCase("A"))
        {
            String side1String = JOptionPane.showInputDialog(null, "Please enter for side B");
            String side2String = JOptionPane.showInputDialog(null, "Please enter for side C");
            double side1 = Double.parseDouble(side1String);
            double side2 = Double.parseDouble(side2String);
            rightTriangleMathAB(side1, side2, solveChoice);
        }
        else if (solveChoice.equalsIgnoreCase("B"))
        {
            String side1String = JOptionPane.showInputDialog(null, "Please enter for side A");
            String side2String = JOptionPane.showInputDialog(null, "Please enter for side C");
            double side1 = Double.parseDouble(side1String);
            double side2 = Double.parseDouble(side2String);
            rightTriangleMathAB(side1, side2, solveChoice);
        }
        else
        {
            String side1String = JOptionPane.showInputDialog(null, "Please enter for side A");
            String side2String = JOptionPane.showInputDialog(null, "Please enter for side B");
            double side1 = Double.parseDouble(side1String);
            double side2 = Double.parseDouble(side2String);
            rightTriangleMathAB(side1, side2, solveChoice);
        }
    }
    public static void rightTriangleMathAB(double side1, double side2, String solveChoice)
    {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        JOptionPane.showMessageDialog(null, "The side " + solveChoice + " is " + notC);
    }
    public static void rightTriangleMathC(double side1, double side2, String solveChoice)
    {
        double C = Math.sqrt((side2 * side2) + (side1 * side1));
        JOptionPane.showMessageDialog(null, "The side " + solveChoice + " is " + C);
    }

    public static void solveIsosceles()
    { String baseString = JOptionPane.showInputDialog(null,"Enter your base");
    String equalSideString = JOptionPane.showInputDialog(null, " Enter an equal side");
    double base = Double.parseDouble(baseString);
    double equalSide = Double.parseDouble(equalSideString);
    base = base / 2;
    rightTriangleMathAB();

    }
    public static void solveEquilateral()
    {

    }
}

