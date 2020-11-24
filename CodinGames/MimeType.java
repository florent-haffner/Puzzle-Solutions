import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.math.*;

class Solution {

    static Pattern pattern;
    static Matcher matcher;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        Map mimeType = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.

            mimeType.put(EXT, MT);
        }
        in.nextLine();

        // TODO : only for dev purpose
        System.out.println(mimeType);

        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            System.out.println("FNAME");
            System.out.println(FNAME);

            pattern = Pattern.compile("");
            matcher = pattern.matcher("");

            // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
            if (matcher.find()) {
                System.out.println("MIME TYPE ASSOCIATED IN FNAME");
            } else {
                System.out.println("UNKNOWN");
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }
}
