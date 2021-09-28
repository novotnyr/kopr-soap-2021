package sk.upjs.ics.kopr;

public class Umbrella {
    private Long id;

    private String color;

    public Umbrella(Long id, String color) {
        this.id = id;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
