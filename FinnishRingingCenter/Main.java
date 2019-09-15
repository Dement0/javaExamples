public class Main {
    public static void main(String[] args) {
    
        RingingCentre rt = new RingingCentre();
        rt.observe( new Bird("Nebelkrähe", "Corvus corone cornix", 2000), "Berlin");
        rt.observe( new Bird("Harmaalokki", "Larus argentatus", 2012), "Kumpula");
        rt.observe( new Bird("Varis", "Corvus corone cornix", 2000), "Arabia");
        rt.observe( new Bird("lokki", "Larus argentatus", 2012), "Korso");
        rt.observe( new Bird("Varis", "Corvus corone cornix", 2000), "Kamppi");
        rt.observations( new Bird("Varis", "Corvus corone cornix", 2000) );
    
    }
}
