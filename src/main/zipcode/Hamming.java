package zipcode;

public class Hamming {
    String hammy1;
    String hammy2;

    public Hamming(String s, String s1) throws IllegalArgumentException {
        this.hammy1 = s;
        this.hammy2 = s1;

        if(hammy1.length() != hammy2.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int counter = 0;

            for (int i = 0; i < hammy1.length(); i++) {
                if (hammy1.charAt(i) != hammy2.charAt(i)) {
                    counter++;
                }
            }
            return counter;
    }
}
