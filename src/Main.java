import org.w3c.dom.CDATASection;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x="a-b-c\n",ans;
        String[] a = x.split("-");
        ans = Day.fortune(1,2);
        System.out.println(ans);


    }
}
