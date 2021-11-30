public interface INotepad {


    void createPage(String title, String text);

    void replaceText(int pageNum, String text) throws ThePageNotFound;

    void delText(int pageNum) throws ThePageNotFound;

    void viewAllPage();


}
