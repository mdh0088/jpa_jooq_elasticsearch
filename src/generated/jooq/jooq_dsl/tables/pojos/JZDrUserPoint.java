/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 포인트 지급 기록 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrUserPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer       idx;
    private final String        userId;
    private final String        pointCode;
    private final String        pointName;
    private final Integer       pointNum;
    private final Integer       pointAcc;
    private final String        regId;
    private final LocalDateTime regDate;

    public JZDrUserPoint(JZDrUserPoint value) {
        this.idx = value.idx;
        this.userId = value.userId;
        this.pointCode = value.pointCode;
        this.pointName = value.pointName;
        this.pointNum = value.pointNum;
        this.pointAcc = value.pointAcc;
        this.regId = value.regId;
        this.regDate = value.regDate;
    }

    public JZDrUserPoint(
        Integer       idx,
        String        userId,
        String        pointCode,
        String        pointName,
        Integer       pointNum,
        Integer       pointAcc,
        String        regId,
        LocalDateTime regDate
    ) {
        this.idx = idx;
        this.userId = userId;
        this.pointCode = pointCode;
        this.pointName = pointName;
        this.pointNum = pointNum;
        this.pointAcc = pointAcc;
        this.regId = regId;
        this.regDate = regDate;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_USER_POINT.IDX</code>.
     */
    public Integer getIdx() {
        return this.idx;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_USER_POINT.USER_ID</code>.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_USER_POINT.POINT_CODE</code>.
     */
    public String getPointCode() {
        return this.pointCode;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_USER_POINT.POINT_NAME</code>. 포인트 명
     */
    public String getPointName() {
        return this.pointName;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_USER_POINT.POINT_NUM</code>.
     */
    public Integer getPointNum() {
        return this.pointNum;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_USER_POINT.POINT_ACC</code>. 사용자 누적 포인트
     */
    public Integer getPointAcc() {
        return this.pointAcc;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_USER_POINT.REG_ID</code>. 등록자 ID
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_USER_POINT.REG_DATE</code>. 등록 일자
     */
    public LocalDateTime getRegDate() {
        return this.regDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JZDrUserPoint (");

        sb.append(idx);
        sb.append(", ").append(userId);
        sb.append(", ").append(pointCode);
        sb.append(", ").append(pointName);
        sb.append(", ").append(pointNum);
        sb.append(", ").append(pointAcc);
        sb.append(", ").append(regId);
        sb.append(", ").append(regDate);

        sb.append(")");
        return sb.toString();
    }
}
