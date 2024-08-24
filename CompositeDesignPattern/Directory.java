import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private String name;
    private List<FileSystem> fileSystemList;

    public Directory(String name){
        this.name = name;
        this.fileSystemList = new ArrayList<>();
    }

    public void append(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls(int indent) {
        for(int i=0;i<indent;i++)
            System.out.print("\t");
        System.out.println("Directory: "+name);
        for(FileSystem fileSystem: fileSystemList){
            fileSystem.ls(indent+1);
        }
    }
}
