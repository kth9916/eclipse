package Chap16.EX06.EX1;

// ���ʸ� Ŭ���� : �پ��� Ÿ���� ����� �� �ִ� Ŭ����
public class GenericPrinter <T extends Material> { 		// �پ��� ���� ������ �ϴ� ������(�Ŀ��, �ö�ƽ, ��)

					// T : Ÿ������, Material ���� Ŭ������ T Ÿ�Կ� ��� �� �� �ִ�.
	
	private T material ; 		// material : ��������, ��ü, �ν��Ͻ�,
	
	public T getMaterial() { 		// ��ü�� ����
		return material;
	}
	
	public void setMaterial(T material) { 		// ��ü�� Ȱ��ȭ
		this.material = material;
	}

		
	@Override
		public String toString() {  		// �ش� ��ü�� toString() �޼ҵ� ȣ��
			return material.toString();
		}

	public void printing() { 		// �޼ҵ常 ����
		material.doPrinting();
	}
	

}
