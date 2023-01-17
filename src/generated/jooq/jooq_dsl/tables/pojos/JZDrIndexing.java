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
public class JZDrIndexing implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer       idx;
    private final String        drCode;
    private final LocalDateTime registDate;
    private final LocalDateTime updateDate;
    private final String        status;

    public JZDrIndexing(JZDrIndexing value) {
        this.idx = value.idx;
        this.drCode = value.drCode;
        this.registDate = value.registDate;
        this.updateDate = value.updateDate;
        this.status = value.status;
    }

    public JZDrIndexing(
        Integer       idx,
        String        drCode,
        LocalDateTime registDate,
        LocalDateTime updateDate,
        String        status
    ) {
        this.idx = idx;
        this.drCode = drCode;
        this.registDate = registDate;
        this.updateDate = updateDate;
        this.status = status;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_INDEXING.IDX</code>.
     */
    public Integer getIdx() {
        return this.idx;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_INDEXING.DR_CODE</code>. 보고서 코드
     */
    public String getDrCode() {
        return this.drCode;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_INDEXING.REGIST_DATE</code>. 등록일
     */
    public LocalDateTime getRegistDate() {
        return this.registDate;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_INDEXING.UPDATE_DATE</code>. 수정일
     */
    public LocalDateTime getUpdateDate() {
        return this.updateDate;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_INDEXING.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JZDrIndexing (");

        sb.append(idx);
        sb.append(", ").append(drCode);
        sb.append(", ").append(registDate);
        sb.append(", ").append(updateDate);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
