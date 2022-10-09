package Week05_08_10_2022;

public class EncryptPassword {
    public static void main(String[] args) {
        /*
        Task 9: Given a string password. Encrypt with "x" a given password and print.
    Hint: do with for loop
     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
        String password="cydeo";
        char encryptWith='x';
        String encryptPassword="";
        for (int i=0; i<password.length(); i++){
            //encryptedPassword = encryptedPassword + password.charAt(i) + encryptWith;
            encryptPassword +=""+password.charAt(i)+encryptWith;
            // 1. iter CX
            // 2. iter yX

        }
        System.out.println(encryptPassword);

    }
}
