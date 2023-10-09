package Exam_Advance_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackConsole {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice ;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập câu\n" +
                    "2. Đảo ngược câu\n" +
                    "3. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Hãy nhập câu bạn muốn thử");
                    String testReverse = sc.nextLine();
                    System.out.println("Câu bạn vừa nhập"+testReverse);
                    String[] split = testReverse.split(" ");
                    for (String s : split) {
                        stack.push(s);
                    }
                    break;
                case 2:
                    System.out.print("Câu đảo ngược: ");
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop() + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    break;
                default:
            }
        }while (choice!=3);
    }
}
