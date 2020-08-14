package first.xyz;

import org.apache.commons.lang3.StringEscapeUtils;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {

        String s ="<p>Hello World Using Template</p>";
        System.out.println( StringEscapeUtils.escapeHtml4(s));
        System.out.println("Hello world");
    }
}
