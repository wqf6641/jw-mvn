package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u80a1\u6307\u73b0\u8d27\u6307\u6570<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:2657</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcIndexPriceField extends StructObject {
	public CThostFtdcIndexPriceField() {
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
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(1) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u6307\u6570\u73b0\u8d27\u6536\u76d8\u4ef7<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public double ClosePrice() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \u6307\u6570\u73b0\u8d27\u6536\u76d8\u4ef7<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public CThostFtdcIndexPriceField ClosePrice(double ClosePrice) {
		this.io.setDoubleField(this, 2, ClosePrice);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcIndexPriceField(Pointer pointer) {
		super(pointer);
	}
}
