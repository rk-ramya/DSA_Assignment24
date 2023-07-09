package project.demo;

public class Question5 {
	public void isUgly(int num) {
		while(num>0){
			while(num%2 == 0){
				num= num/2;
			}
			while(num%3 ==0){
				num=num/3;
			}
			while(num%5==0){
				num=num/5;
			}
			if(num == 1){
				System.out.println("the number is ugly");
				}
			else{
				System.out.println("the number is not ugly");
			}
		}
		System.out.println("the number is not ugly");
	}
}