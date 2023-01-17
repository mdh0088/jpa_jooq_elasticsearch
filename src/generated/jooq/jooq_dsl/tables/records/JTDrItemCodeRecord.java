/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.jooq_dsl.tables.JTDrItemCode;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 아이템 유닛 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrItemCodeRecord extends UpdatableRecordImpl<JTDrItemCodeRecord> implements Record12<String, String, String, Integer, String, Integer, Integer, String, String, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_CODE</code>.
     */
    public JTDrItemCodeRecord setItemCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_CODE</code>.
     */
    public String getItemCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_GROUP_CODE</code>. 아이템 그룹
     * 코드
     */
    public JTDrItemCodeRecord setItemGroupCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_GROUP_CODE</code>. 아이템 그룹
     * 코드
     */
    public String getItemGroupCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_NAME</code>. 아이템 명
     */
    public JTDrItemCodeRecord setItemName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_NAME</code>. 아이템 명
     */
    public String getItemName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_TYPE</code>. 코드 타입 (0: 공통
     * 1: 카테고리)
     */
    public JTDrItemCodeRecord setItemType(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_TYPE</code>. 코드 타입 (0: 공통
     * 1: 카테고리)
     */
    public Integer getItemType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_PARENT_CODE</code>. 등록자
     * ID
     */
    public JTDrItemCodeRecord setItemParentCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_PARENT_CODE</code>. 등록자
     * ID
     */
    public String getItemParentCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_DEPTH</code>. 뎁스
     */
    public JTDrItemCodeRecord setItemDepth(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_DEPTH</code>. 뎁스
     */
    public Integer getItemDepth() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_SEQ</code>.
     */
    public JTDrItemCodeRecord setItemSeq(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_SEQ</code>.
     */
    public Integer getItemSeq() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_ACTIVE</code>. 사용여부
     */
    public JTDrItemCodeRecord setItemActive(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_ACTIVE</code>. 사용여부
     */
    public String getItemActive() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.REG_ID</code>. 등록자 ID
     */
    public JTDrItemCodeRecord setRegId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.REG_ID</code>. 등록자 ID
     */
    public String getRegId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.REG_DATE</code>. 등록 일자
     */
    public JTDrItemCodeRecord setRegDate(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.REG_DATE</code>. 등록 일자
     */
    public LocalDateTime getRegDate() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.EDIT_DATE</code>. 변경일자
     */
    public JTDrItemCodeRecord setEditDate(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.EDIT_DATE</code>. 변경일자
     */
    public LocalDateTime getEditDate() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ITEM_CODE.EDIT_ID</code>. 변경자 ID
     */
    public JTDrItemCodeRecord setEditId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.EDIT_ID</code>. 변경자 ID
     */
    public String getEditId() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, Integer, String, Integer, Integer, String, String, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, Integer, String, Integer, Integer, String, String, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JTDrItemCode.T_DR_ITEM_CODE.ITEM_CODE;
    }

    @Override
    public Field<String> field2() {
        return JTDrItemCode.T_DR_ITEM_CODE.ITEM_GROUP_CODE;
    }

    @Override
    public Field<String> field3() {
        return JTDrItemCode.T_DR_ITEM_CODE.ITEM_NAME;
    }

    @Override
    public Field<Integer> field4() {
        return JTDrItemCode.T_DR_ITEM_CODE.ITEM_TYPE;
    }

    @Override
    public Field<String> field5() {
        return JTDrItemCode.T_DR_ITEM_CODE.ITEM_PARENT_CODE;
    }

    @Override
    public Field<Integer> field6() {
        return JTDrItemCode.T_DR_ITEM_CODE.ITEM_DEPTH;
    }

    @Override
    public Field<Integer> field7() {
        return JTDrItemCode.T_DR_ITEM_CODE.ITEM_SEQ;
    }

    @Override
    public Field<String> field8() {
        return JTDrItemCode.T_DR_ITEM_CODE.ITEM_ACTIVE;
    }

    @Override
    public Field<String> field9() {
        return JTDrItemCode.T_DR_ITEM_CODE.REG_ID;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return JTDrItemCode.T_DR_ITEM_CODE.REG_DATE;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return JTDrItemCode.T_DR_ITEM_CODE.EDIT_DATE;
    }

    @Override
    public Field<String> field12() {
        return JTDrItemCode.T_DR_ITEM_CODE.EDIT_ID;
    }

    @Override
    public String component1() {
        return getItemCode();
    }

    @Override
    public String component2() {
        return getItemGroupCode();
    }

    @Override
    public String component3() {
        return getItemName();
    }

    @Override
    public Integer component4() {
        return getItemType();
    }

    @Override
    public String component5() {
        return getItemParentCode();
    }

    @Override
    public Integer component6() {
        return getItemDepth();
    }

    @Override
    public Integer component7() {
        return getItemSeq();
    }

    @Override
    public String component8() {
        return getItemActive();
    }

    @Override
    public String component9() {
        return getRegId();
    }

    @Override
    public LocalDateTime component10() {
        return getRegDate();
    }

    @Override
    public LocalDateTime component11() {
        return getEditDate();
    }

    @Override
    public String component12() {
        return getEditId();
    }

    @Override
    public String value1() {
        return getItemCode();
    }

    @Override
    public String value2() {
        return getItemGroupCode();
    }

    @Override
    public String value3() {
        return getItemName();
    }

    @Override
    public Integer value4() {
        return getItemType();
    }

    @Override
    public String value5() {
        return getItemParentCode();
    }

    @Override
    public Integer value6() {
        return getItemDepth();
    }

    @Override
    public Integer value7() {
        return getItemSeq();
    }

    @Override
    public String value8() {
        return getItemActive();
    }

    @Override
    public String value9() {
        return getRegId();
    }

    @Override
    public LocalDateTime value10() {
        return getRegDate();
    }

    @Override
    public LocalDateTime value11() {
        return getEditDate();
    }

    @Override
    public String value12() {
        return getEditId();
    }

    @Override
    public JTDrItemCodeRecord value1(String value) {
        setItemCode(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value2(String value) {
        setItemGroupCode(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value3(String value) {
        setItemName(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value4(Integer value) {
        setItemType(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value5(String value) {
        setItemParentCode(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value6(Integer value) {
        setItemDepth(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value7(Integer value) {
        setItemSeq(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value8(String value) {
        setItemActive(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value9(String value) {
        setRegId(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value10(LocalDateTime value) {
        setRegDate(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value11(LocalDateTime value) {
        setEditDate(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord value12(String value) {
        setEditId(value);
        return this;
    }

    @Override
    public JTDrItemCodeRecord values(String value1, String value2, String value3, Integer value4, String value5, Integer value6, Integer value7, String value8, String value9, LocalDateTime value10, LocalDateTime value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JTDrItemCodeRecord
     */
    public JTDrItemCodeRecord() {
        super(JTDrItemCode.T_DR_ITEM_CODE);
    }

    /**
     * Create a detached, initialised JTDrItemCodeRecord
     */
    public JTDrItemCodeRecord(String itemCode, String itemGroupCode, String itemName, Integer itemType, String itemParentCode, Integer itemDepth, Integer itemSeq, String itemActive, String regId, LocalDateTime regDate, LocalDateTime editDate, String editId) {
        super(JTDrItemCode.T_DR_ITEM_CODE);

        setItemCode(itemCode);
        setItemGroupCode(itemGroupCode);
        setItemName(itemName);
        setItemType(itemType);
        setItemParentCode(itemParentCode);
        setItemDepth(itemDepth);
        setItemSeq(itemSeq);
        setItemActive(itemActive);
        setRegId(regId);
        setRegDate(regDate);
        setEditDate(editDate);
        setEditId(editId);
    }

    /**
     * Create a detached, initialised JTDrItemCodeRecord
     */
    public JTDrItemCodeRecord(jooq.jooq_dsl.tables.pojos.JTDrItemCode value) {
        super(JTDrItemCode.T_DR_ITEM_CODE);

        if (value != null) {
            setItemCode(value.getItemCode());
            setItemGroupCode(value.getItemGroupCode());
            setItemName(value.getItemName());
            setItemType(value.getItemType());
            setItemParentCode(value.getItemParentCode());
            setItemDepth(value.getItemDepth());
            setItemSeq(value.getItemSeq());
            setItemActive(value.getItemActive());
            setRegId(value.getRegId());
            setRegDate(value.getRegDate());
            setEditDate(value.getEditDate());
            setEditId(value.getEditId());
        }
    }
}