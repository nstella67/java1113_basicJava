package oop1119;

public class TrainingM {

	public static void main(String[] args) {
		// 문) 어느 달팽이는 낮에는 3cm 올라가고
		//		밤에는 2.5cm 내려온다고 할 때
		//		달팽이가 13cm의 나무 꼭대기에 올라가려면
		//		며칠이 걸리는지 구하시오
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