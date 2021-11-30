public class Demo {

    public static void main(String[] args) throws ThePageNotFound {
        INotepad securedNotepad = new SecuredNotePad("123");

        securedNotepad.createPage("Hi", "Text1");
        securedNotepad.createPage("Hello", "Text2");
        securedNotepad.createPage("How are you", "Text3");
        securedNotepad.createPage("What you do ?", "Text4");
        securedNotepad.createPage("The next page ", "Text5");
        try {
            securedNotepad.replaceText(2, "bla");
        } catch (ThePageNotFound e) {
            e.printStackTrace();
        }


        try {
            securedNotepad.delText(3);
        } catch (ThePageNotFound e) {
            e.printStackTrace();
        }

        securedNotepad.viewAllPage();
//                INotepad myNotepadNiki = new SimpleNotePad();
//
//        myNotepadNiki.createPage("Title1", "Text1");
//        myNotepadNiki.createPage("Title2", "Text2");
//        myNotepadNiki.createPage("Title3", "Text3");
//        myNotepadNiki.createPage("Title4", "Text4");
//        myNotepadNiki.createPage("Title5", "Text5");
//
//
//        try {
//            myNotepadNiki.replaceText(33, "ReplacedText");
//        } catch (ThePageNotFound e) {
//            e.printStackTrace();
//        }
//
//        try {
//            myNotepadNiki.delText(10);
//        } catch (ThePageNotFound e) {
//            e.printStackTrace();
//        }
//
//        myNotepadNiki.viewAllPage();

    }


}
