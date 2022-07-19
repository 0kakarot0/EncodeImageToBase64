package encodeToBase64;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class EncodeImageBase64 {

    public static void main(String[] args) throws IOException {
        File imageFile = new File("resources/setEmail.png");
        String encodedString = encodeFileToBase64Binary(imageFile);
        System.out.println(encodedString);
    }

    private static String encodeFileToBase64Binary(File file) throws IOException{
        FileInputStream fileInputStreamReader = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        fileInputStreamReader.read(bytes);
        return new String(Base64.getEncoder().encode(bytes), "UTF-8");
    }
}
