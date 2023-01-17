/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.jooq_dsl.tables.JZDrOrderFaile;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 리포트 열람 이력 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrOrderFaileRecord extends UpdatableRecordImpl<JZDrOrderFaileRecord> implements Record14<Integer, String, String, LocalDateTime, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.ID</code>.
     */
    public JZDrOrderFaileRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.ORDER_CODE</code>.
     */
    public JZDrOrderFaileRecord setOrderCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.ORDER_CODE</code>.
     */
    public String getOrderCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.USER_ID</code>. 사용자ID
     */
    public JZDrOrderFaileRecord setUserId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.USER_ID</code>. 사용자ID
     */
    public String getUserId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.REG_DATE</code>.
     */
    public JZDrOrderFaileRecord setRegDate(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.REG_DATE</code>.
     */
    public LocalDateTime getRegDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL1</code>.
     */
    public JZDrOrderFaileRecord setCol1(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL1</code>.
     */
    public String getCol1() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL2</code>.
     */
    public JZDrOrderFaileRecord setCol2(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL2</code>.
     */
    public String getCol2() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL3</code>.
     */
    public JZDrOrderFaileRecord setCol3(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL3</code>.
     */
    public String getCol3() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL4</code>.
     */
    public JZDrOrderFaileRecord setCol4(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL4</code>.
     */
    public String getCol4() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL5</code>.
     */
    public JZDrOrderFaileRecord setCol5(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL5</code>.
     */
    public String getCol5() {
        return (String) get(8);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL6</code>.
     */
    public JZDrOrderFaileRecord setCol6(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL6</code>.
     */
    public String getCol6() {
        return (String) get(9);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL7</code>.
     */
    public JZDrOrderFaileRecord setCol7(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL7</code>.
     */
    public String getCol7() {
        return (String) get(10);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL8</code>.
     */
    public JZDrOrderFaileRecord setCol8(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL8</code>.
     */
    public String getCol8() {
        return (String) get(11);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL9</code>.
     */
    public JZDrOrderFaileRecord setCol9(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL9</code>.
     */
    public String getCol9() {
        return (String) get(12);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_ORDER_FAILE.COL10</code>.
     */
    public JZDrOrderFaileRecord setCol10(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_ORDER_FAILE.COL10</code>.
     */
    public String getCol10() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, LocalDateTime, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Integer, String, String, LocalDateTime, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.ID;
    }

    @Override
    public Field<String> field2() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.ORDER_CODE;
    }

    @Override
    public Field<String> field3() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.USER_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.REG_DATE;
    }

    @Override
    public Field<String> field5() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL1;
    }

    @Override
    public Field<String> field6() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL2;
    }

    @Override
    public Field<String> field7() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL3;
    }

    @Override
    public Field<String> field8() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL4;
    }

    @Override
    public Field<String> field9() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL5;
    }

    @Override
    public Field<String> field10() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL6;
    }

    @Override
    public Field<String> field11() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL7;
    }

    @Override
    public Field<String> field12() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL8;
    }

    @Override
    public Field<String> field13() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL9;
    }

    @Override
    public Field<String> field14() {
        return JZDrOrderFaile.Z_DR_ORDER_FAILE.COL10;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getOrderCode();
    }

    @Override
    public String component3() {
        return getUserId();
    }

    @Override
    public LocalDateTime component4() {
        return getRegDate();
    }

    @Override
    public String component5() {
        return getCol1();
    }

    @Override
    public String component6() {
        return getCol2();
    }

    @Override
    public String component7() {
        return getCol3();
    }

    @Override
    public String component8() {
        return getCol4();
    }

    @Override
    public String component9() {
        return getCol5();
    }

    @Override
    public String component10() {
        return getCol6();
    }

    @Override
    public String component11() {
        return getCol7();
    }

    @Override
    public String component12() {
        return getCol8();
    }

    @Override
    public String component13() {
        return getCol9();
    }

    @Override
    public String component14() {
        return getCol10();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getOrderCode();
    }

    @Override
    public String value3() {
        return getUserId();
    }

    @Override
    public LocalDateTime value4() {
        return getRegDate();
    }

    @Override
    public String value5() {
        return getCol1();
    }

    @Override
    public String value6() {
        return getCol2();
    }

    @Override
    public String value7() {
        return getCol3();
    }

    @Override
    public String value8() {
        return getCol4();
    }

    @Override
    public String value9() {
        return getCol5();
    }

    @Override
    public String value10() {
        return getCol6();
    }

    @Override
    public String value11() {
        return getCol7();
    }

    @Override
    public String value12() {
        return getCol8();
    }

    @Override
    public String value13() {
        return getCol9();
    }

    @Override
    public String value14() {
        return getCol10();
    }

    @Override
    public JZDrOrderFaileRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value2(String value) {
        setOrderCode(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value3(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value4(LocalDateTime value) {
        setRegDate(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value5(String value) {
        setCol1(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value6(String value) {
        setCol2(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value7(String value) {
        setCol3(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value8(String value) {
        setCol4(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value9(String value) {
        setCol5(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value10(String value) {
        setCol6(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value11(String value) {
        setCol7(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value12(String value) {
        setCol8(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value13(String value) {
        setCol9(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord value14(String value) {
        setCol10(value);
        return this;
    }

    @Override
    public JZDrOrderFaileRecord values(Integer value1, String value2, String value3, LocalDateTime value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JZDrOrderFaileRecord
     */
    public JZDrOrderFaileRecord() {
        super(JZDrOrderFaile.Z_DR_ORDER_FAILE);
    }

    /**
     * Create a detached, initialised JZDrOrderFaileRecord
     */
    public JZDrOrderFaileRecord(Integer id, String orderCode, String userId, LocalDateTime regDate, String col1, String col2, String col3, String col4, String col5, String col6, String col7, String col8, String col9, String col10) {
        super(JZDrOrderFaile.Z_DR_ORDER_FAILE);

        setId(id);
        setOrderCode(orderCode);
        setUserId(userId);
        setRegDate(regDate);
        setCol1(col1);
        setCol2(col2);
        setCol3(col3);
        setCol4(col4);
        setCol5(col5);
        setCol6(col6);
        setCol7(col7);
        setCol8(col8);
        setCol9(col9);
        setCol10(col10);
    }

    /**
     * Create a detached, initialised JZDrOrderFaileRecord
     */
    public JZDrOrderFaileRecord(jooq.jooq_dsl.tables.pojos.JZDrOrderFaile value) {
        super(JZDrOrderFaile.Z_DR_ORDER_FAILE);

        if (value != null) {
            setId(value.getId());
            setOrderCode(value.getOrderCode());
            setUserId(value.getUserId());
            setRegDate(value.getRegDate());
            setCol1(value.getCol1());
            setCol2(value.getCol2());
            setCol3(value.getCol3());
            setCol4(value.getCol4());
            setCol5(value.getCol5());
            setCol6(value.getCol6());
            setCol7(value.getCol7());
            setCol8(value.getCol8());
            setCol9(value.getCol9());
            setCol10(value.getCol10());
        }
    }
}
