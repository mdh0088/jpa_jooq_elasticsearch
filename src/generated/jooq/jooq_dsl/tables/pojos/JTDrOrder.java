/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String        orderCode;
    private final String        orderType;
    private final String        userId;
    private final LocalDateTime orderDate;
    private final String        orderNewYn;
    private final String        payType;
    private final String        status;
    private final Integer       keyCnt;
    private final Integer       orderCnt;
    private final Integer       dcPrice;
    private final Integer       amount;
    private final Integer       price;
    private final Integer       extraDc;
    private final String        extraDcDesc;
    private final String        couponCode;
    private final String        couponPubId;
    private final String        cardname;
    private final String        cardnum;
    private final String        installmonth;
    private final LocalDateTime payDate;
    private final LocalDateTime cancelDate;
    private final String        lgdTid;
    private final String        depositor;
    private final LocalDateTime depositDate;
    private final String        depositDealCode;
    private final LocalDateTime depositConfDate;
    private final String        cashReceiptsYn;
    private final String        cashReceiptsCode;
    private final String        blFileName;
    private final String        blFileOriginalname;
    private final String        blFilePath;
    private final String        blFileUrl;
    private final Long          blFileSize;
    private final String        invoiceMail;

    public JTDrOrder(JTDrOrder value) {
        this.orderCode = value.orderCode;
        this.orderType = value.orderType;
        this.userId = value.userId;
        this.orderDate = value.orderDate;
        this.orderNewYn = value.orderNewYn;
        this.payType = value.payType;
        this.status = value.status;
        this.keyCnt = value.keyCnt;
        this.orderCnt = value.orderCnt;
        this.dcPrice = value.dcPrice;
        this.amount = value.amount;
        this.price = value.price;
        this.extraDc = value.extraDc;
        this.extraDcDesc = value.extraDcDesc;
        this.couponCode = value.couponCode;
        this.couponPubId = value.couponPubId;
        this.cardname = value.cardname;
        this.cardnum = value.cardnum;
        this.installmonth = value.installmonth;
        this.payDate = value.payDate;
        this.cancelDate = value.cancelDate;
        this.lgdTid = value.lgdTid;
        this.depositor = value.depositor;
        this.depositDate = value.depositDate;
        this.depositDealCode = value.depositDealCode;
        this.depositConfDate = value.depositConfDate;
        this.cashReceiptsYn = value.cashReceiptsYn;
        this.cashReceiptsCode = value.cashReceiptsCode;
        this.blFileName = value.blFileName;
        this.blFileOriginalname = value.blFileOriginalname;
        this.blFilePath = value.blFilePath;
        this.blFileUrl = value.blFileUrl;
        this.blFileSize = value.blFileSize;
        this.invoiceMail = value.invoiceMail;
    }

    public JTDrOrder(
        String        orderCode,
        String        orderType,
        String        userId,
        LocalDateTime orderDate,
        String        orderNewYn,
        String        payType,
        String        status,
        Integer       keyCnt,
        Integer       orderCnt,
        Integer       dcPrice,
        Integer       amount,
        Integer       price,
        Integer       extraDc,
        String        extraDcDesc,
        String        couponCode,
        String        couponPubId,
        String        cardname,
        String        cardnum,
        String        installmonth,
        LocalDateTime payDate,
        LocalDateTime cancelDate,
        String        lgdTid,
        String        depositor,
        LocalDateTime depositDate,
        String        depositDealCode,
        LocalDateTime depositConfDate,
        String        cashReceiptsYn,
        String        cashReceiptsCode,
        String        blFileName,
        String        blFileOriginalname,
        String        blFilePath,
        String        blFileUrl,
        Long          blFileSize,
        String        invoiceMail
    ) {
        this.orderCode = orderCode;
        this.orderType = orderType;
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderNewYn = orderNewYn;
        this.payType = payType;
        this.status = status;
        this.keyCnt = keyCnt;
        this.orderCnt = orderCnt;
        this.dcPrice = dcPrice;
        this.amount = amount;
        this.price = price;
        this.extraDc = extraDc;
        this.extraDcDesc = extraDcDesc;
        this.couponCode = couponCode;
        this.couponPubId = couponPubId;
        this.cardname = cardname;
        this.cardnum = cardnum;
        this.installmonth = installmonth;
        this.payDate = payDate;
        this.cancelDate = cancelDate;
        this.lgdTid = lgdTid;
        this.depositor = depositor;
        this.depositDate = depositDate;
        this.depositDealCode = depositDealCode;
        this.depositConfDate = depositConfDate;
        this.cashReceiptsYn = cashReceiptsYn;
        this.cashReceiptsCode = cashReceiptsCode;
        this.blFileName = blFileName;
        this.blFileOriginalname = blFileOriginalname;
        this.blFilePath = blFilePath;
        this.blFileUrl = blFileUrl;
        this.blFileSize = blFileSize;
        this.invoiceMail = invoiceMail;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.ORDER_CODE</code>. 주문코드
     */
    public String getOrderCode() {
        return this.orderCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.ORDER_TYPE</code>. 주문 유형 =&gt;
     * RP:보고서,AP:권한상품
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.USER_ID</code>. 사용자 ID
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.ORDER_DATE</code>. 주문 날짜
     */
    public LocalDateTime getOrderDate() {
        return this.orderDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.ORDER_NEW_YN</code>.
     */
    public String getOrderNewYn() {
        return this.orderNewYn;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.PAY_TYPE</code>. 결제방식 =&gt;
     * PAY_TYPE : T_DR_ITEM_CODE 참조
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.STATUS</code>. 주문상태 =&gt;
     * ORDER_STATUS_TYPE : T_DR_ITEM_CODE 참조
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.KEY_CNT</code>. 보안키 수량키
     */
    public Integer getKeyCnt() {
        return this.keyCnt;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.ORDER_CNT</code>. 주문수량
     */
    public Integer getOrderCnt() {
        return this.orderCnt;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.DC_PRICE</code>. 할인 금액
     */
    public Integer getDcPrice() {
        return this.dcPrice;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.AMOUNT</code>. 결제 금액
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.PRICE</code>. 주문금액
     */
    public Integer getPrice() {
        return this.price;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.EXTRA_DC</code>. 추가할인
     */
    public Integer getExtraDc() {
        return this.extraDc;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.EXTRA_DC_DESC</code>. 추가할인 비고
     */
    public String getExtraDcDesc() {
        return this.extraDcDesc;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.COUPON_CODE</code>. 적용 쿠폰 ID
     */
    public String getCouponCode() {
        return this.couponCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.COUPON_PUB_ID</code>. 적용쿠폰상세 ID
     */
    public String getCouponPubId() {
        return this.couponPubId;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.CARDNAME</code>. 카드명
     */
    public String getCardname() {
        return this.cardname;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.CARDNUM</code>. 카드번호
     */
    public String getCardnum() {
        return this.cardnum;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.INSTALLMONTH</code>. 할부개월수
     */
    public String getInstallmonth() {
        return this.installmonth;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.PAY_DATE</code>. 결제일
     */
    public LocalDateTime getPayDate() {
        return this.payDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.CANCEL_DATE</code>. 주문취소일
     */
    public LocalDateTime getCancelDate() {
        return this.cancelDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.LGD_TID</code>. LG 결제 번호
     */
    public String getLgdTid() {
        return this.lgdTid;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.DEPOSITOR</code>. 입금자
     */
    public String getDepositor() {
        return this.depositor;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.DEPOSIT_DATE</code>. 입금일
     */
    public LocalDateTime getDepositDate() {
        return this.depositDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.DEPOSIT_DEAL_CODE</code>. 입금거래코드
     */
    public String getDepositDealCode() {
        return this.depositDealCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.DEPOSIT_CONF_DATE</code>. 입금확인일
     */
    public LocalDateTime getDepositConfDate() {
        return this.depositConfDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.CASH_RECEIPTS_YN</code>. 현금영수증 :
     * 신청 =&gt; Y , 신청안함 =&gt; N
     */
    public String getCashReceiptsYn() {
        return this.cashReceiptsYn;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.CASH_RECEIPTS_CODE</code>. 현금영수증
     * 구분 :  개인소득공제용 , 사업자증빙용
     */
    public String getCashReceiptsCode() {
        return this.cashReceiptsCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.BL_FILE_NAME</code>. 사업자등록증 파일 이름
     */
    public String getBlFileName() {
        return this.blFileName;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.BL_FILE_ORIGINALNAME</code>.
     * 사업자등록증 파일 원본이름
     */
    public String getBlFileOriginalname() {
        return this.blFileOriginalname;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.BL_FILE_PATH</code>. 사업자등록증 첨부파일
     * 경로
     */
    public String getBlFilePath() {
        return this.blFilePath;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.BL_FILE_URL</code>. 사업자등록증 파일 URL
     */
    public String getBlFileUrl() {
        return this.blFileUrl;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.BL_FILE_SIZE</code>. 사업자등록증 파일 크기
     */
    public Long getBlFileSize() {
        return this.blFileSize;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER.INVOICE_MAIL</code>. 계산서 이메일
     */
    public String getInvoiceMail() {
        return this.invoiceMail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JTDrOrder (");

        sb.append(orderCode);
        sb.append(", ").append(orderType);
        sb.append(", ").append(userId);
        sb.append(", ").append(orderDate);
        sb.append(", ").append(orderNewYn);
        sb.append(", ").append(payType);
        sb.append(", ").append(status);
        sb.append(", ").append(keyCnt);
        sb.append(", ").append(orderCnt);
        sb.append(", ").append(dcPrice);
        sb.append(", ").append(amount);
        sb.append(", ").append(price);
        sb.append(", ").append(extraDc);
        sb.append(", ").append(extraDcDesc);
        sb.append(", ").append(couponCode);
        sb.append(", ").append(couponPubId);
        sb.append(", ").append(cardname);
        sb.append(", ").append(cardnum);
        sb.append(", ").append(installmonth);
        sb.append(", ").append(payDate);
        sb.append(", ").append(cancelDate);
        sb.append(", ").append(lgdTid);
        sb.append(", ").append(depositor);
        sb.append(", ").append(depositDate);
        sb.append(", ").append(depositDealCode);
        sb.append(", ").append(depositConfDate);
        sb.append(", ").append(cashReceiptsYn);
        sb.append(", ").append(cashReceiptsCode);
        sb.append(", ").append(blFileName);
        sb.append(", ").append(blFileOriginalname);
        sb.append(", ").append(blFilePath);
        sb.append(", ").append(blFileUrl);
        sb.append(", ").append(blFileSize);
        sb.append(", ").append(invoiceMail);

        sb.append(")");
        return sb.toString();
    }
}
