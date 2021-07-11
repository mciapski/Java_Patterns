package Patterns.Behavioral.Command;

public class CreateFileContentOperation implements Operation{
  private MyFile myfile;

  public CreateFileContentOperation(MyFile myfile) {
    this.myfile = myfile;
  }

  @Override
  public String performOperation(String content) {
    //sprawdzenie uprawnień, logowanie czynności i samo pisanie do pliku
    System.out.println(getClass().getSimpleName() + " called for " + myfile.getFileName());
    return myfile.writeFile(content);
  }
}
