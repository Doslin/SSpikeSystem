package com.doude.enity;

import java.util.Date;

/**
 *
 * @author Administrator
 *
 */
public class Msorder {
	private int id;//����
	private int productid;//��ɱ��Ʒid
	private int payamount;//֧�����
	private int userid;//�û�id
	private int merchantid;//�̼�id
	private Date createtime;//����ʱ��
	private Date paytime;//֧��ʱ��
	private int paystatus;//֧��ת̬  1,δ֧�� 2,��֧����3���˿�ɹ�,4���û������˿����� 5���˿�ʧ��
	private String receivingadress;//�ջ��˵�ַ
	private String receivingname;//�ջ�������
	private String receivingphone;//�ջ��˵绰
	private String tradeserialnumber;//������ˮ��
	private int num;//����
	private int paytype;//1����֧����  2����΢��  3��������
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getPayamount() {
		return payamount;
	}
	public void setPayamount(int payamount) {
		this.payamount = payamount;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getMerchantid() {
		return merchantid;
	}
	public void setMerchantid(int merchantid) {
		this.merchantid = merchantid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getPaytime() {
		return paytime;
	}
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	public int getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(int paystatus) {
		this.paystatus = paystatus;
	}
	public String getReceivingadress() {
		return receivingadress;
	}
	public void setReceivingadress(String receivingadress) {
		this.receivingadress = receivingadress;
	}
	public String getReceivingname() {
		return receivingname;
	}
	public void setReceivingname(String receivingname) {
		this.receivingname = receivingname;
	}
	public String getReceivingphone() {
		return receivingphone;
	}
	public void setReceivingphone(String receivingphone) {
		this.receivingphone = receivingphone;
	}
	public String getTradeserialnumber() {
		return tradeserialnumber;
	}
	public void setTradeserialnumber(String tradeserialnumber) {
		this.tradeserialnumber = tradeserialnumber;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPaytype() {
		return paytype;
	}
	public void setPaytype(int paytype) {
		this.paytype = paytype;
	}
	
	
	
	
}
