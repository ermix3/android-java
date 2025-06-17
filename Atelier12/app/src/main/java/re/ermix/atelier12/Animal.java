package re.ermix.atelier12;

public class Animal {
    private String name;
    private int imageResource;
    private int soundResource;
    private String description;

    public Animal(String name, int imageResource, int soundResource, String description) {
        this.name = name;
        this.imageResource = imageResource;
        this.soundResource = soundResource;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getSoundResource() {
        return soundResource;
    }

    public String getDescription() {
        return description;
    }
}