package Patterns.Structural.Proxy;

/**
 * Proxy może być warstwą zabezpieczającą albo cache(pamięcią podręczną)
 * W naszym przypadku to warstwa zabezpieczająca
 * Przed przyznaniem dostępu sprawdzamy czy człowiek który prosi o dostęp do sieci jest pracownikiem firmy i dajemy
 * dostęp do wszystkich zasobów albo tylko do tych niefirmowych
 *
 * Proxy charakteryzuje się tym, że implementuje go klasa z tej samej rodziny co klasy właściwe
 * (u nas ten sam interfejs CompanyInternetNetwork)
 * Dostęp do klas "właściwych" powinien byc zapewniony tylko z poziomu proxy - weryfikacja
 */
public class ProxyCompanyInternetNetwork implements CompanyInternetNetwork{
  CompanyInternetNetwork internetNetwork;

  @Override
  public void getAccess(String username) {
    if(isEmployee(username)){
      internetNetwork = new PrivateCompanyInternetNetwork(username);
    }else {
      internetNetwork = new PublicCompanyInternetNetwork(username);
    }
    internetNetwork.getAccess(username);
  }

  private boolean isEmployee(String username){
    return CompanyEmployees.isActiveEmployee(username);
  }
}
