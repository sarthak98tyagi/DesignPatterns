public class CompositeClient {

    public static void main(String[] args) {
        Directory directory = new Directory("Movies");
        directory.append(new File("Maharaja"));
        Directory comDirectory = new Directory("Comedy");
        directory.append(comDirectory);
        comDirectory.append((new File("Welcome")));
        Directory romCom = new Directory("Rom Com");
        romCom.append(new File("Notting Hill"));
        comDirectory.append(romCom);
        directory.ls(0);

    }

}
