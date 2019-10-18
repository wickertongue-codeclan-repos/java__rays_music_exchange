package instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String material, String colour, String type, int numberOfStrings) {
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String plays() {
        return "Twaaaaang";
    }

}
