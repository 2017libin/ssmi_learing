/**
 * @Title: CharacterCodeTest.java
 * @Package cn.osxm.ssmi.chp17
 * @Description: TODO
 * @author oscarchen
 * @date 2019年7月31日
 * @version V1.0
 */
package cn.osxm.ssmi.chp17;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
  * @ClassName: CharacterCodeTest
  * @Description: TODO
  * @author oscarchen
  */
public class CharacterCodeTest {
	   private static String chineseStr;
	    private static String chineseUnicodeStr;
	    
	    @BeforeAll
	    public static void setup() {
	        chineseStr = "中文";
	        chineseUnicodeStr = "\u4e2d\u6587";
	    }

	    
	    @Test
	    public void charUnicode() {
	        String unicodeStr = "";
	        char[] charArray = chineseStr.toCharArray();
	        for(char charTemp:charArray) {
	            unicodeStr += "\\u"+Integer.toHexString((int)charTemp);
	        }  
	        Assertions.assertEquals(unicodeStr, "\\u4e2d\\u6587"); //多一个\ 是转义字符
	    }
	    
	    
	    
	    @Test
	    public void strChar() {
	        char[] charArray = chineseStr.toCharArray();
	        for(char charTemp:charArray) {

	            System.out.println(charTemp);
	        }       
	    }
	    
	    
	    
	    
	    //@Test
	    public void jvmEncode() throws FileNotFoundException {
	        System.out.println(System.getProperty("sun.jnu.encoding"));//文件名字编码
	        System.out.println(System.getProperty("file.encoding")); //源文件编码
	        System.out.println(Charset.defaultCharset().toString());
	        String classPath = this.getClass().getResource("/").getPath();
	        InputStreamReader input = new InputStreamReader(new FileInputStream(new File(classPath+"messages-test.properties")));
	        System.out.println(input.getEncoding().toString());
	    }
	    
	    
	    
	    public void charEncode() {
	        String aStr = "\u4E2D\u6587";
	        //Assert.isTrue(aStr.equals("中文"), "");
	    }
	    
	    
	   // @Test
	    public void allEncode() throws UnsupportedEncodingException {
	        byte[] utf = chineseStr.getBytes("utf-8");
	        byte[] gbk = chineseStr.getBytes("gbk");
	        byte[] gb2312 = chineseStr.getBytes("gb2312");
	        byte[] iso8859 = chineseStr.getBytes("iso8859-1");
	        
	        //字节
	        System.out.println(Arrays.toString(utf)); //[-28, -72, -83, -26, -106, -121]  6个字节
	        System.out.println(Arrays.toString(gbk));//[-42, -48, -50, -60] 4个字节
	        System.out.println(Arrays.toString(gb2312));//[-42, -48, -50, -60] 4个字节
	        System.out.println(Arrays.toString(iso8859)); //[63, 63] 2个字节
	        
	        //字符
	        String gb2312ToUtf8 = new String(gb2312,"utf-8");
	        String utf8ToGb2312 = new String(utf,"gb2312");
	        String gbkToIso8859 = new String(gbk,"iso8859-1");
	        System.out.println(gb2312ToUtf8);
	        System.out.println(utf8ToGb2312);
	        System.out.println(gbkToIso8859);
	    }
	    
	    
	    
	    @Test
	    public void iso8859() throws UnsupportedEncodingException {
	        byte[] utf  = chineseStr.getBytes();
	    }
}
