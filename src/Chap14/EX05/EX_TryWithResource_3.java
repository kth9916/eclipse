package Chap14.EX05;

// �ڵ� ���ҽ� ����(��ü) ���� : 
	// 1. AutoCloseable �������̽��� ����
	// 2. close() �޼ҵ� ������

// �ʵ��� �� �Ҵ�. ������ ȣ��� �ʵ忡 ���� �ο�
class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg; 		// ��� ���
	
	Abc (String name, int studentID, int kor, int eng, int math){
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (double)((kor + eng + math)/3);
	}

	@Override
	public void close() throws Exception {
			// �ʱ�ȭ ���� �޸��� ���� ���
		System.out.println(name);
		System.out.println(studentID);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(avg);
		
		if( name != null || studentID != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
			name = null; 
			studentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
			// �ʱ�ȭ ���� �޸��� ���� ���
			System.out.println("========================");
		}
	}
}

public class EX_TryWithResource_3 {

	public static void main(String[] args) {
		// 1. ��ü�� ��� �ʵ带 �ʱ�ȭ �ϰ� �ڵ����� close ();
		try (Abc abc1 = new Abc("������", 1, 90, 80, 70 );){
			
		} catch(Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
			
		} // close() ȣ�� ���̵� �ڵ����� close()
		
		
		
		// 2. ���� close(), finally ������� close() ȣ��
		Abc abc2 = null;
		
		try {
			abc2 = new Abc("�̼���", 2, 90, 70, 55);
		}catch(Exception e) {
			
		}finally {
			if(abc2.name != null || abc2.studentID != 0 || abc2.kor != 0 || abc2.eng != 0 || abc2.math != 0 || abc2.avg != 0.0) {
				try {
					abc2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
