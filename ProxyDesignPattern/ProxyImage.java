public class ProxyImage implements Graphic{

    Graphic image;

    @Override
    public void display(String role, String fileName) {
        //lazy loading
        if(image==null){
            image = new Image();
        }
        if(role.equals("USER")){
            long start = System.currentTimeMillis();
            image.display(role,fileName);
            long end = System.currentTimeMillis();
            long dur = end - start;
            System.out.println("Image Displayed, time taken= "+dur);
        }
        //Access Restriction
        else{
            System.out.println("Access Restricted for role "+role);
        }
    }
}
