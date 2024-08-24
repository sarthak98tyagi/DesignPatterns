public class AdapterClient {

    public static void main(String[] args) {
        Adapter typeBToTypeC = new TypeBtoTypeCAdapter(new TypeBCharger());
        typeBToTypeC.charge();
    }
}
