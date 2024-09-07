import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    Map<String, Icon> cache;

    public FlyWeightFactory(){
        this.cache = new HashMap<>();
    }

    public Icon createIcon(String type, Image image){
        if(type.equals("file")){
            if(cache.containsKey(type))
                return cache.get(type);
            Icon fileIcon = new FileIcon(type,image);
            cache.put(type,fileIcon);
            return fileIcon;
        }
        else if(type.equals("directory")){
            if(cache.containsKey(type))
                    return cache.get(type);
            Icon directoryIcon = new DirectoryIcon(type,image);
            cache.put(type,directoryIcon);
            return directoryIcon;
        }
        else{
            System.out.println("Invalid Type");
            return null;
        }
    }

}
