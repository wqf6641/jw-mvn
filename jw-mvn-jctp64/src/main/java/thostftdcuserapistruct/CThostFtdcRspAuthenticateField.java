package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u5ba2\u6237\u7aef\u8ba4\u8bc1\u54cd\u5e94<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:100</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcRspAuthenticateField extends StructObject {
	public CThostFtdcRspAuthenticateField() {
		super();
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u7528\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u7528\u6237\u7aef\u4ea7\u54c1\u4fe1\u606f<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcRspAuthenticateField(Pointer pointer) {
		super(pointer);
	}
}
