## Java Design Pattern



## 책임사슬 패턴 (Chain of Responsibility Pattern)

>  다양한 처리방식을 유연하게 처리할 수 있다.



![image-20200420191016043](21_Chain_of_Responsibility.assets/image-20200420191016043.png)



`Handler`는 추상클래스, 다음번에 처리할 객체들을 가지고 있다.

process가 실패할 경우 다음번 객체로 넘겨준다.





