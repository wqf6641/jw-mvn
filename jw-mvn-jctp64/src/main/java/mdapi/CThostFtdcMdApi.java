package mdapi;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

import thostftdcuserapistruct.CThostFtdcFensUserInfoField;
import thostftdcuserapistruct.CThostFtdcReqUserLoginField;
import thostftdcuserapistruct.CThostFtdcUserLogoutField;
/**
 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:61</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcMdApi extends CPPObject {
	public CThostFtdcMdApi() {
		super();
	}
	/**
	 * modify for udp marketdata<br>
	 * Original signature : <code>CThostFtdcMdApi* CreateFtdcMdApi(const char*, const bool, const bool)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:68</i>
	 */
	public static native Pointer<CThostFtdcMdApi > CreateFtdcMdApi(Pointer<Byte > pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast);
	/**
	 * @remark \u4e0d\u518d\u4f7f\u7528\u672c\u63a5\u53e3\u5bf9\u8c61\u65f6,\u8c03\u7528\u8be5\u51fd\u6570\u5220\u9664\u63a5\u53e3\u5bf9\u8c61<br>
	 * Original signature : <code>void Release()</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:72</i>
	 */
	@Virtual(0) 
	public native void Release();
	/**
	 * @remark \u521d\u59cb\u5316\u8fd0\u884c\u73af\u5883,\u53ea\u6709\u8c03\u7528\u540e,\u63a5\u53e3\u624d\u5f00\u59cb\u5de5\u4f5c<br>
	 * Original signature : <code>void Init()</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:76</i>
	 */
	@Virtual(1) 
	public native void Init();
	/**
	 * @return \u7ebf\u7a0b\u9000\u51fa\u4ee3\u7801<br>
	 * Original signature : <code>int Join()</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:80</i>
	 */
	@Virtual(2) 
	public native int Join();
	/**
	 * @remark \u53ea\u6709\u767b\u5f55\u6210\u529f\u540e,\u624d\u80fd\u5f97\u5230\u6b63\u786e\u7684\u4ea4\u6613\u65e5<br>
	 * Original signature : <code>char* GetTradingDay()</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:85</i>
	 */
	@Virtual(3) 
	public native Pointer<Byte > GetTradingDay();
	/**
	 * @remark \u201ctcp\u201d\u4ee3\u8868\u4f20\u8f93\u534f\u8bae\uff0c\u201c127.0.0.1\u201d\u4ee3\u8868\u670d\u52a1\u5668\u5730\u5740\u3002\u201d17001\u201d\u4ee3\u8868\u670d\u52a1\u5668\u7aef\u53e3\u53f7\u3002<br>
	 * Original signature : <code>void RegisterFront(char*)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:91</i>
	 */
	@Virtual(4) 
	public native void RegisterFront(Pointer<Byte > pszFrontAddress);
	/**
	 * @remark RegisterNameServer\u4f18\u5148\u4e8eRegisterFront<br>
	 * Original signature : <code>void RegisterNameServer(char*)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:98</i>
	 */
	@Virtual(5) 
	public native void RegisterNameServer(Pointer<Byte > pszNsAddress);
	/**
	 * @param pFensUserInfo\uff1a\u7528\u6237\u4fe1\u606f\u3002<br>
	 * Original signature : <code>void RegisterFensUserInfo(CThostFtdcFensUserInfoField*)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:102</i>
	 */
	@Virtual(6) 
	public native void RegisterFensUserInfo(Pointer<CThostFtdcFensUserInfoField > pFensUserInfo);
	/**
	 * @param pSpi \u6d3e\u751f\u81ea\u56de\u8c03\u63a5\u53e3\u7c7b\u7684\u5b9e\u4f8b<br>
	 * Original signature : <code>void RegisterSpi(CThostFtdcMdSpi*)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:106</i>
	 */
	@Virtual(7) 
	public native void RegisterSpi(Pointer<CThostFtdcMdSpi > pSpi);
	/**
	 * @remark<br>
	 * Original signature : <code>int SubscribeMarketData(char*[], int)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:112</i>
	 */
	@Virtual(8) 
	public native int SubscribeMarketData(Pointer<Pointer<Byte > > ppInstrumentID, int nCount);
	/**
	 * @remark<br>
	 * Original signature : <code>int UnSubscribeMarketData(char*[], int)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:118</i>
	 */
	@Virtual(9) 
	public native int UnSubscribeMarketData(Pointer<Pointer<Byte > > ppInstrumentID, int nCount);
	/**
	 * @remark<br>
	 * Original signature : <code>int SubscribeForQuoteRsp(char*[], int)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:124</i>
	 */
	@Virtual(10) 
	public native int SubscribeForQuoteRsp(Pointer<Pointer<Byte > > ppInstrumentID, int nCount);
	/**
	 * @remark<br>
	 * Original signature : <code>int UnSubscribeForQuoteRsp(char*[], int)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:130</i>
	 */
	@Virtual(11) 
	public native int UnSubscribeForQuoteRsp(Pointer<Pointer<Byte > > ppInstrumentID, int nCount);
	/**
	 * \u7528\u6237\u767b\u5f55\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqUserLogin(CThostFtdcReqUserLoginField*, int)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:133</i>
	 */
	@Virtual(12) 
	public native int ReqUserLogin(Pointer<CThostFtdcReqUserLoginField > pReqUserLoginField, int nRequestID);
	/**
	 * \u767b\u51fa\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqUserLogout(CThostFtdcUserLogoutField*, int)</code><br>
	 * <i>native declaration : F:\jna\ThostFtdcMdApi.h:137</i>
	 */
	@Virtual(13) 
	public native int ReqUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, int nRequestID);
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcMdApi(Pointer pointer) {
		super(pointer);
	}
}