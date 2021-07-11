package Patterns.Behavioral.TemplateMethod;

public class PhoneNewsProvider extends NewsProvider{

  private String phoneNumber;

  public PhoneNewsProvider(String phoneNumber, String message){
    super(message);
    this.phoneNumber=phoneNumber;
  }

  @Override
  public boolean authorize() {
    if(phoneNumber!=null){
      System.out.println(" Authorisation with phone number : " + phoneNumber);
      return true;
    }
    return false;
  }
  @Override
  public boolean endConnection(){
    return super.endConnection();
  }
}
