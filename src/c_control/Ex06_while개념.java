package c_control;

public class Ex06_while개념 {
public static void main(String[] args) {
	
	int sum = 0;
	int i=1;
	//for(; i<=3; ) {
	
	
	//do while문
	 do{
		sum = sum+=i;
		
		i++;
	}while(i<=3);
	System.out.println("sum : " + sum);
	
	//while문
	/*while(i<=3) {
		sum = sum+=i;
		
		i++;
	}
	System.out.println("sum : " + sum);*/
	
}
}

/*
for : 반복의 횟수가 정해져 있을 때
while : 반복의 횟수가 정해져 있지 않을 때
while : 조건문이 앞에 있는 경우
do while : 조건문이 뒤에 있는 경우 -> 단 한번이라도 수행할 때
*/