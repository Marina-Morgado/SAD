import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author marcnueno
 */
public class EditableBufferedReader extends BufferedReader {

    public EditableBufferedReader(Reader in) {
        super(in);
    }

    public void setRaw() {
        String[] command = new String[]{"/bin/sh", "stty -echo raw"};
        try {
            Runtime.getRuntime().exec(command).waitFor(); // Esperem a que el terminal canvi el mode
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void unSetRaw() {
        String[] command = new String[]{"/bin/zsh", "stty -echo cooked"};
        try {
            Runtime.getRuntime().exec(command).waitFor(); // Esperem a que el terminal canvi el mode
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readLine() throws IOException {
        return null;
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }

}
