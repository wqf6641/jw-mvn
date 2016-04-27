package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u67e5\u8be2\u62a5\u5355<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:2508</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcQryHisOrderField extends StructObject {
	public CThostFtdcQryHisOrderField() {
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
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(4) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u5f00\u59cb\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > InsertTimeStart() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u7ed3\u675f\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > InsertTimeEnd() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u4ea4\u6613\u65e5<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(8) 
	public int SettlementID() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(8) 
	public CThostFtdcQryHisOrderField SettlementID(int SettlementID) {
		this.io.setIntField(this, 8, SettlementID);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcQryHisOrderField(Pointer pointer) {
		super(pointer);
	}
}
