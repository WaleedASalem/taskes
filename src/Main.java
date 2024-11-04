import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] productName = new String[100];
        Double[] productPrice = new Double[100];
        Double[] productPriceDiscount = new Double[100];

        int repetitionChoice;
        int productCount = 0;

        do {
            System.out.println("""
                    Welcome for your Store\s
                    To Add new product press 1\s
                    To List all products without discount press 2\s
                     \
                    To List all products with applying discount press 3""");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("you should add new product");
                System.out.println("please enter product name");
                productName[productCount] = scanner.nextLine();
                System.out.println("please enter product price ");
                productPrice[productCount] = scanner.nextDouble();
                System.out.println("please enter product discount");
                productPriceDiscount[productCount] = scanner.nextDouble();
                System.out.println("your product added successfully at position number " + productCount + "\n\n ");
                productCount++;

            } else if (choice == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productName[i]);
                    System.out.println(productPrice[i]);
                    System.out.println("*****************");

                }

            } else if (choice == 3) {
                for (int i = 0; i < productCount; i++) {
                    double discountValue = productPrice[i] * productPriceDiscount[i] / 100;
                    double priceAfterDiscount = productPrice[i] - discountValue;
                    System.out.println(productName[i]);
                    System.out.println(productPrice[i]);
                    System.out.println(priceAfterDiscount);
                    System.out.println("*****************");

                }
            } else System.out.println("please enter number between 1 to 3");

            System.out.println("if you need any extra process press 1");


            repetitionChoice = scanner.nextInt();

        } while (repetitionChoice == 1);
    }
}