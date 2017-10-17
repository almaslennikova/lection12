package ru.tsystems.javafortesters;

/**
 * I am third and the last type of comments in Java code - javadoc.
 * After processing of special tools you can see me in the API as <font color="red">p</font><font color="blue">r</font><font color="magenta">e</font><font color="green">t</font><font color="orange">t</font>y html.
 * Here placed <bold>javadoc for class</bold>, follow information can be included:
 * <ul>
 *     <li>Author name and email (optional)</li>
 *     <li>Date of creation (optional)</li>
 *     <li>Target and purpose of the class creation, special cases of using or not using
 *     (for example not allowed to use in the static context)</li>
 * </ul>
 */
public class JavaDocs {

    /**
     * <ins>For fields is also possible to set javadoc</ins>. Describe here what is this field about, what can store, it's
     * can be very useful after returning to this code later or for other developers in the team.
     */
    private int simpleField;
    private boolean b1;


    /**
     * <i>Javadoc for methods</i>. Explains contract of the method, means the target of method, input parameters and
     * expected output result for different cases. Be care with changing signature of the method, list of input parameters
     * should be actual.
     */
    public void simpleMethod() {

    }

}
