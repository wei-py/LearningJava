import java.io.*;

public class HelloWorld {

    public static void main(String[] args) throws IOException {
//        FileOutputStream fop = new FileOutputStream(new File("a.txt"));
//        OutputStreamWriter writer = new OutputStreamWriter(fop, "utf-8");
//        writer.append("👻");
//        writer.append("\nlook\n");
//        writer.append("🧐");
//        writer.close();
//        fop.close();
        FileInputStream fip = new FileInputStream(new File("a.txt"));
        InputStreamReader reader = new InputStreamReader(fip, "utf-8");
        StringBuffer sb = new StringBuffer();
        while(reader.ready()) sb.append((char) reader.read());
        System.out.println(sb.toString());
        reader.close();
        fip.close();
    }
}
