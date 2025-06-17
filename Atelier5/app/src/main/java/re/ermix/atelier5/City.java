package re.ermix.atelier5;

public class City {
    private String name;
    private int imageResource;

    public City(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}