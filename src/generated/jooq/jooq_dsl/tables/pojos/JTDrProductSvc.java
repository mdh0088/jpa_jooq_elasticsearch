/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrProductSvc implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer idx;
    private final String  pCode;
    private final String  svcCode;
    private final String  svcCheckyn;

    public JTDrProductSvc(JTDrProductSvc value) {
        this.idx = value.idx;
        this.pCode = value.pCode;
        this.svcCode = value.svcCode;
        this.svcCheckyn = value.svcCheckyn;
    }

    public JTDrProductSvc(
        Integer idx,
        String  pCode,
        String  svcCode,
        String  svcCheckyn
    ) {
        this.idx = idx;
        this.pCode = pCode;
        this.svcCode = svcCode;
        this.svcCheckyn = svcCheckyn;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_SVC.IDX</code>.
     */
    public Integer getIdx() {
        return this.idx;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_SVC.P_CODE</code>.
     */
    public String getPCode() {
        return this.pCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_SVC.SVC_CODE</code>. 권한메뉴코드
     */
    public String getSvcCode() {
        return this.svcCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_SVC.SVC_CHECKYN</code>. 권한사용여부
     */
    public String getSvcCheckyn() {
        return this.svcCheckyn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JTDrProductSvc (");

        sb.append(idx);
        sb.append(", ").append(pCode);
        sb.append(", ").append(svcCode);
        sb.append(", ").append(svcCheckyn);

        sb.append(")");
        return sb.toString();
    }
}
