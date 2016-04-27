package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u767b\u5f55\u4fe1\u606f<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:1166</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcLogoutAllField extends StructObject {
	public CThostFtdcLogoutAllField() {
		super();
	}
	/**
	 * \u524d\u7f6e\u7f16\u53f7<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(0) 
	public int FrontID() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * \u524d\u7f6e\u7f16\u53f7<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(0) 
	public CThostFtdcLogoutAllField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}
	/**
	 * \u4f1a\u8bdd\u7f16\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(1) 
	public int SessionID() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \u4f1a\u8bdd\u7f16\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(1) 
	public CThostFtdcLogoutAllField SessionID(int SessionID) {
		this.io.setIntField(this, 1, SessionID);
		return this;
	}
	/**
	 * \u7cfb\u7edf\u540d\u79f0<br>
	 * C type : TThostFtdcSystemNameType
	 */
	@Array({41}) 
	@Field(2) 
	public Pointer<Byte > SystemName() {
		return this.io.getPointerField(this, 2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcLogoutAllField(Pointer pointer) {
		super(pointer);
	}
}
