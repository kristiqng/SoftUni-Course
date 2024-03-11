    package RegularExpressions_Exercise;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class Furniture_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            double total = 0;
            List<String> names = new ArrayList<>();

            while (!input.equals("Purchase")) {
                String regex = ">>(?<name>[A-Z]+[a-z]*)<<(?<price>[\\d]+[\\.]?[\\d]*)!(?<quantity>\\d+)";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(input);
                if (matcher.find()) {
                    names.add(matcher.group("name"));
                    double price = Double.parseDouble(matcher.group("price"));
                    int quantity = Integer.parseInt(matcher.group("quantity"));
                    total += price * quantity;
                }
                input = scanner.nextLine();
            }
            System.out.printf("Bought furniture:%n");
            names.forEach(System.out::println);
            System.out.printf("Total money spend: %.2f", total);
        }
    }
