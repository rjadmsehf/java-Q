package question1;

import java.util.Scanner;

public class Application01 {
    /*순환 열차에 따른 최단시간 방향과 최단시간 구하기*/

    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);

        System.out.print("출발역을 적으세요 : ");
        String start = scr.nextLine();

        System.out.print("종착역을 적으세요 : ");
        String end = scr.nextLine();

        SubwaySelectionB selB = new SubwaySelectionB();

        int runtime01 = selB.subwaySelection(start) - selB.subwaySelection(end);

        SubwaySelectionJ selJ = new SubwaySelectionJ();

        int runtime02 = selJ.subwaySelection(start) - selJ.subwaySelection(end);

        SelectRuntime selRes =new SelectRuntime();

        selRes.selection(runtime01,runtime02);



    }
}

