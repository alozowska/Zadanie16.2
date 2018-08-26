import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrzelicznikTekstu {

    public static void pokazInformacje(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        String tekst = request.getParameter("tekst");

        printWriter.println(tekst);
        obliczZnaki(printWriter, tekst);
        obliczBezSpacji(printWriter, tekst);
        obliczWyrazy(printWriter,tekst);
        sprawdzPalindrom(printWriter, tekst);

    }


    public static void obliczZnaki(PrintWriter writer, String tekst){
        writer.println("ilosc wszystkich znakow: " + tekst.length());
    }
    public static void obliczBezSpacji(PrintWriter writer, String tekst){
        String bezSpacji=tekst.replace(" ", "");
        writer.println("ilosc znakow bez spacji: " + bezSpacji.length());
    }
    public static void obliczWyrazy(PrintWriter writer, String tekst){
        String []wyrazy=tekst.split(" ");
        writer.println("ilosc wyrazow: " + wyrazy.length);
    }
    public static void sprawdzPalindrom(PrintWriter writer, String tekst) {
        StringBuilder builder=new StringBuilder();
        String reversed=builder.reverse().toString();
        if(reversed.equals(tekst)){
            writer.println("tekst jest palindromem");
        }else
            writer.println("tekst nie jest palindromem");
    }
}
