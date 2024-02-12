package question1;

public class SubwaySelectionB {
    public int subwaySelection (String station) {

        int runningtime = 0;

        switch (station) {

            case "A" :

                runningtime += 10;

            case "B" :

                runningtime +=4;

            case "C" :

                runningtime +=2;

            case "D" :

                runningtime +=5;

            case "E" :

                runningtime +=12;

            case "F" :

                runningtime +=3;

            case "G" :

                runningtime +=7;

            case "H" :

                runningtime +=8;

            case "I" :

                runningtime +=9;

            case "J" :

                runningtime +=11;



        }

        return runningtime;
    }
}
