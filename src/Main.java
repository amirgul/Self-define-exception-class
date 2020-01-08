import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("enter the size/length of the array");
            int size = keyboard.nextInt();
            String[] names = new String[size + 1];
            for (int i = 1; i < names.length; i++) {
                System.out.println("Enter the value for: " + i);
                names[i] = keyboard.next();
            }
            for (int i = 1; i < names.length; i++)
            {
                if(names[i].equalsIgnoreCase("free"))
                {
                    System.out.println("Enter the value for: " + names[i]);
                    String value = keyboard.nextLine();
                    names[i] = value;
                }
                if(!names[i].equalsIgnoreCase("free"))
                    throw new TimeInUseException();


            }


        }
    }
}
