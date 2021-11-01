# SOLID 원칙

## 1. 단일책임 SRP(Single Responsibility Principle) 원칙
- 단일 책임 원칙이란 객체는 단 하나의 책임만을 가져야 하는 것을 의미한다. 
- why? - 요구사항의 변경이 있을 때 가능한 영향받는 범위를 줄여야 한다.

### 책임? 
- 책임이란 해야 하는 것 혹은 할 수 있는 것을 의미한다. 
- 객체에 책임을 할당할 때는 책임에 수반되는 모든 일을 자신만이 수행할 수 있어야 한다. 
- ex) 서비스 로직, DB 연동 작업 등을 하나의 객체가 수행해서는 안된다

### 책임분리 & 분산된 하나의 책임을 통합(산탄총 수술)
#### 책임분리 
- 하나의 클래스가 여러 가지 책임을 맡고 있는 경우 책임 단위로 클래스를 분리하여 설계
#### 분산된 하나의 책임을 통합(산탄총 수술) 
- 하나의 책임이 여러개의 클래스들로 분산되어 있는 경우에도 단일 책임 원칙에 입각해 설계를 변경해야한다 
- 여러 클래스에서 분산되어 사용되는 횡단 관심사를 별개의 클래스로 분리해 책임을 담당하게 한다. (즉, AOP)

----

## 2. 개방-폐쇄 OCP(Open-Closed Principle) 원칙
- 개방 폐쇄 원칙이란 기존의 코드를 변경하지 않으면서 기능을 추가할 수 있도록 설계가 되어야 한다는 것을 의미한다.
- 즉, 확장에 대해서는 개방(Open) 되어 있고 수정에 대해서는 폐쇠(Close) 되어 있어야한다는 것이다.
#### OCP 구현방법
- 확장이 필요한 행위를 추상화(Abstraction) 한다.
- 추상화된 부분은 외부에서 주입한다.
![ocp](https://github.com/jadenkim94/java_designpattern/blob/main/src/main/java/chapter3/img/ocp_abstraction.png)

----

## 3. 리스코프 치환(Liskov Substitution Principle) 원칙

- LSP를 만족하려면 는 자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행할 수 있어야 한다.
- LSP를 만족하면 부모 클래스의 인스턴스를 자식 클래스 인스턴스로 대체해도 된다.
- LSP를 만족하는 가장 직접적이고 직관적인 방법은 '오버라이딩'을 하지 않는 것 


---- 

## 4. 의존 역전(Dependency Inversion Principle) 원칙 

- 의존역전 원칙이란 변화하기 어려운 것에 의존하라는 원칙이다.
- 변하기 어려운 것이란 정책, 전략과 같은 큰 흐름이나 개념이고 변하기 쉬운 것은 구체적인 방식, 사물과 같은 것
- 즉, 인터페이스나 추상 클래스와 같은 추상체에 의존관계를 맺는 것임 

----

## 5. 인터페이스 분리(Interface Segregation Principle) 원칙

- 클라이언트는 자신이 이용하지 않는 기능에는 영향을 받지 않아야한다. 인터페이스 분리 원칙이란 이를 위해서 인터페이스를 클라이언트에 특화되도록 분리 하는 것을 의미한다. 
#### 인터페이스 분리전
![인터페이스분리전](https://github.com/jadenkim94/java_designpattern/blob/main/src/main/java/chapter3/img/%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%EB%B6%84%EB%A6%AC%EC%A0%84.png)

#### 인터페이스 분리후
![인터페이스분리후](https://github.com/jadenkim94/java_designpattern/blob/main/src/main/java/chapter3/img/%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%EB%B6%84%EB%A6%AC%ED%9B%84.png)

