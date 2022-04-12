package Chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		// 1. ���� ���ҽ� ����. (���� ���α׷��� ���) -- �ڵ尡 ��� ������ �ϴ�.
		System.out.println("���ڸ� �Է� �ϼ��� !");
		
		
		
		InputStreamReader isr2 = null ; 		// ��� �� �ݵ�� �޸𸮿��� ��ü�� ����, isr2.close()
		// System.in : �ֿܼ��� �Է��� �޵��� ó�� . 1���� ��ǲ�� ���� �� �ִ�. 
		// ��ü�� ���� �Ǹ� �� �� ��ǲ�� ���� ���Ѵ�.
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read(); 		// �Ϲݿ���(checked ����) : IOException : �Է� ��� ����
			System.out.println("�Է±��� = " + input);
		}catch(IOException e) {
			e.printStackTrace(); 	// try{} ������� ���ܰ� �߻��� ��� �ڼ��� ������ ���
		}finally { 		// ��ü�� ��� �Ŀ� �޸� �������� ����
		// ���ҽ� ���� : isr2.close()
			
			if(isr2 != null) {
				try{
					isr2.close(); 			// �Ϲ� ���� : IOException
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		// 2. �ڵ� ���ҽ� ����. (Java 1.7 �ڵ����� ���ҽ��� ����) -- �ڵ尡 �����ϴ�. (�ʿ� ������ �ִ�.)
			// 1. ����ϴ� ��ü�� AutoCloseable �������̽��� ������ ��ü���� �Ѵ�.
			// 2. �ݵ�� ��ü�� close()�� �ݵ�� �����ؾ� �Ѵ�.
			// ���� 2���� ������ ������ �� �ڵ� ���ҽ� ����
			// try(�ڵ����� ���ҽ��� ������ ��ü ���� ) {} catch{} finally{}
		
		
		// InputStreamReader�� AutoCloseable �������̽��� �����ϰ� �ִ�. close() ���� �ִ�.
		// Try with Resource : try(with resource : ��ü �޸� �ε�){}
		try(InputStreamReader isr1 = new InputStreamReader(System.in); ){
			char input = (char)isr1.read();
			System.out.println("�Է±��� = " + input);
		}catch (IOException e){
			e.printStackTrace();
		} // finally ����� �����ϴ��� ��ü�� �ڵ����� isr1.close()
		
	}

}
