/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrUserInterestField implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String userId;
    private final String interestFieldCode;

    public JTDrUserInterestField(JTDrUserInterestField value) {
        this.userId = value.userId;
        this.interestFieldCode = value.interestFieldCode;
    }

    public JTDrUserInterestField(
        String userId,
        String interestFieldCode
    ) {
        this.userId = userId;
        this.interestFieldCode = interestFieldCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER_INTEREST_FIELD.USER_ID</code>.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Getter for
     * <code>dmc_report.T_DR_USER_INTEREST_FIELD.INTEREST_FIELD_CODE</code>.
     */
    public String getInterestFieldCode() {
        return this.interestFieldCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JTDrUserInterestField (");

        sb.append(userId);
        sb.append(", ").append(interestFieldCode);

        sb.append(")");
        return sb.toString();
    }
}
