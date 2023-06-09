package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = (Vehicle) car; // 상위 클래스 Vehicle 타입으로 변환 -> 업캐스팅 ,형 변환 연산자(괄호) 생략가능
        Car car2 = (Car) vehicle; // 하위 클래스 Car타입으로 형 변환 -> 다운 캐스팅, 형 변환 연산자(괄호) 반드시 명시
        //MotorBike motorBike = (MotorBike) car; // 참조 변수의 타입변환은 상속관계를 전제로 한다.
    }
}