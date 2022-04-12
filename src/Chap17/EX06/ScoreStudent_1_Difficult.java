package Chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	1. �л��� : 5. ������ ���� �Է� ������ ArrayList�� capacity ũ������
 	2. ���� �Է� : �Է¹��� �л����� ���� ���� �Է�. ArrayList�� ��ü�� ����
 	3. ���� ����Ʈ : ArrayList�� ����� Student ��ü�� �����ͼ� score ���.
 	4. �м� : �ְ����� : , ������� : 
 	5. ����
 */

class Student{
	int Score;	
}

public class ScoreStudent_1_Difficult {

	public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        
        boolean run = true;
        int studentNum = 0;
        
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.print("����> ");
            
            int selectNo = scanner.nextInt();
            
			if(selectNo == 1) {
                System.out.print("�л����� �Է��ϼ��� : ");
                studentNum = scanner.nextInt();
                arr = new ArrayList<Student>(studentNum);      // capacity ������ ���� ������ �Է�    
                System.out.println("�Է¿Ϸ�");
                
            }else if(selectNo == 2) {
            	System.out.println("�л��� ��ŭ ������ �Է��Ͻÿ� : ");
            	for(int i = 0; i < studentNum; i++) {
            		Student std = new Student();
            		System.out.print((i+1) + " �� �л� ������ �Է��ϼ��� : ");
            		std.Score = scanner.nextInt();
            		arr.add(std);
            		System.out.println("�Է¿Ϸ�");
            	}

            } else if(selectNo == 3) {
            	System.out.println("����>");
            		for(int i = 0; i < studentNum; i++) {
            			System.out.println(arr.get(i).Score);
            		}
            } else if(selectNo == 4) {
            	int sum = 0;
            	int maxScore = 0;
            	for(Student k : arr) {
            		if(maxScore < k.Score) {
            			maxScore = k.Score;
            		}
            		sum += k.Score;
            	}
              System.out.println("�ְ����� : " + maxScore);
              System.out.println("������� : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	break;
              }
        }
        scanner.close();
        System.out.println ("���α׷� ����");
	}
}
