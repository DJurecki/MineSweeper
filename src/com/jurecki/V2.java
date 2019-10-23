package com.jurecki;

import java.util.*;

public class V2 {

    public V2() {

        System.out.println("How many mines do you want on the field? ");
        Scanner scanner = new Scanner(System.in);
        int mines = scanner.nextInt();

        char[][] tab = new char[9][9];

        for(int i = 0 ; i < tab.length ; i++){
            for(int j = 0 ; j < tab[i].length ; j++){
                tab[i][j] = '.';
            }
        }

        List<Integer> list = new ArrayList<>();

            for (int i = 0 ; i < 81 ; i++) {
                list.add(i);
            }
            Collections.shuffle(list);
            for (int i = 0; i < mines; i++) {
               tab[calculateX(list.get(i))][calculateY(list.get(i))] = 'X';
            }
            printArray(tab);
        }

        private int calculateX(int x){
            int counter = 0;
            while(x / 9 != 0){
                x = x - 9;
                counter++;
            }
            return counter;
        }

        private int calculateY(int y){
            while (y > 8){
                y = y - 9;
            }
            return y;
        }

        private void printArray(char[][] t){
            for(int i = 0 ; i < t.length ; i++) {
                System.out.println();
                for(int j = 0 ; j < t[i].length ; j++){
                    System.out.print(t[i][j]);
                }
            }
        }
}
