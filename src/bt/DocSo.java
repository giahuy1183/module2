package bt;

import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        }
        else if (number < 10) {
            switch (number) {
                case 0: System.out.println("zero"); break;
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                case 9: System.out.println("nine"); break;
            }
        }
        else if (number < 20) {
            switch (number) {
                case 10: System.out.println("ten"); break;
                case 11: System.out.println("eleven"); break;
                case 12: System.out.println("twelve"); break;
                case 13: System.out.println("thirteen"); break;
                case 14: System.out.println("fourteen"); break;
                case 15: System.out.println("fifteen"); break;
                case 16: System.out.println("sixteen"); break;
                case 17: System.out.println("seventeen"); break;
                case 18: System.out.println("eighteen"); break;
                case 19: System.out.println("nineteen"); break;
            }
        }
        else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String wordTens = "";
            String wordOnes = "";

            switch (tens) {
                case 2: wordTens = "twenty"; break;
                case 3: wordTens = "thirty"; break;
                case 4: wordTens = "forty"; break;
                case 5: wordTens = "fifty"; break;
                case 6: wordTens = "sixty"; break;
                case 7: wordTens = "seventy"; break;
                case 8: wordTens = "eighty"; break;
                case 9: wordTens = "ninety"; break;
            }

            switch (ones) {
                case 1: wordOnes = "one"; break;
                case 2: wordOnes = "two"; break;
                case 3: wordOnes = "three"; break;
                case 4: wordOnes = "four"; break;
                case 5: wordOnes = "five"; break;
                case 6: wordOnes = "six"; break;
                case 7: wordOnes = "seven"; break;
                case 8: wordOnes = "eight"; break;
                case 9: wordOnes = "nine"; break;
            }
            System.out.println(wordTens + (ones != 0 ? " " + wordOnes : ""));
        }
        else {
            int hundreds = number / 100;
            int remainder = number % 100;
            String wordHundreds = "";

            switch (hundreds) {
                case 1: wordHundreds = "one hundred"; break;
                case 2: wordHundreds = "two hundred"; break;
                case 3: wordHundreds = "three hundred"; break;
                case 4: wordHundreds = "four hundred"; break;
                case 5: wordHundreds = "five hundred"; break;
                case 6: wordHundreds = "six hundred"; break;
                case 7: wordHundreds = "seven hundred"; break;
                case 8: wordHundreds = "eight hundred"; break;
                case 9: wordHundreds = "nine hundred"; break;
            }

            if (remainder == 0) {
                System.out.println(wordHundreds);
            } else {
                // In phần hàng trăm, sau đó tận dụng lại logic phần dư dưới 100
                System.out.print(wordHundreds + " and ");

                // Xử lý nhanh phần dư nhỏ hơn 100 tại đây
                if (remainder < 10) {
                    switch (remainder) {
                        case 1: System.out.println("one"); break;
                        case 2: System.out.println("two"); break;
                        case 3: System.out.println("three"); break;
                        case 4: System.out.println("four"); break;
                        case 5: System.out.println("five"); break;
                        case 6: System.out.println("six"); break;
                        case 7: System.out.println("seven"); break;
                        case 8: System.out.println("eight"); break;
                        case 9: System.out.println("nine"); break;
                    }
                } else if (remainder < 20) {
                    switch (remainder) {
                        case 10: System.out.println("ten"); break;
                        case 11: System.out.println("eleven"); break;
                        case 12: System.out.println("twelve"); break;
                        case 13: System.out.println("thirteen"); break;
                        case 14: System.out.println("fourteen"); break;
                        case 15: System.out.println("fifteen"); break;
                        case 16: System.out.println("sixteen"); break;
                        case 17: System.out.println("seventeen"); break;
                        case 18: System.out.println("eighteen"); break;
                        case 19: System.out.println("nineteen"); break;
                    }
                } else {
                    int t = remainder / 10;
                    int o = remainder % 10;
                    String wt = "";
                    String wo = "";
                    switch (t) {
                        case 2: wt = "twenty"; break;
                        case 3: wt = "thirty"; break;
                        case 4: wt = "forty"; break;
                        case 5: wt = "fifty"; break;
                        case 6: wt = "sixty"; break;
                        case 7: wt = "seventy"; break;
                        case 8: wt = "eighty"; break;
                        case 9: wt = "ninety"; break;
                    }
                    switch (o) {
                        case 1: wo = "one"; break;
                        case 2: wo = "two"; break;
                        case 3: wo = "three"; break;
                        case 4: wo = "four"; break;
                        case 5: wo = "five"; break;
                        case 6: wo = "six"; break;
                        case 7: wo = "seven"; break;
                        case 8: wo = "eight"; break;
                        case 9: wo = "nine"; break;
                    }
                    System.out.println(wt + (o != 0 ? " " + wo : ""));
                }
            }
        }
    }
}