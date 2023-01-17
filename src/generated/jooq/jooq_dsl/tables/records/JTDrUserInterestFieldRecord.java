/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import jooq.jooq_dsl.tables.JTDrUserInterestField;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrUserInterestFieldRecord extends TableRecordImpl<JTDrUserInterestFieldRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.T_DR_USER_INTEREST_FIELD.USER_ID</code>.
     */
    public JTDrUserInterestFieldRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER_INTEREST_FIELD.USER_ID</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>dmc_report.T_DR_USER_INTEREST_FIELD.INTEREST_FIELD_CODE</code>.
     */
    public JTDrUserInterestFieldRecord setInterestFieldCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>dmc_report.T_DR_USER_INTEREST_FIELD.INTEREST_FIELD_CODE</code>.
     */
    public String getInterestFieldCode() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JTDrUserInterestField.T_DR_USER_INTEREST_FIELD.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return JTDrUserInterestField.T_DR_USER_INTEREST_FIELD.INTEREST_FIELD_CODE;
    }

    @Override
    public String component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getInterestFieldCode();
    }

    @Override
    public String value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getInterestFieldCode();
    }

    @Override
    public JTDrUserInterestFieldRecord value1(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public JTDrUserInterestFieldRecord value2(String value) {
        setInterestFieldCode(value);
        return this;
    }

    @Override
    public JTDrUserInterestFieldRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JTDrUserInterestFieldRecord
     */
    public JTDrUserInterestFieldRecord() {
        super(JTDrUserInterestField.T_DR_USER_INTEREST_FIELD);
    }

    /**
     * Create a detached, initialised JTDrUserInterestFieldRecord
     */
    public JTDrUserInterestFieldRecord(String userId, String interestFieldCode) {
        super(JTDrUserInterestField.T_DR_USER_INTEREST_FIELD);

        setUserId(userId);
        setInterestFieldCode(interestFieldCode);
    }

    /**
     * Create a detached, initialised JTDrUserInterestFieldRecord
     */
    public JTDrUserInterestFieldRecord(jooq.jooq_dsl.tables.pojos.JTDrUserInterestField value) {
        super(JTDrUserInterestField.T_DR_USER_INTEREST_FIELD);

        if (value != null) {
            setUserId(value.getUserId());
            setInterestFieldCode(value.getInterestFieldCode());
        }
    }
}