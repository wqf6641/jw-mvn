package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u62a5\u5355\u64cd\u4f5c<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:1514</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcOrderActionField extends StructObject {
	public CThostFtdcOrderActionField() {
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
	 * \u62a5\u5355\u64cd\u4f5c\u5f15\u7528<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	@Field(2) 
	public int OrderActionRef() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \u62a5\u5355\u64cd\u4f5c\u5f15\u7528<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	@Field(2) 
	public CThostFtdcOrderActionField OrderActionRef(int OrderActionRef) {
		this.io.setIntField(this, 2, OrderActionRef);
		return this;
	}
	/**
	 * \u62a5\u5355\u5f15\u7528<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(4) 
	public int RequestID() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(4) 
	public CThostFtdcOrderActionField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
	}
	/**
	 * \u524d\u7f6e\u7f16\u53f7<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(5) 
	public int FrontID() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \u524d\u7f6e\u7f16\u53f7<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(5) 
	public CThostFtdcOrderActionField FrontID(int FrontID) {
		this.io.setIntField(this, 5, FrontID);
		return this;
	}
	/**
	 * \u4f1a\u8bdd\u7f16\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(6) 
	public int SessionID() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \u4f1a\u8bdd\u7f16\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(6) 
	public CThostFtdcOrderActionField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(8) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u64cd\u4f5c\u6807\u5fd7<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(9) 
	public byte ActionFlag() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u64cd\u4f5c\u6807\u5fd7<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(9) 
	public CThostFtdcOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 9, ActionFlag);
		return this;
	}
	/**
	 * \u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public CThostFtdcOrderActionField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 10, LimitPrice);
		return this;
	}
	/**
	 * \u6570\u91cf\u53d8\u5316<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public int VolumeChange() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \u6570\u91cf\u53d8\u5316<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public CThostFtdcOrderActionField VolumeChange(int VolumeChange) {
		this.io.setIntField(this, 11, VolumeChange);
		return this;
	}
	/**
	 * \u64cd\u4f5c\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > ActionDate() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u64cd\u4f5c\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > ActionTime() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(14) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(15) 
	public int InstallID() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(15) 
	public CThostFtdcOrderActionField InstallID(int InstallID) {
		this.io.setIntField(this, 15, InstallID);
		return this;
	}
	/**
	 * \u672c\u5730\u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(16) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \u64cd\u4f5c\u672c\u5730\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(17) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \u4f1a\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(18) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \u5ba2\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(19) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \u4e1a\u52a1\u5355\u5143<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(20) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * \u62a5\u5355\u64cd\u4f5c\u72b6\u6001<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(21) 
	public byte OrderActionStatus() {
		return this.io.getByteField(this, 21);
	}
	/**
	 * \u62a5\u5355\u64cd\u4f5c\u72b6\u6001<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(21) 
	public CThostFtdcOrderActionField OrderActionStatus(byte OrderActionStatus) {
		this.io.setByteField(this, 21, OrderActionStatus);
		return this;
	}
	/**
	 * \u7528\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(22) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \u72b6\u6001\u4fe1\u606f<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({81}) 
	@Field(23) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(24) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 24);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcOrderActionField(Pointer pointer) {
		super(pointer);
	}
}