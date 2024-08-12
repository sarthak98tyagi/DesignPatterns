public class ProxyClient {

    public static void main(String[] args) {
        Graphic image = new ProxyImage();
        image.display("USER","check.png");
        image.display("GUEST","check.png");
    }

}
