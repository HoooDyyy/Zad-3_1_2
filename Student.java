public class Student {

  private String Name;
  private int Age;
  private String Nazwisko;
  private String Born;

  public Student(String name, int age, String nazwisko,String born) {
    Name = name;
    Age = age;
    Nazwisko = nazwisko;
    Born = born;
    
    
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
   public String GetNazwisko() {return Nazwisko;}
  public String GetBorn() {return Born;}

  public String ToString() {
    return Name + " " + Integer.toString(Age)+" "+Nazwisko+" "+Born;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
    return new Student("Parse Error", -1,"Parse Error","Parse Error");
    return new Student(data[0],Integer.parseInt(data[1]),data[2],data[3]);
  }
}