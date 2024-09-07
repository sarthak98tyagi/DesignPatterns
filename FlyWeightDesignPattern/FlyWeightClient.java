import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;
import java.util.ArrayList;
import java.util.List;

public class FlyWeightClient {

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        Image fileImage = new BufferedImage(10,10,1);
        for(int i=0;i<20;i++){
            Icon fileIcon = factory.createIcon("file",fileImage);
            fileIcon.draw(2+i,3+i);
            System.out.println(fileIcon.hashCode());
        }
    }
}
