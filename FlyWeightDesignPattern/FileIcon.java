import java.awt.Image;

public class FileIcon extends Icon{


    public FileIcon(String type, Image image) {
        super(type, image);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing file icon "+x+" "+y);
    }

}
