/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 휴면 계정 log
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrDormancy implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer       idx;
    private final String        userId;
    private final LocalDateTime dormancyDate;

    public JZDrDormancy(JZDrDormancy value) {
        this.idx = value.idx;
        this.userId = value.userId;
        this.dormancyDate = value.dormancyDate;
    }

    public JZDrDormancy(
        Integer       idx,
        String        userId,
        LocalDateTime dormancyDate
    ) {
        this.idx = idx;
        this.userId = userId;
        this.dormancyDate = dormancyDate;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_DORMANCY.IDX</code>.
     */
    public Integer getIdx() {
        return this.idx;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_DORMANCY.USER_ID</code>.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_DORMANCY.DORMANCY_DATE</code>. 휴면 계정 처리일
     */
    public LocalDateTime getDormancyDate() {
        return this.dormancyDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JZDrDormancy (");

        sb.append(idx);
        sb.append(", ").append(userId);
        sb.append(", ").append(dormancyDate);

        sb.append(")");
        return sb.toString();
    }
}
