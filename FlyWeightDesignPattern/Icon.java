import java.awt.Image;

public abstract class Icon {

    private String type;
    private Image image;

    public Icon(String type, Image image){
        this.type = type;
        this.image = image;
    }

    public abstract void draw(int x, int y);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
