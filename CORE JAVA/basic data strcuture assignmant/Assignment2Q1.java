class SingletonInheritanceCheck{
  private static SingletonInheritanceCheck sInstance = null;
  public String msg;
  private SingletonInheritanceCheck()
  {
      msg = "Singleton Test";
  }
  public static SingletonInheritanceCheck getInstance()
  {
      if (sInstance == null)
          sInstance = new SingletonInheritanceCheck();
      return sInstance;
  }
}
public class Assignment2Q1 {

	public static void main(String[] args) {
		SingletonInheritanceCheck obj = SingletonInheritanceCheck.getInstance();
		System.out.println(obj.msg);

	}

}