public class ServicePerson {
    public void savePerson(Person person) {
        PersonDatabase personDatabase = new MySql();
        personDatabase.saveDataObject(person);
    }
}