public class MySql implements PersonDatabase {
    @Override
    public void saveDataObject(Person person) {
        System.out.println("Save person ok...");
    }
}