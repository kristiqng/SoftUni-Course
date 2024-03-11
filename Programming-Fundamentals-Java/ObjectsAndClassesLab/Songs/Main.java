package ObjectsAndClassesLab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<Song> all = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split("_");
            String typeList = input[0];
            String songName = input[1];
            String time = input[2];
            Song song = new Song(typeList,songName,time);
            all.add(song);
        }
        String word = scanner.nextLine();
        if (word.equals("all")) {
            for (Song song : all) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song: all
                 ) {
                if (word.equals(song.getTypeList())) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}