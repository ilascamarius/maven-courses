package ro.itschool.Curs14.Homework.Exercise10;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private List<Country> countries;

    public List<Country> getAllCountries() {
        return new ArrayList<>(countries);
    }

    //List<Country>countriesAll=new ArrayList<Country>();
    //name= String.valueOf(countriesAll.get(0));

/*public Optional<Country>getCountryByName(){
      for(Country c:countries){
          if(c.getName().equals(name)){
              return Optional.of(c);
          }
      }return Optional.empty();
}*/


}
