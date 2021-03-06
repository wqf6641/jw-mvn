package helloworld;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * JNA把一个.dll/.so文件看做是一个Java接口
 * @author wengqf
 *（1）需要定义一个接口，继承自Library 或StdCallLibrary
 * 默认的是继承Library ，如果动态链接库里的函数是以stdcall方式输出的，那么就继承StdCallLibrary，比如众所周知的kernel32库
 * （2）接口内部定义
 * 接口内部需要一个公共静态常量：INSTANCE，通过这个常量，就可以获得这个接口的实例，从而使用接口的方法，也就是调用外部dll/so的函数。
 * 该常量通过Native.loadLibrary()这个API函数获得，该函数有2个参数：
 * 第 一个参数是动态链接库dll/so的名称，但不带.dll或.so这样的后缀，这符合JNI的规范，因为带了后缀名就不可以跨操作系统平台了。
 * 			搜索动态链 接库路径的顺序是：先从当前类的当前文件夹找，如果没有找到，再在工程当前文件夹下面找win32/win64文件夹，
 * 			找到后搜索对应的dll文件，如果 找不到再到WINDOWS下面去搜索，再找不到就会抛异常了。比如上例中printf函数在Windows平台
 * 			下所在的dll库名称是msvcrt，而在 其它平台如Linux下的so库名称是c。
 * 第二个参数是本接口的Class类型。JNA通过这个Class类型，根据指定的.dll/.so文件，动态创建接口的实例。该实例由JNA通过反射自动生成。
 */
public class HelloWorld {

	public interface CLibrary extends Library {
		CLibrary INSTANCE = (CLibrary)
                Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
                		CLibrary.class);

            public void printf(String format, Object... args);
        }

        public static void main(String[] args) {
        	CLibrary.INSTANCE.printf("Hello, World\n");
            for (int i=0;i < args.length;i++) {
            	CLibrary.INSTANCE.printf("Argument %d: %s\n", i, args[i]);
            }
        }
}
