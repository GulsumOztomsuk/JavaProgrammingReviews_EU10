package week18_07_01_2023.abstraction;

import java.util.ArrayList;

public abstract class DataBase {
    /*
    -we can have cons inside the abstraction class
    - In order to initialize the common elements or variables in abstract class
  - We are putting rule for the constructor
     */

    /*
  public Database(String name){
  }
   */
    protected ArrayList<String> names=new ArrayList<>();

   //Rule for database
    //1.rule
    abstract void save(String name);
    //2.rule
    abstract void delete(String name);

    //3 rule

    abstract void update(String oldName,String newName);

}
