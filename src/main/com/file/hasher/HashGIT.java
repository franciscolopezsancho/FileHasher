package main.com.file.hasher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 05/09/2013
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class HashGIT implements IHashMaker {


    private Pattern pattern = Pattern.compile("\\d+");
    private Integer hash;

    public int findHashes(List<String> filePaths) throws IOException {
       hash = 0;
       for(String filePath :filePaths)  {
           findHash(filePath);
       }
       return hash;
    }

    public int findHash(String filePath) throws IOException {
            BufferedReader br = null;

            String sCurrentLine;

            br = new BufferedReader(new FileReader(filePath));

            while ((sCurrentLine = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(sCurrentLine);
                if(matcher.find()){
                    hash +=   new Integer(matcher.group());
                };
            }


        return hash;
    }

}
