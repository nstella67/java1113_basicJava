package oop1130;

abstract class Travel {	//�߻�Ŭ����
	public void line() {}
	abstract public String travelWhere();	//�߻�޼ҵ�
}//class end

class AType extends Travel {
	@Override
	public String travelWhere() {
		return "���ֵ� �÷���";
	}
}//class end

class BType extends Travel {
	@Override
	public String travelWhere() {
		return "���ǵ� �Ҳ�����";
	}
}//class end

class CType extends Travel {
	@Override
	public String travelWhere() {
		return "���� ������";
	}
}//class end

//------------------------------------------------------------------
public class AbstractTest2 {
	public static void main(String[] args) {
		
		// �߻�Ŭ������ ��ü ���� �Ұ�
		// Travel tour = new Travel(); ����
		
		// �߻�Ŭ���������� ������
		Travel tour = new AType();
		System.out.println(tour.travelWhere());
		
		tour = new BType();
		System.out.println(tour.travelWhere());
		
		tour = new CType();
		System.out.println(tour.travelWhere());
				
	}//main() end
}//class end
