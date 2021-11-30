import java.util.ArrayList;
import java.util.List;

/**
 * This class is a simple notebook and implement interface INotepad
 * variables parameters and methods for the class
 */

public class SimpleNotePad  implements INotepad{

    /**
     * Here create Collection of Page
     */
    private List<Page> pages;


    /**
     * Constructor Create a new array of collection
     */
    protected SimpleNotePad(){
        this.pages= new ArrayList<>();
    }

    /**
     * This method Create new Collection of Page and add Title and Text
     *
     * @param title accept values of String for method
     * @param text accept values of String for method
     */

    @Override
    public void createPage(String title, String text) {
         Page newPages =new Page(title,text);
         pages.add(newPages);
         newPages.setPageNum(this.pages.size());


    }

    /**
     * This method replace the text of exist Page  whit new text
     *
     * @param pageNum accept values of int for method
     * @param text accept values of String for method
     * @throws ThePageNotFound is exception for method
     */

    @Override
    public void replaceText(int pageNum, String text) throws ThePageNotFound {
        Page newText = findPage(pageNum);
        newText.delText();
        newText.addText(text);


    }

    /**
     * This method delete exist text from Page
     *
     * @param pageNum accept values of int for search the page
     * @throws ThePageNotFound exception for method
     */
    @Override
    public void delText(int pageNum) throws ThePageNotFound {
        Page thePage = findPage(pageNum);
        thePage.delText();
    }

    /**
     *
     * This method is for view all content of exist Page
     */
    @Override
    public void viewAllPage() {
        for (Page thePage:pages ) {
            System.out.println(thePage.viewAllPage());

        }

    }

    /**
     * This method you find page by page number
     * @param pageNum accept values of int for method
     * @return the page
     * @throws ThePageNotFound exception whit messages and page number
     */

    private Page findPage(int pageNum) throws ThePageNotFound{
        for(Page thePage :pages){
            if (thePage.getPageNum()==pageNum){
                return  thePage;
            }

        }
       throw  new ThePageNotFound("The page not found" +pageNum);
    }
}
