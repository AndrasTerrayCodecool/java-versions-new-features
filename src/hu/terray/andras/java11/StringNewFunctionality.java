package hu.terray.andras.java11;

import java.util.stream.Collectors;

public class StringNewFunctionality {
    public static void main(String[] args) throws Exception {
        System.out.println(" ".isBlank()); //true

        // blank()
        String s = "Anupam";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true

        // lines()
        String str = "JD\nJD\nJD";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));

        // strip() which is “Unicode-aware” evolution of trim().
        String s2 = " JD ";
        System.out.print("Start");
        System.out.print(s2.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(s2.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(s2.stripTrailing());
        System.out.println("End");

        // repeat()
        String s3 = "=".repeat(2);
        System.out.println(s3);
    }
}
