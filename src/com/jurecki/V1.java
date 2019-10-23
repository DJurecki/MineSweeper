package com.jurecki;

import java.util.*;

public class V1 {

    public V1() {

        System.out.println("How many mines do you want on the field? ");
        Scanner scanner = new Scanner(System.in);
        int mines = scanner.nextInt();

        char[][] tab = new char[9][9];
        boolean full = false;
        int counter = 0;

        if(mines / 10 == 0){
            counter = mines % 10;
            List<Integer> list = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0 ; i < 9 ; i++) {
                list.add(i);
            }
            Collections.shuffle(list);
            for (int i = 0; i < counter; i++) {
                System.out.println(list.get(i));
                stringBuilder.append(list.get(i));
            }
            String digits = stringBuilder.toString();
            System.out.println(digits);
//            String joined = list.stream().map(Object::toString).collect(Collectors.joining(", "));
            //           System.out.println(joined);

            for(int i = 0 ; i < tab.length ; i++){
                Random r = new Random();
                int randomInt = r.nextInt(9);
                for(int j = 0 ; j < tab[i].length ; j++){
                    if(j == randomInt && digits.contains(Integer.toString(i))){
                        tab[i][j] = 'X';
                    }
                    else{
                        tab[i][j] = '*';
                    }
                }
            }

            for(int i = 0 ; i < tab.length ; i++){
                System.out.println();
                for(int j = 0 ; j < tab[i].length ; j++){
                    System.out.print(tab[i][j]);
                }
            }
        }

    }
}
