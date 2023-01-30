import java.io.*;

public class Example09 {
    public static void main(String[] args) throws Exception {
        //创建字节输入流
        FileInputStream input=new FileInputStream("E:\\doc\\read.txt");
        //将字节输入流转换成字符输入流
        InputStreamReader streamReader=new InputStreamReader(input);
        //赋予字符输入流对象缓冲区
        BufferedReader bufferReader=new BufferedReader(streamReader);
        //创建字节输出流
        FileOutputStream output=new FileOutputStream("E:\\doc\\write.txt");
        //将字节输出流转换成字符输出流
        OutputStreamWriter streamWriter=new OutputStreamWriter(output);
        //赋予字符输出流对象缓冲区
        BufferedWriter bufferWriter=new BufferedWriter(streamWriter);
        String line=null;
        //判断是否读到文件末尾
        while ((line=bufferReader.readLine()) !=null) {
            bufferWriter.write(line+"\n");        //输出读取到的文件
        }
        bufferReader.close();
        bufferWriter.close();
    }
}