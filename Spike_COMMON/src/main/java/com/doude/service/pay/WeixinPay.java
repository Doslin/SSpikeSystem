package com.doude.service.pay;


public interface WeixinPay extends Ordertopay {

	public int paywithorder(String tradeserialnumber, int payamount) ;

	public int refundwithorder(String tradeserialnumber, int payamount) ;

}
