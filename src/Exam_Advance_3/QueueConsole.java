package Exam_Advance_3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;
        Queue<String> queue = new LinkedList<>();
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên phụ huynh nộp hồ sơ\n" +
                    "2. Phụ huynh tiếp theo\n" +
                    "3. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Hãy nhập trên của phụ huynh");
                    String want = sc.nextLine();
                    queue.offer(want);
                    break;
                case 2:
                    System.out.print("Xin mời phụ huynh: ");
                    if(queue.poll()!=null){
                        System.out.println(queue.poll());
                    }else {
                        System.out.println("hết phụ huynh");
                    }
                    break;
                case 3:
                    break;
                default:
            }
        }while(choice != 3);
    }
}
