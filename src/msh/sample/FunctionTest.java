package msh.sample;

import io.github.benas.unixstream.UnixStream;

import java.io.IOException;

/**
 * Created by minseok on 2017-01-10.
 */
public class FunctionTest {
    public static void main(String[] args) {
        try {
            UnixStream.cat("adsfadsf");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
