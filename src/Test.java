import java.util.Random;
import java.util.Scanner;
import java.lang.String;
public class Test {
    public static void main(String[] args) {
        String storeuser = "aadarsha1";
        String storepass = "12345678";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String user = sc.nextLine();
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter your password");
        String pass = cc.nextLine();
        if (storeuser.equals(user)) {

            if (storepass.equals(pass)) {

                System.out.println("Login Sucessful");
                while (true) {

                    System.out.println("1.Calculator");
                    System.out.println("2.Guessing Game");
                    System.out.println("3.Simple Interest");
                    System.out.println("4.Vowel or Consonant");
                    Scanner sr = new Scanner(System.in);
                    System.out.println("Choose the program you want to run:");
                    int sel = sr.nextInt();
                    switch (sel) {
                        case 1:
                            System.out.println("Heres your Calculator");
                            Scanner ccr = new Scanner(System.in);
                            System.out.println("Enter the first number:");
                            float num1 = ccr.nextFloat();
                            Scanner ccc = new Scanner(System.in);
                            System.out.println("Enter the second number:");
                            float num2 = ccc.nextFloat();
                            System.out.println("1.Addition");
                            System.out.println("2.Subtraction");
                            System.out.println("3.Multiplication");
                            System.out.println("4.Division");
                            Scanner op = new Scanner(System.in);
                            System.out.println("Enter the operation:");
                            int operations = op.nextInt();
                            switch (operations) {
                                case 1:
                                    float sum = num1 + num2;
                                    System.out.println("The sum between the number is " + sum);
                                    break;
                                case 2:
                                    float sub = num1 - num2;
                                    System.out.println("The difference between the number is " + sub);
                                    break;
                                case 3:
                                    float multi = num1 * num2;
                                    System.out.println("The multiplication of the number is " + multi);
                                    break;
                                case 4:
                                    float div = num1 / num2;
                                    System.out.println("The division is " + div);
                                    break;
                                default:
                                    System.out.println("Invalid Error");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Guessing game");

                            Random csc = new Random();
                            int cran = csc.nextInt(10) + 1;
                            while (true) {
                                Scanner wc = new Scanner(System.in);
                                System.out.println("Enter a number between 10-1:");
                                int guess = wc.nextInt();
                                if (guess == cran) {
                                    System.out.println("You have guessed the correct number");
                                    break;
                                } else if (guess < cran) {
                                    System.out.println("Try higher number");
                                } else {
                                    System.out.println("Try lower number");
                                }


                            }
                            break;
                        case 3:
                            System.out.println("Welcome to SI calculator");
                            Scanner p = new Scanner(System.in);
                            System.out.println("Enter the principle amount:");
                            float pri = p.nextFloat();
                            Scanner t = new Scanner(System.in);
                            System.out.println("Enter the time:");
                            float ti = t.nextFloat();
                            Scanner r = new Scanner(System.in);
                            System.out.println("Enter the rate:");
                            float ra = r.nextFloat();
                            float ssi = (pri * ti * ra) / 100;
                            System.out.println("The simple interest is :" + ssi);
                            break;

                        case 4:
                            Scanner le = new Scanner(System.in);
                            System.out.println("Enter a character :");
                            String character = le.nextLine();
                            switch (character) {
                                case "a":
                                case "e":
                                case "i":
                                case "o":
                                case "u":
                                case "A":
                                case "E":
                                case "I":
                                case "O":
                                case "U":
                                    System.out.println("Vowel");
                                    break;
                                default:
                                    System.out.println("Consonant");
                                    break;
                            }
                            break;

                    }


                }
            }else{
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid Username");
        }
    }
}

