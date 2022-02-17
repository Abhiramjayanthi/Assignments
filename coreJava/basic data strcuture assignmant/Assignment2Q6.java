abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "This is FilePersistance";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "This is DatabasePersistance";
    }
}
class Client extends Persistence{
	 

	@Override
	public String persist() {
		// TODO Auto-generated method stub
		return "Invoking Presist Method......";
	}
	
}
public class Assignment2Q6 {
    public static void main(String[] args) {
    	Client client=new Client();
    	System.out.println(client.persist());
    }
}