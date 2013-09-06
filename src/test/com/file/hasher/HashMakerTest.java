package test.com.file.hasher;


import main.com.file.hasher.HashGIT;
import main.com.file.hasher.HashMaker;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 05/09/2013
 * Time: 21:11
 * To change this template use File | Settings | File Templates.
 */
public class HashMakerTest {
    @Test
    public void findNumberInFile() throws IOException {
        //GIVEN -
            //bucket/file1.txt has one line with a 3 inside
        ArrayList<String> filePahts = new ArrayList<String>(Arrays.asList("bucket/File1.txt"));
        //there is an instance of an HashMaker
        HashMaker hasMak = new HashMaker();
        //WHEN
        Integer hash = hasMak.hash(filePahts, new HashGIT());
        //THEN
        assertEquals(3,hash.intValue());
    }
    @Test
    public void findNumbersInFileAndAddThem() throws IOException {
        //GIVEN -
        //bucket/file1.txt has one line with a 3 and another with a 13
        ArrayList<String> filePahts = new ArrayList<String>(Arrays.asList("bucket/File2.txt"));

        //there is an instance of an HashMaker
        HashMaker hasMak = new HashMaker();
        //WHEN
        Integer hash = hasMak.hash(filePahts, new HashGIT());
        //THEN
        assertEquals(16,hash.intValue());
    }

    @Test
    public void findNumbersInFilesAndAddThem() throws IOException {
        //GIVEN - two files
        //bucket/file1.txt has one line with a 3 inside
        String file1 =  "bucket/File1.txt";
        //bucket/file1.txt has one line with a 3 and another with a 13
        String file2 =  "bucket/File2.txt";

        ArrayList<String> filePahts = new ArrayList<String>(Arrays.asList(file1,file2));

        //there is an instance of an HashMaker
        HashMaker hasMak = new HashMaker();
        //WHEN
        Integer hash = hasMak.hash(filePahts, new HashGIT());
        //THEN
        assertEquals(19,hash.intValue());
    }
}
