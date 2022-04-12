package Chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	1. 학생수 : 5. 임의의 값을 입력 했을때 ArrayList의 capacity 크기지정
 	2. 점수 입력 : 입력받은 학생수에 따라서 점수 입력. ArrayList에 객체를 저장
 	3. 점수 리스트 : ArrayList에 저장된 Student 객체를 가져와서 score 출력.
 	4. 분석 : 최고점수 : , 평균점수 : 
 	5. 종료
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
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");
            
            int selectNo = scanner.nextInt();
            
			if(selectNo == 1) {
                System.out.print("학생수를 입력하세요 : ");
                studentNum = scanner.nextInt();
                arr = new ArrayList<Student>(studentNum);      // capacity 지정할 때는 변수만 입력    
                System.out.println("입력완료");
                
            }else if(selectNo == 2) {
            	System.out.println("학생수 만큼 점수를 입력하시오 : ");
            	for(int i = 0; i < studentNum; i++) {
            		Student std = new Student();
            		System.out.print((i+1) + " 번 학생 점수를 입력하세요 : ");
            		std.Score = scanner.nextInt();
            		arr.add(std);
            		System.out.println("입력완료");
            	}

            } else if(selectNo == 3) {
            	System.out.println("선택>");
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
              System.out.println("최고점수 : " + maxScore);
              System.out.println("평균점수 : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	break;
              }
        }
        scanner.close();
        System.out.println ("프로그램 종료");
	}
}
