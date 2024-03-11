package Arrays_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String [] name = new String[n];
        int [] sumByName = new int[n];
        for (int i = 0; i < name.length; i++) {
            name[i] = scanner.nextLine();
            int vow = 0;
            int consonant = 0;
            for (int j = 0; j < name[i].length(); j++) {
                char c = name[i].charAt(j);
                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        vow += (int)c * name[i].length();
                        break;
                    default:
                        consonant+= (int)c / name[i].length();
                        break;
                }
            }
            int sum = vow + consonant;
            sumByName[i] = sum;
        }
        Arrays.sort(sumByName);
        for (int number : sumByName
             ) {
            System.out.println(number);

        }
    }
}
