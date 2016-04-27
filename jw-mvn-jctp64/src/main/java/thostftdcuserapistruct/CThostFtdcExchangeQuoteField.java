package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u4ea4\u6613\u6240\u62a5\u4ef7\u4fe1\u606f<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:3484</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcExchangeQuoteField extends StructObject {
	public CThostFtdcExchangeQuoteField() {
		super();
	}
	/**
	 * \u5356\u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(0) 
	public double AskPrice() {
		return this.io.getDoubleField(this, 0);
	}
	/**
	 * \u5356\u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(0) 
	public CThostFtdcExchangeQuoteField AskPrice(double AskPrice) {
		this.io.setDoubleField(this, 0, AskPrice);
		return this;
	}
	/**
	 * \u4e70\u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(1) 
	public double BidPrice() {
		return this.io.getDoubleField(this, 1);
	}
	/**
	 * \u4e70\u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(1) 
	public CThostFtdcExchangeQuoteField BidPrice(double BidPrice) {
		this.io.setDoubleField(this, 1, BidPrice);
		return this;
	}
	/**
	 * \u5356\u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(2) 
	public int AskVolume() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \u5356\u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(2) 
	public CThostFtdcExchangeQuoteField AskVolume(int AskVolume) {
		this.io.setIntField(this, 2, AskVolume);
		return this;
	}
	/**
	 * \u4e70\u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(3) 
	public int BidVolume() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \u4e70\u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(3) 
	public CThostFtdcExchangeQuoteField BidVolume(int BidVolume) {
		this.io.setIntField(this, 3, BidVolume);
		return this;
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
	public CThostFtdcExchangeQuoteField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
	}
	/**
	 * \u4e1a\u52a1\u5355\u5143<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(5) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u5356\u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(6) 
	public byte AskOffsetFlag() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \u5356\u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(6) 
	public CThostFtdcExchangeQuoteField AskOffsetFlag(byte AskOffsetFlag) {
		this.io.setByteField(this, 6, AskOffsetFlag);
		return this;
	}
	/**
	 * \u4e70\u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(7) 
	public byte BidOffsetFlag() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \u4e70\u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(7) 
	public CThostFtdcExchangeQuoteField BidOffsetFlag(byte BidOffsetFlag) {
		this.io.setByteField(this, 7, BidOffsetFlag);
		return this;
	}
	/**
	 * \u5356\u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public byte AskHedgeFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u5356\u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public CThostFtdcExchangeQuoteField AskHedgeFlag(byte AskHedgeFlag) {
		this.io.setByteField(this, 8, AskHedgeFlag);
		return this;
	}
	/**
	 * \u4e70\u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(9) 
	public byte BidHedgeFlag() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u4e70\u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(9) 
	public CThostFtdcExchangeQuoteField BidHedgeFlag(byte BidHedgeFlag) {
		this.io.setByteField(this, 9, BidHedgeFlag);
		return this;
	}
	/**
	 * \u672c\u5730\u62a5\u4ef7\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(10) 
	public Pointer<Byte > QuoteLocalID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(11) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \u4f1a\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(12) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u5ba2\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(13) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \u5408\u7ea6\u5728\u4ea4\u6613\u6240\u7684\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(14) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(15) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(16) 
	public int InstallID() {
		return this.io.getIntField(this, 16);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(16) 
	public CThostFtdcExchangeQuoteField InstallID(int InstallID) {
		this.io.setIntField(this, 16, InstallID);
		return this;
	}
	/**
	 * \u62a5\u4ef7\u63d0\u793a\u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(17) 
	public int NotifySequence() {
		return this.io.getIntField(this, 17);
	}
	/**
	 * \u62a5\u4ef7\u63d0\u793a\u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(17) 
	public CThostFtdcExchangeQuoteField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 17, NotifySequence);
		return this;
	}
	/**
	 * \u62a5\u4ef7\u63d0\u4ea4\u72b6\u6001<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(18) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 18);
	}
	/**
	 * \u62a5\u4ef7\u63d0\u4ea4\u72b6\u6001<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(18) 
	public CThostFtdcExchangeQuoteField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 18, OrderSubmitStatus);
		return this;
	}
	/**
	 * \u4ea4\u6613\u65e5<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(19) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(20) 
	public int SettlementID() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(20) 
	public CThostFtdcExchangeQuoteField SettlementID(int SettlementID) {
		this.io.setIntField(this, 20, SettlementID);
		return this;
	}
	/**
	 * \u62a5\u4ef7\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(21) 
	public Pointer<Byte > QuoteSysID() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \u62a5\u5355\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(22) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \u63d2\u5165\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \u64a4\u9500\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(24) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \u62a5\u4ef7\u72b6\u6001<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(25) 
	public byte QuoteStatus() {
		return this.io.getByteField(this, 25);
	}
	/**
	 * \u62a5\u4ef7\u72b6\u6001<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(25) 
	public CThostFtdcExchangeQuoteField QuoteStatus(byte QuoteStatus) {
		this.io.setByteField(this, 25, QuoteStatus);
		return this;
	}
	/**
	 * \u7ed3\u7b97\u4f1a\u5458\u7f16\u53f7<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(26) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(27) 
	public int SequenceNo() {
		return this.io.getIntField(this, 27);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(27) 
	public CThostFtdcExchangeQuoteField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 27, SequenceNo);
		return this;
	}
	/**
	 * \u5356\u65b9\u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(28) 
	public Pointer<Byte > AskOrderSysID() {
		return this.io.getPointerField(this, 28);
	}
	/**
	 * \u4e70\u65b9\u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(29) 
	public Pointer<Byte > BidOrderSysID() {
		return this.io.getPointerField(this, 29);
	}
	/**
	 * \u5e94\u4ef7\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(30) 
	public Pointer<Byte > ForQuoteSysID() {
		return this.io.getPointerField(this, 30);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcExchangeQuoteField(Pointer pointer) {
		super(pointer);
	}
}