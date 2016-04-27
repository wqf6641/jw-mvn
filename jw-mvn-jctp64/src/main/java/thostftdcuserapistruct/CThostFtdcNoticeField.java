package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u5ba2\u6237\u901a\u77e5<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:4301</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcNoticeField extends StructObject {
	public CThostFtdcNoticeField() {
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
	 * \u6d88\u606f\u6b63\u6587<br>
	 * C type : TThostFtdcContentType
	 */
	@Array({501}) 
	@Field(1) 
	public Pointer<Byte > Content() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u901a\u77e5\u5185\u5bb9\u5e8f\u5217\u53f7<br>
	 * C type : TThostFtdcSequenceLabelType
	 */
	@Array({2}) 
	@Field(2) 
	public Pointer<Byte > SequenceLabel() {
		return this.io.getPointerField(this, 2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcNoticeField(Pointer pointer) {
		super(pointer);
	}
}
