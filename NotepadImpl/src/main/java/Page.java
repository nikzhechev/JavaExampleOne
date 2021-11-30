
/**
 *
 *  This class reproduces Page
 *  variables parameters and methods for the class
 * @author Nikolay Zhechev
 */

public class Page {



    /**
     * These are variables for the class and what values they accept
     */

    private String title;
    private String pageText;
    private int pageNum;

    /**
     * Тhis Constructor assigns a Title and adds text to the Page
     *
     * @param title  accepts values of String
     * @param pageText accepts values of String
     */

    public Page(String title,String pageText){

        this.pageText=pageText;
        this.title=title;


    }

    /**
     * This method return page number value by int
     *
     * @return page number
     */


    public int getPageNum() {
        return pageNum;
    }

    /**
     * This method set a page number
     *
     * @param pageNum accept values of int
     */

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * This method get Title of Page
     *
     * @return title of page
     */

    public String getTitle() {
        return title;
    }

    /**
     * This method set Title of Page
     *
     * @param title accept values of String
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method you see the text on the whole page
     *
     * @return whole page text
     */

    public String getPageText() {
        return pageText;
    }

    /**
     * This method you set the text of the page
     *
     * @param pageText accept values of String for the method
     */

    public void setPageText(String pageText) {
        this.pageText = pageText;
    }

    /**
     * This method you write new text on the page whit exist text
     *
     * @param newText accept values of Sting for method
     */

    void addText(String newText){
        this.pageText=pageText+newText;

    }

    /**
     * This method you delete the whole text on the page
     *
     */
    void delText(){
        this.pageText="";
    }

    /**
     * This method you see all Page exist
     *
     * @return view Title text and number of the all Page
     */
    String viewAllPage(){
        return this.title + "\n"+ this.pageText +"\n"+ this.pageNum;
    }



}
