package Chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;

class Student2{
	int score;	// ������ �Է�, �ʵ��� �� �Ҵ�. (1. ��ü ���� �� ����, 2. private(������, Setter, getter)
	
	Student2(){
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		score = score;
	}
	
	
}

public class ScoreStudent_T {

	public static void main(String[] args) {
		ArrayList<Student2> arr = new ArrayList<Student2>();
        Scanner scanner = new Scanner(System.in); 		// System.in : �ܼ��� ���ؼ� ���� �ްڴ�.
        
        boolean run = true;
        int studentNum = 0; 		// while ��� �ۿ��� ����, ���� ����
        
        while(run) {			// run : true
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.print("����> ");
            
            int selectNo = scanner.nextInt(); 		// ����
            
			if(selectNo == 1) {
                System.out.print("�л����� �Է��ϼ��� : ");
                studentNum = scanner.nextInt();   	// �л� �� ��ǲ ����
                System.out.println("�Է¿Ϸ�");
                
            }else if(selectNo == 2) {
            	if(studentNum == 0) { 		// studentNum�� �Ҵ� �޾ƾ� for���� ������ ���� �� �� �ִ�.
            		System.out.println("�л� ���� ���� �Է� �ϼ���. ");
            	} else {
            		// for���� ���ؼ� ��ǲ ���� �л� �� ��ŭ ������ �Է�.
            		for (int i = 0; i < studentNum; i++) {
            			// ��ǲ�� �޾Ƽ� ��ǲ ���� ���� Student ��ü�� score ������ �Ҵ�. 
            			// ��ü�� ���� �ؼ�
            			Student2 student = new Student2(); 		// �⺻ �����ڸ� ����ؼ� ��ü ����, ���� score �ʵ� ���� �Ҵ�.
            			System.out.println((i + 1) + "��° �л� ������ �Է� �ϼ���. ");
            			student.score = scanner.nextInt(); 	// �л� ������ �Է� �޾Ƽ� �ʵ忡 ���� �Ҵ�.
            			arr.add(student); 		// ArrayList �ʵ忡 ���� �Ҵ��� ��ü�� ArrayList�� ����
            			System.out.println("�Է� �Ϸ�");
            		}
            	}

            } else if(selectNo == 3) {
            	// �ڵ� �ۼ�, ���� ����Ʈ ���, ArrayList �� ������ �Ҵ�� ��ü�� ����. ��ü ���� ��, �ʵ��� ���� ���� ��� , getter setter
            	if(studentNum == 0) {
            		System.out.println("�л� ���� ���� �Է� �ϼ���. ");
            	} else {
            		for(int i = 0; i < studentNum; i++) { 	// ArrayList ��ü�� �����ͼ� student.score �ʵ��� ���� ���
            			Student2 student = arr.get(i); 	// ArrayList�� get() �� ���� Studuent ��ü
            			//System.out.println(student.score); 		// �ʵ��� ���� ��ü�� ���� ���
            			System.out.println(student.getScore()); 	// �ʵ��� ���� getter�� ���
            		}
            	}
            } else if(selectNo == 4) {
            	if(studentNum == 0) {
            		System.out.println("�л� ���� ���� �Է� �ϼ���. ");
            	} else {
            		int maxScore = 0; 		// �ִ� ������ �޴� ���� ���� 	<�ʱⰪ �Ҵ�>
            		int sum = 0; 		// �հ踦 �����ϴ� ���� 	<�ʱⰪ �Ҵ�>
            		
            		// 1. ArrayList�� ��ü�� ������ �´�. / 2. Student ��ü�� score �ʵ��� ���� �����ͼ� ó��
            		for(int i = 0; i < studentNum; i++) {
            			Student2 student = arr.get(i);
            			//�ִ� ���� ������ �Ҵ�
            			// 3�� �����ڸ� ����ؼ� �ִ밪�� ������ �Ҵ�
            			maxScore = (student.score > maxScore)? student.score:maxScore; // �� : ����
            			sum += student.score; 	// sum = sum + student.score
            		}
            		// maxScore ������ ���� ���� ���� ��, sum : ��� score ���� ���� ������ ��Ƽ� 
            		System.out.println("�ְ����� : " + maxScore);
            		System.out.println("������� : " + (float) sum / studentNum);
            	}
              
            } else if(selectNo == 5) {
            	run = false; 	// run false�� �� while���� ���� ����
            	//break;
              }
        }
        scanner.close();
        System.out.println ("���α׷� ����");
	}

	}


