package question1;

public class SelectRuntime {
    public void selection (int first , int second) {

        int firstAbs = Math.abs(first);
        int secondAbs = Math.abs(second);


        if (first > 0 && second >0) {
            if (first > second){
                System.out.println("A에서 J방향으로 " +second+"분 걸립니다");
            }
            else {
                System.out.println("A에서 B방향으로 "+first+"분 걸립니다");
            }
        }
        else if (first <0 && second >0) {
            if (firstAbs>second) {
                System.out.println("A에서 J방향으로 "+second+"분 걸립니다");
            }
            else {
                System.out.println("A에서 J방향으로 "+firstAbs+"분 걸립니다");
            }
        }
        else if (first >0 && second <0) {
            if (first > secondAbs) {
                System.out.println("A에서 B방향으로 "+secondAbs+"분 걸립니다");
            }
            else {
                System.out.println("A에서 B방향으로 "+first+"분 걸립니다");
            }
        }
        else {
            if (firstAbs > secondAbs) {
                System.out.println("A에서 B 방향으로 "+secondAbs+"분걸립니다");
            }
            else {
                System.out.println("A에서 J 방향으로 "+firstAbs+"분 걸립니다");
            }
        }
    }



}

