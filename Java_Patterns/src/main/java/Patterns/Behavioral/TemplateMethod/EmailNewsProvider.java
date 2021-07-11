package Patterns.Behavioral.TemplateMethod;

public class EmailNewsProvider extends NewsProvider{
  String email;

  public EmailNewsProvider(String email, String message) {
    super(message);
    this.email = email;
  }

  @Override
  public boolean authorize() {
    if(email !=null)
    System.out.println("Email for authorization: " +email);
    return true;
  }

}
