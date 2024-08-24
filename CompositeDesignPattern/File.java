public class File implements FileSystem{

    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void ls(int indent) {
        for(int i=0;i<indent;i++)
            System.out.print("\t");
        System.out.println("File: "+name);
    }
}
