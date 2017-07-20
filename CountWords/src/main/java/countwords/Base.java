package countwords;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;
import java.io.File;
import java.util.Collections;


/**
 * Created by K_PC-S on 19.07.2017.
 */
public class Base {

    public static void main(String[] args) {

        OpenFile op = new OpenFile();
        System.out.println("File name " + op.getFileName());
        System.out.println("File directory " + op.getDirectory());
        int temp = 0;
        int tempIndex = 0;

        System.out.println("Начинаем");
        try {
          Scanner sc  = new Scanner(new File(op.getDirectory(),op.getFileName()));
            ArrayList<String> words = new ArrayList<String>();
            Set<String> words2 = new TreeSet<String>();

            while(sc.hasNext()) {
            String word = sc.useDelimiter("\\s+").next();
            words.add(word);
            words2.add(word);
            }

            System.out.println(words);
            System.out.println("Отсортированно по алфавиту не включая повторений" + words2);


String[] arrayWords = {};
arrayWords = words2.toArray(new String[words2.size()]);

System.out.println("Статистика");
for(int i = 0; i<arrayWords.length; i++) {
    int count = Collections.frequency(words, arrayWords[i]);
    System.out.println("Повтор слова " + arrayWords[i] + " в количестве " + count);
    if(count > temp) {
        temp = count;
        tempIndex = i;
    }
}
System.out.println("Больше всего повторений имеет слово " + arrayWords[tempIndex] + ". Количество повторений " + temp);

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        System.exit(0);

    }
}
