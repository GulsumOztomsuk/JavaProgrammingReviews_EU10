package week18_07_01_2023.abstraction;

public class TestOracle {
    public static void main(String[] args) {
        OracleDatabase oracleDatabase=new OracleDatabase();
        oracleDatabase.save("Adam");
        System.out.println(oracleDatabase.names);
        oracleDatabase.save("harun");
        System.out.println(oracleDatabase.names);
        oracleDatabase.delete("Adam");
        System.out.println(oracleDatabase.names);

        oracleDatabase.update("Harun","Doğukan");
        System.out.println(oracleDatabase.names);
    }
}
