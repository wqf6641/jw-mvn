package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u4f1a\u5458\u8d44\u91d1\u6298\u6263<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:4124</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcDiscountField extends StructObject {
	public CThostFtdcDiscountField() {
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
	 * \u6295\u8d44\u8005\u8303\u56f4<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u6295\u8d44\u8005\u8303\u56f4<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public CThostFtdcDiscountField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u8d44\u91d1\u6298\u6263\u6bd4\u4f8b<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(3) 
	public double Discount() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \u8d44\u91d1\u6298\u6263\u6bd4\u4f8b<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(3) 
	public CThostFtdcDiscountField Discount(double Discount) {
		this.io.setDoubleField(this, 3, Discount);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcDiscountField(Pointer pointer) {
		super(pointer);
	}
}
