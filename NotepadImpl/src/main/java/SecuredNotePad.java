import java.util.Scanner;

/**
 * This class is a secured notebook and implement extends SimpleNotePade for create
 * secure notebook
 *
 * And have variables parameters and methods for the class
 */

public class SecuredNotePad extends SimpleNotePad {
    /**
     *  These are variables for the class and what values they accept
     */

    private String password;

    /**
     * Constructor for class to set a password for NotePade
     *
     * @param password accept values of String for Constructor
     */
    public SecuredNotePad(String password) {


        this.password = password;
    }

    /**
     * This method tests the password to see if it matches the user's password
     *
     * @return true or false
     */
    public boolean checkPass() {


        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the password");
            String enterPass = scan.nextLine();
            if (enterPass.equals(password)) {
                System.out.println("Password is Correct");
                return true;

            } else {
                System.out.println("Password is wrong !");
            }


        }
        return false;

    }

    /**
     * This method Create new Collection of Page and add Title and Text in secured notebook
     * if  password matches of user`s
     * or  password don`t matches not create Collection of page
     *
     * @param title accept values of String for method
     * @param text accept values of String for method
     */

    public void createPage(String title, String text) {


        if (checkPass()) {
            super.createPage(title, text);

        } else {
            System.out.println("Error the pass is not this ");
        }

    }

    /**
     *This method replace the text of exist Page  whit new text in secured notebook
     * if password matches of user`s
     * or password don`t matches not replace the text
     *
     * @param pageNum accept values of int for method
     * @param text accept values of String for method
     * @throws ThePageNotFound whit massages
     */

    public void replaceText(int pageNum, String text) throws ThePageNotFound{
        if (checkPass()) {
            super.replaceText(pageNum, text);
        } else {
            System.out.println("Operation replaceText WONT happen");
        }
    }

    /**
     * This method delete exist text from Page in secured notebook
     *
     * @param pageNum accept values of int for search the page
     * @throws ThePageNotFound exception whit messages
     */
    public void delText(int pageNum) throws ThePageNotFound {


            if (checkPass()) {
                super.delText(pageNum);
            }else {
                System.out.println("Operation deleteText WONT happen");
            }

        }


    /**
     * This method view all content of Page in secured notebook
     */
    @Override
    public void viewAllPage() {
        super.viewAllPage();
    }
}
