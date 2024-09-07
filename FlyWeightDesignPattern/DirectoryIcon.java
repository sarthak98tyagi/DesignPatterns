import java.awt.Image;

public class DirectoryIcon extends Icon{

    public DirectoryIcon(String type, Image image) {
        super(type, image);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing file icon "+x+" "+y);
    }
}
