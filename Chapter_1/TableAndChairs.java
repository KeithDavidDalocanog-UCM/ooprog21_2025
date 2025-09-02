public class TableAndChairsLoop {
    public static void main(String[] args) {
        for (int line = 1; line <= 6; line++) {
            switch (line) {
                case 1:
                case 2:
                    System.out.println("X                      X");
                    break;
                case 3:
                    System.out.println("X      XXXXXXXXXX      X");
                    break;
                case 4:
                    System.out.println("XXXXX  X        X  XXXXX");
                    break;
                case 5:
                case 6:
                    System.out.println("X   X  X        X  X   X");
                    break;
            }
        }
    }
}