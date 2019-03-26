package FileExp;

import java.io.File;

public class JavaFileAPI {
    public static void main(String[] args) throws Exception{
        File file=new File("d:\\mldn.txt");
        if(file.exists())
        {
            file.delete();
        }
        else
        {
            System.out.println(file.createNewFile());
        }
    }
}
