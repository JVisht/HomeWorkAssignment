import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ReadTextFileThrows {
    public static void main(String[] args) throws IOException {

        FileReader readFile = new FileReader("/Users/sanjaysinghgussain/IdeaProjects/HomeworkAssignment/src/Filedata");

        BufferedReader buffFile =new BufferedReader(readFile);
         String str;

     while ((str = buffFile.readLine()) != null ) System.out.println(str);




}

    }