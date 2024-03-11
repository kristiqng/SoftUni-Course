package RegularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<name>[A-Z][a-z]+)%[^\\.\\|\\%\\$]*<(?<product>\\w+)>[^\\.\\|\\%\\$]*\\|(?<count>\\d+)\\|[^\\.\\|\\%\\$]*?(?<price>[\\d]+\\.?[\\d]*)\\$";
        double all = 0;
        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));
                double total = price * count;
                String name = matcher.group("name");
                String product = matcher.group("product");
                all += total;

                System.out.printf("%s: %s - %.2f%n", name, product, total);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", all);
    }
}
