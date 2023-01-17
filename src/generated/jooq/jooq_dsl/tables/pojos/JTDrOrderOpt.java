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
public class JTDrOrderOpt implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer       idx;
    private final String        orderCode;
    private final String        opCode;
    private final String        optCode;
    private final String        optFileType;
    private final Integer       optPrice;
    private final String        optType;
    private final Integer       orderOptCnt;
    private final LocalDateTime regDate;

    public JTDrOrderOpt(JTDrOrderOpt value) {
        this.idx = value.idx;
        this.orderCode = value.orderCode;
        this.opCode = value.opCode;
        this.optCode = value.optCode;
        this.optFileType = value.optFileType;
        this.optPrice = value.optPrice;
        this.optType = value.optType;
        this.orderOptCnt = value.orderOptCnt;
        this.regDate = value.regDate;
    }

    public JTDrOrderOpt(
        Integer       idx,
        String        orderCode,
        String        opCode,
        String        optCode,
        String        optFileType,
        Integer       optPrice,
        String        optType,
        Integer       orderOptCnt,
        LocalDateTime regDate
    ) {
        this.idx = idx;
        this.orderCode = orderCode;
        this.opCode = opCode;
        this.optCode = optCode;
        this.optFileType = optFileType;
        this.optPrice = optPrice;
        this.optType = optType;
        this.orderOptCnt = orderOptCnt;
        this.regDate = regDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.IDX</code>.
     */
    public Integer getIdx() {
        return this.idx;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.ORDER_CODE</code>. 주문코드
     */
    public String getOrderCode() {
        return this.orderCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.OP_CODE</code>. 상품 및 보고서 코드
     */
    public String getOpCode() {
        return this.opCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.OPT_CODE</code>. 옵션코드
     */
    public String getOptCode() {
        return this.optCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.OPT_FILE_TYPE</code>. 파일형식
     */
    public String getOptFileType() {
        return this.optFileType;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.OPT_PRICE</code>. 금액
     */
    public Integer getOptPrice() {
        return this.optPrice;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.OPT_TYPE</code>. 옵션타입
     */
    public String getOptType() {
        return this.optType;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.ORDER_OPT_CNT</code>. 주문옵션 갯수
     */
    public Integer getOrderOptCnt() {
        return this.orderOptCnt;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDER_OPT.REG_DATE</code>. 등록일
     */
    public LocalDateTime getRegDate() {
        return this.regDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JTDrOrderOpt (");

        sb.append(idx);
        sb.append(", ").append(orderCode);
        sb.append(", ").append(opCode);
        sb.append(", ").append(optCode);
        sb.append(", ").append(optFileType);
        sb.append(", ").append(optPrice);
        sb.append(", ").append(optType);
        sb.append(", ").append(orderOptCnt);
        sb.append(", ").append(regDate);

        sb.append(")");
        return sb.toString();
    }
}