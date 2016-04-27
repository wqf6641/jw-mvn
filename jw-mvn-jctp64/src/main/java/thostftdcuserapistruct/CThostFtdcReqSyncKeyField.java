package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u4ea4\u6613\u6838\u5fc3\u5411\u94f6\u671f\u62a5\u76d8\u53d1\u51fa\u5bc6\u94a5\u540c\u6b65\u8bf7\u6c42<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:6788</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcReqSyncKeyField extends StructObject {
	public CThostFtdcReqSyncKeyField() {
		super();
	}
	/**
	 * \u4e1a\u52a1\u529f\u80fd\u7801<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u94f6\u884c\u4ee3\u7801<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u94f6\u884c\u5206\u652f\u673a\u6784\u4ee3\u7801<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u671f\u5546\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u671f\u5546\u5206\u652f\u673a\u6784\u4ee3\u7801<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u4ea4\u6613\u65e5\u671f<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u4ea4\u6613\u65f6\u95f4<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u94f6\u884c\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u4ea4\u6613\u7cfb\u7edf\u65e5\u671f<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public CThostFtdcReqSyncKeyField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/**
	 * \u6700\u540e\u5206\u7247\u6807\u5fd7<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \u6700\u540e\u5206\u7247\u6807\u5fd7<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public CThostFtdcReqSyncKeyField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/**
	 * \u4f1a\u8bdd\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \u4f1a\u8bdd\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public CThostFtdcReqSyncKeyField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(12) 
	public int InstallID() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(12) 
	public CThostFtdcReqSyncKeyField InstallID(int InstallID) {
		this.io.setIntField(this, 12, InstallID);
		return this;
	}
	/**
	 * \u7528\u6237\u6807\u8bc6<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(13) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \u4ea4\u6613\u6838\u5fc3\u7ed9\u94f6\u671f\u62a5\u76d8\u7684\u6d88\u606f<br>
	 * C type : TThostFtdcAddInfoType
	 */
	@Array({129}) 
	@Field(14) 
	public Pointer<Byte > Message() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \u6e20\u9053\u6807\u5fd7<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	@Array({3}) 
	@Field(15) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \u671f\u8d27\u516c\u53f8\u94f6\u884c\u7f16\u7801<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	@Array({33}) 
	@Field(16) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \u4ea4\u6613\u67dc\u5458<br>
	 * C type : TThostFtdcOperNoType
	 */
	@Array({17}) 
	@Field(17) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(18) 
	public int RequestID() {
		return this.io.getIntField(this, 18);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(18) 
	public CThostFtdcReqSyncKeyField RequestID(int RequestID) {
		this.io.setIntField(this, 18, RequestID);
		return this;
	}
	/**
	 * \u4ea4\u6613ID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(19) 
	public int TID() {
		return this.io.getIntField(this, 19);
	}
	/**
	 * \u4ea4\u6613ID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(19) 
	public CThostFtdcReqSyncKeyField TID(int TID) {
		this.io.setIntField(this, 19, TID);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcReqSyncKeyField(Pointer pointer) {
		super(pointer);
	}
}
