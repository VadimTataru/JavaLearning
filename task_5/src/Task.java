import java.io.*;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("Task_5.txt");
            System.out.println("File is included!");
            String[] Strokes = SplitFile(reader);
            String[] words_1 = new String[40];
            String[] words_2 = new String[40];

            RewriteFile(Strokes, words_1, words_2 );


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String[] SplitFile(FileReader file) {
        BufferedReader reader = new BufferedReader(file);
        String line;
        List<String> lines = new ArrayList<String>();
        try {
            while ((line = reader.readLine()) != null) {
                lines.add(line);
                System.out.println(line + " " + lines.size());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String [] linesAsArray = lines.toArray(new String[lines.size()]);
        return linesAsArray;
    }

    public static void RewriteFile(String[] strokeArray, String[] line_1, String[] line_2) {
        try {
            File result = new File("c://Users//Вадим//IdeaProjects//task_5//result.txt");
            FileWriter writer = new FileWriter(result);
            line_1 = strokeArray[0].split(" ");
            line_2 = strokeArray[1].split(" ");
            List<String> resultStroke = new ArrayList<String>();
            for (int i = 0; i < line_1.length; i++) {
                for (int j = 0; j < line_2.length; j++) {
                    if(line_1[i].contains(line_2[j])) {
                        resultStroke.add(line_1[i]);
                    }
                }

            }

            writer.write(resultStroke.toString());
            writer.close();
        } catch (IOException ex) {
            ex.getMessage();
        }

    }
}
