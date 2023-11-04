import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter letter here: ");
        char letter = scanner.next().charAt(0);

        switch(letter)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("The letter " + letter + " is a vowel.");
                break;
            default:
                System.out.println("The letter " + letter + " is a consonant.");
        }
    }
}
