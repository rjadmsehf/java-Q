package question1;

public class SubwaySelectionJ {  public int subwaySelection (String station) {

    int runningtime = 0;

    switch (station) {

        case "A" :

            runningtime += 11;

        case "J" :

            runningtime +=9;

        case "I" :

            runningtime +=8;

        case "H" :

            runningtime +=7;

        case "G" :

            runningtime +=3;

        case "F" :

            runningtime +=12;

        case "E" :

            runningtime +=5;

        case "D" :

            runningtime +=2;

        case "C" :

            runningtime +=4;

        case "B" :

            runningtime +=10;

    }

    return runningtime;
}


}
