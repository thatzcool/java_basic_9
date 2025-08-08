package javabasic_02.day12.homework._1;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);


		if(cheatableChicken instanceof Cheatable){
			cheatableChicken.fly();

		}

//		if(chicken instanceof Cheatable){
//			chicken.fly(); // Animal클래스에서 fly가 정의 되어있지 않기 때문에 
//		}
		
		for(int i = 0; i<3; i++){
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
			System.out.println((i+1)+"시간 후");
			System.out.println("개의 이동거리= "+dog.distance);
			System.out.println("닭의 이동거리= "+chicken.distance);
			System.out.println("날으는 닭의 이동거리= "+cheatableChicken.distance);
		}
	}
}












