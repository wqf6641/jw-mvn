package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u4fdd\u8bc1\u91d1\u7387\u6a21\u677f<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:5350</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcQryMarginModelField extends StructObject {
	public CThostFtdcQryMarginModelField() {
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
	 * \u4fdd\u8bc1\u91d1\u7387\u6a21\u677f\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > MarginModelID() {
		return this.io.getPointerField(this, 1);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcQryMarginModelField(Pointer pointer) {
		super(pointer);
	}
}
