package main.com.file.hasher;

import java.io.IOException;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 05/09/2013
 * Time: 22:00
 * To change this template use File | Settings | File Templates.
 */
public interface IHashMaker {

    public int findHashes(List<String> file) throws IOException;
}
