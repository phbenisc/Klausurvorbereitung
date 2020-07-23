package philip.divide.and.conquer;


public class Binar {

    String binar(int number) {
        if (number == 0) {
            return "0";
        }

        return binar(number / 2) + number % 2;
    }

}
