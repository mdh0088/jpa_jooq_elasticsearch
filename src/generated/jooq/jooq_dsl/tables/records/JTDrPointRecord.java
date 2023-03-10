/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.jooq_dsl.tables.JTDrPoint;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 포인트  유닛 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrPointRecord extends UpdatableRecordImpl<JTDrPointRecord> implements Record9<String, String, Integer, String, String, String, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.T_DR_POINT.POINT_CODE</code>.
     */
    public JTDrPointRecord setPointCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.POINT_CODE</code>.
     */
    public String getPointCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dmc_report.T_DR_POINT.POINT_NAME</code>. 포인트 명
     */
    public JTDrPointRecord setPointName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.POINT_NAME</code>. 포인트 명
     */
    public String getPointName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.T_DR_POINT.POINT_NUM</code>.
     */
    public JTDrPointRecord setPointNum(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.POINT_NUM</code>.
     */
    public Integer getPointNum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>dmc_report.T_DR_POINT.POINT_ACTIVE</code>. 사용여부
     */
    public JTDrPointRecord setPointActive(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.POINT_ACTIVE</code>. 사용여부
     */
    public String getPointActive() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dmc_report.T_DR_POINT.POINT_DESC</code>. 사용여부
     */
    public JTDrPointRecord setPointDesc(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.POINT_DESC</code>. 사용여부
     */
    public String getPointDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dmc_report.T_DR_POINT.REG_ID</code>. 등록자 ID
     */
    public JTDrPointRecord setRegId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.REG_ID</code>. 등록자 ID
     */
    public String getRegId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dmc_report.T_DR_POINT.REG_DATE</code>. 등록 일자
     */
    public JTDrPointRecord setRegDate(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.REG_DATE</code>. 등록 일자
     */
    public LocalDateTime getRegDate() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>dmc_report.T_DR_POINT.EDIT_DATE</code>. 변경일자
     */
    public JTDrPointRecord setEditDate(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.EDIT_DATE</code>. 변경일자
     */
    public LocalDateTime getEditDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>dmc_report.T_DR_POINT.EDIT_ID</code>. 변경자 ID
     */
    public JTDrPointRecord setEditId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_POINT.EDIT_ID</code>. 변경자 ID
     */
    public String getEditId() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, Integer, String, String, String, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, Integer, String, String, String, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JTDrPoint.T_DR_POINT.POINT_CODE;
    }

    @Override
    public Field<String> field2() {
        return JTDrPoint.T_DR_POINT.POINT_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return JTDrPoint.T_DR_POINT.POINT_NUM;
    }

    @Override
    public Field<String> field4() {
        return JTDrPoint.T_DR_POINT.POINT_ACTIVE;
    }

    @Override
    public Field<String> field5() {
        return JTDrPoint.T_DR_POINT.POINT_DESC;
    }

    @Override
    public Field<String> field6() {
        return JTDrPoint.T_DR_POINT.REG_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return JTDrPoint.T_DR_POINT.REG_DATE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return JTDrPoint.T_DR_POINT.EDIT_DATE;
    }

    @Override
    public Field<String> field9() {
        return JTDrPoint.T_DR_POINT.EDIT_ID;
    }

    @Override
    public String component1() {
        return getPointCode();
    }

    @Override
    public String component2() {
        return getPointName();
    }

    @Override
    public Integer component3() {
        return getPointNum();
    }

    @Override
    public String component4() {
        return getPointActive();
    }

    @Override
    public String component5() {
        return getPointDesc();
    }

    @Override
    public String component6() {
        return getRegId();
    }

    @Override
    public LocalDateTime component7() {
        return getRegDate();
    }

    @Override
    public LocalDateTime component8() {
        return getEditDate();
    }

    @Override
    public String component9() {
        return getEditId();
    }

    @Override
    public String value1() {
        return getPointCode();
    }

    @Override
    public String value2() {
        return getPointName();
    }

    @Override
    public Integer value3() {
        return getPointNum();
    }

    @Override
    public String value4() {
        return getPointActive();
    }

    @Override
    public String value5() {
        return getPointDesc();
    }

    @Override
    public String value6() {
        return getRegId();
    }

    @Override
    public LocalDateTime value7() {
        return getRegDate();
    }

    @Override
    public LocalDateTime value8() {
        return getEditDate();
    }

    @Override
    public String value9() {
        return getEditId();
    }

    @Override
    public JTDrPointRecord value1(String value) {
        setPointCode(value);
        return this;
    }

    @Override
    public JTDrPointRecord value2(String value) {
        setPointName(value);
        return this;
    }

    @Override
    public JTDrPointRecord value3(Integer value) {
        setPointNum(value);
        return this;
    }

    @Override
    public JTDrPointRecord value4(String value) {
        setPointActive(value);
        return this;
    }

    @Override
    public JTDrPointRecord value5(String value) {
        setPointDesc(value);
        return this;
    }

    @Override
    public JTDrPointRecord value6(String value) {
        setRegId(value);
        return this;
    }

    @Override
    public JTDrPointRecord value7(LocalDateTime value) {
        setRegDate(value);
        return this;
    }

    @Override
    public JTDrPointRecord value8(LocalDateTime value) {
        setEditDate(value);
        return this;
    }

    @Override
    public JTDrPointRecord value9(String value) {
        setEditId(value);
        return this;
    }

    @Override
    public JTDrPointRecord values(String value1, String value2, Integer value3, String value4, String value5, String value6, LocalDateTime value7, LocalDateTime value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JTDrPointRecord
     */
    public JTDrPointRecord() {
        super(JTDrPoint.T_DR_POINT);
    }

    /**
     * Create a detached, initialised JTDrPointRecord
     */
    public JTDrPointRecord(String pointCode, String pointName, Integer pointNum, String pointActive, String pointDesc, String regId, LocalDateTime regDate, LocalDateTime editDate, String editId) {
        super(JTDrPoint.T_DR_POINT);

        setPointCode(pointCode);
        setPointName(pointName);
        setPointNum(pointNum);
        setPointActive(pointActive);
        setPointDesc(pointDesc);
        setRegId(regId);
        setRegDate(regDate);
        setEditDate(editDate);
        setEditId(editId);
    }

    /**
     * Create a detached, initialised JTDrPointRecord
     */
    public JTDrPointRecord(jooq.jooq_dsl.tables.pojos.JTDrPoint value) {
        super(JTDrPoint.T_DR_POINT);

        if (value != null) {
            setPointCode(value.getPointCode());
            setPointName(value.getPointName());
            setPointNum(value.getPointNum());
            setPointActive(value.getPointActive());
            setPointDesc(value.getPointDesc());
            setRegId(value.getRegId());
            setRegDate(value.getRegDate());
            setEditDate(value.getEditDate());
            setEditId(value.getEditId());
        }
    }
}
