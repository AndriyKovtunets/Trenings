// абстрактный класс человека
public abstract class Person {
      
    private String name;
       
    public String getName() { return name; }
     
    public Person(String name){
      
        this.name=name;
    }
   
    public abstract void displayInfo();
}
// класс служащего компании
class Employee extends Person{
  
    private String company;
      
    public Employee(String name, String company) {
      
        super(name);
        this.company=company;
    }
      
    public String getCompany(){
      
        return this.company;
    }
      
    public void displayInfo(){
          
        System.out.println("Имя: " + super.getName() + " Работает в : " + company);
    }
}
// класс клиента банка
class Client extends Person{
      
    private int sum; // Переменная для хранения суммы
    private int percentage; // Переменная для хранения процента
    private String bank;
      
    public Client(String name, String bank, int sum, int percentage) {
      
        super(name);
        this.bank=bank;
        this.sum=sum;
        this.percentage=percentage;
    }
      
    public void displayInfo(){
          
        System.out.println("Имя: " + super.getName() + " Имеет счет в банке: " + bank);
    }
      
    public String getBank(){
      
        return this.bank;
    }
      
    public int getSum(){
      
        return this.sum;
    }
    public int getPercentage(){
          
        return this.percentage;
    }
}