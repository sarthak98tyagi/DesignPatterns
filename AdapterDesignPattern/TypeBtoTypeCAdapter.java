public class TypeBtoTypeCAdapter implements Adapter{
    private Charger charger;

    public TypeBtoTypeCAdapter(Charger charger){
        this.charger = charger;
    }


    @Override
    public void charge() {
        System.out.println("TypeBToTypeCAdapterConnected");
        charger.charge();
    }
}
