package oop1119;

public class TrainingM {

	public static void main(String[] args) {
		// ��) ��� �����̴� ������ 3cm �ö󰡰�
		//		�㿡�� 2.5cm �����´ٰ� �� ��
		//		�����̰� 13cm�� ���� ����⿡ �ö󰡷���
		//		��ĥ�� �ɸ����� ���Ͻÿ�
		int day=0;
		double distance=0;
		for(;;) {
			day++;
			distance=distance+3;
			if(distance>=13) {
				break;
			}else {
				distance=distance-2.5;
			}
		}
		System.out.println(day);
		
	}
}