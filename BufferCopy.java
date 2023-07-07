import java.io.*;
public class BufferCopy {
    public static void main(String[] args)throws FileNotFoundException,IOException {
        FileInputStream fis= new FileInputStream("README.md");
        FileOutputStream fos= new FileOutputStream("Copied.txt");
        BufferedInputStream bis= new BufferedInputStream(fis);
        BufferedOutputStream bos= new BufferedOutputStream(fos);
        int i;
        while((i=bis.read())!=-1){
            bos.write(i);
        }
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }
}
