package Patterns.Behavioral.TemplateMethod;

public class TemplateMethodDemo {
  public static void main(String[] args) {
    NewsProvider provider1 = new EmailNewsProvider("aa@bbb.ccc", "some news");
    provider1.provideNews();

    System.out.println("===========");

    NewsProvider provider2 = new PhoneNewsProvider("+48xxxxxx", "other_news");
    provider2.provideNews();
  }
}
