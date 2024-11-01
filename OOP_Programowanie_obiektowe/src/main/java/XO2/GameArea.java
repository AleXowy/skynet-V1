package XO2;

public enum GameArea {
    A1("a1"), A2("a2"), A3("a3"),
    B1("b1"), B2("b2"), B3("b3"),
    C1("c1"), C2("c2"), C3("c3");

    private String area;

    public void setArea(String area) {
        this.area = area;
    }

    GameArea(String boardPosition) {
        this.area = boardPosition;  //chat gpt need to explain

    }
        public String getArea () {
            return area;
        }

//    GameArea(String boardPosition) {}
//public void GameArea () {}


}


