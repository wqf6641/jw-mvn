package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u5ba2\u6237\u7aef\u8ba4\u8bc1\u4fe1\u606f<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:111</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcAuthenticationInfoField extends StructObject {
	public CThostFtdcAuthenticationInfoField() {
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
	/**
	 * \u8ba4\u8bc1\u4fe1\u606f<br>
	 * C type : TThostFtdcAuthInfoType
	 */
	@Array({129}) 
	@Field(3) 
	public Pointer<Byte > AuthInfo() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u662f\u5426\u4e3a\u8ba4\u8bc1\u7ed3\u679c<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4) 
	public int IsResult() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u662f\u5426\u4e3a\u8ba4\u8bc1\u7ed3\u679c<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4) 
	public CThostFtdcAuthenticationInfoField IsResult(int IsResult) {
		this.io.setIntField(this, 4, IsResult);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcAuthenticationInfoField(Pointer pointer) {
		super(pointer);
	}
}
