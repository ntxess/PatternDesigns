import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Main {
    static Map<String, Long> getPerTaggeeCount(String FullPathname){
        try{
            File newFile = new File(FullPathname);
            InputStream fileInputStream = new FileInputStream(newFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
            String line0 = br.readLine();
            int textIndex = Arrays.asList(line0.split(",")).indexOf("text");
            Map<String, Long> xx = br.lines()
                    .parallel()
                    .map((x) -> x.split(",")[textIndex])
                    //.flatMap(text -> Arrays.stream(text.split(" ")))
                    //.collect(Collectors.toList());
                    .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
            return xx;
        }
        catch (Exception e) {
            System.out.println(e.toString());
            return new HashMap<String, Long>(0);
        }
    }

    static List<String> getPerTaggeeCount2(String FullPathname){
        try{
            File newFile = new File(FullPathname);
            InputStream fileInputStream = new FileInputStream(newFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
            String line0 = br.readLine();
            int textIndex = Arrays.asList(line0.split(",")).indexOf("text");
            List<String> xx = br.lines()
                    .parallel()
                    .map((x) -> x.split(",")[textIndex])
                    //.flatMap(text -> Arrays.stream(text.split(" ")))
                    .collect(Collectors.toList());
            //.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
            return xx;
        }
        catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public static void main(String args[]) throws IOException {
        //System.out.println(getPerTaggeeCount("testfile.csv"));
        System.out.println(getPerTaggeeCount2("testfile.csv"));
    }
}
