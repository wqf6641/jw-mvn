package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u5220\u9664\u9884\u57cb\u5355<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:4711</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcRemoveParkedOrderField extends StructObject {
	public CThostFtdcRemoveParkedOrderField() {
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
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u9884\u57cb\u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcParkedOrderIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > ParkedOrderID() {
		return this.io.getPointerField(this, 2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcRemoveParkedOrderField(Pointer pointer) {
		super(pointer);
	}
}
