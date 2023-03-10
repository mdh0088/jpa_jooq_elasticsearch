/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrProductCate implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer idx;
    private final String  pCode;
    private final String  cateCode;
    private final String  drCode;

    public JTDrProductCate(JTDrProductCate value) {
        this.idx = value.idx;
        this.pCode = value.pCode;
        this.cateCode = value.cateCode;
        this.drCode = value.drCode;
    }

    public JTDrProductCate(
        Integer idx,
        String  pCode,
        String  cateCode,
        String  drCode
    ) {
        this.idx = idx;
        this.pCode = pCode;
        this.cateCode = cateCode;
        this.drCode = drCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_CATE.IDX</code>.
     */
    public Integer getIdx() {
        return this.idx;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_CATE.P_CODE</code>.
     */
    public String getPCode() {
        return this.pCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_CATE.CATE_CODE</code>. 카테고리 코드
     */
    public String getCateCode() {
        return this.cateCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_CATE.DR_CODE</code>.
     */
    public String getDrCode() {
        return this.drCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JTDrProductCate (");

        sb.append(idx);
        sb.append(", ").append(pCode);
        sb.append(", ").append(cateCode);
        sb.append(", ").append(drCode);

        sb.append(")");
        return sb.toString();
    }
}
