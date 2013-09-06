package main.com.file.hasher;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 05/09/2013
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class HashMaker  {

    public int hash(ArrayList<String> filePaths,IHashMaker hasher) throws IOException {
        return hasher.findHashes(filePaths);
    }

}
