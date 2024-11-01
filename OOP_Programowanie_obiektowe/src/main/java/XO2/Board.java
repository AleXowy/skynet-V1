package XO2;


import java.util.ArrayList;
import java.util.List;

public class Board {

List<GameArea> boardList = new ArrayList<>();

    public void showBoard() {
        boardList.add(GameArea.A1);
        boardList.add(GameArea.A2);
        boardList.add(GameArea.A3);
        boardList.add(GameArea.B1);
        boardList.add(GameArea.B2);
        boardList.add(GameArea.B3);
        boardList.add(GameArea.C1);
        boardList.add(GameArea.C2);
        boardList.add(GameArea.C3);

        System.out.println("Pole gry wygląda następująco:\n" +
                "     " + GameArea.A1.getArea() + " | " + GameArea.A2.getArea() + " | " + GameArea.A3.getArea() + "\n" +
                "     --------------\n" +
                "     " + GameArea.B1.getArea() + " | " + GameArea.B2.getArea() + " | " + GameArea.B3.getArea() + "\n" +
                "     --------------\n" +
                "     " + GameArea.C1.getArea() + " | " + GameArea.C2.getArea() + " | " + GameArea.C3.getArea() + "\n");
    }
}
