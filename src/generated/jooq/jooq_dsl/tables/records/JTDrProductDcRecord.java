/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.jooq_dsl.tables.JTDrProductDc;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrProductDcRecord extends UpdatableRecordImpl<JTDrProductDcRecord> implements Record17<Integer, String, String, Integer, Integer, Integer, LocalDateTime, LocalDateTime, String, Integer, Integer, Integer, Integer, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.IDX</code>.
     */
    public JTDrProductDcRecord setIdx(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.IDX</code>.
     */
    public Integer getIdx() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.P_CODE</code>.
     */
    public JTDrProductDcRecord setPCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.P_CODE</code>.
     */
    public String getPCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.DC_CODE</code>. 할인코드
     */
    public JTDrProductDcRecord setDcCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.DC_CODE</code>. 할인코드
     */
    public String getDcCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.DISCOUNT</code>. 할인율
     */
    public JTDrProductDcRecord setDiscount(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.DISCOUNT</code>. 할인율
     */
    public Integer getDiscount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.DC_PRICE</code>. 할인금액

     */
    public JTDrProductDcRecord setDcPrice(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.DC_PRICE</code>. 할인금액

     */
    public Integer getDcPrice() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.DC_RESULT_PRICE</code>.
     * 할인적용금액
     */
    public JTDrProductDcRecord setDcResultPrice(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.DC_RESULT_PRICE</code>.
     * 할인적용금액
     */
    public Integer getDcResultPrice() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.START_DATE</code>.
     */
    public JTDrProductDcRecord setStartDate(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.START_DATE</code>.
     */
    public LocalDateTime getStartDate() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.END_DATE</code>.
     */
    public JTDrProductDcRecord setEndDate(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.END_DATE</code>.
     */
    public LocalDateTime getEndDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.COMPLETE_YN</code>. 만료처리
     */
    public JTDrProductDcRecord setCompleteYn(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.COMPLETE_YN</code>. 만료처리
     */
    public String getCompleteYn() {
        return (String) get(8);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.MAX_DISCOUNT</code>.
     */
    public JTDrProductDcRecord setMaxDiscount(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.MAX_DISCOUNT</code>.
     */
    public Integer getMaxDiscount() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.MIN_DISCOUNT</code>.
     */
    public JTDrProductDcRecord setMinDiscount(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.MIN_DISCOUNT</code>.
     */
    public Integer getMinDiscount() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.MAX_DC_PRICE</code>.
     */
    public JTDrProductDcRecord setMaxDcPrice(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.MAX_DC_PRICE</code>.
     */
    public Integer getMaxDcPrice() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.MIN_DC_PRICE</code>.
     */
    public JTDrProductDcRecord setMinDcPrice(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.MIN_DC_PRICE</code>.
     */
    public Integer getMinDcPrice() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.REGIST_ID</code>. 등록자
     */
    public JTDrProductDcRecord setRegistId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.REGIST_ID</code>. 등록자
     */
    public String getRegistId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.REGIST_DATE</code>. 등록일
     */
    public JTDrProductDcRecord setRegistDate(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.REGIST_DATE</code>. 등록일
     */
    public LocalDateTime getRegistDate() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.UPDATE_ID</code>. 수정자
     */
    public JTDrProductDcRecord setUpdateId(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.UPDATE_ID</code>. 수정자
     */
    public String getUpdateId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>dmc_report.T_DR_PRODUCT_DC.UPDATE_DATE</code>. 수정일
     */
    public JTDrProductDcRecord setUpdateDate(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_PRODUCT_DC.UPDATE_DATE</code>. 수정일
     */
    public LocalDateTime getUpdateDate() {
        return (LocalDateTime) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Integer, String, String, Integer, Integer, Integer, LocalDateTime, LocalDateTime, String, Integer, Integer, Integer, Integer, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Integer, String, String, Integer, Integer, Integer, LocalDateTime, LocalDateTime, String, Integer, Integer, Integer, Integer, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JTDrProductDc.T_DR_PRODUCT_DC.IDX;
    }

    @Override
    public Field<String> field2() {
        return JTDrProductDc.T_DR_PRODUCT_DC.P_CODE;
    }

    @Override
    public Field<String> field3() {
        return JTDrProductDc.T_DR_PRODUCT_DC.DC_CODE;
    }

    @Override
    public Field<Integer> field4() {
        return JTDrProductDc.T_DR_PRODUCT_DC.DISCOUNT;
    }

    @Override
    public Field<Integer> field5() {
        return JTDrProductDc.T_DR_PRODUCT_DC.DC_PRICE;
    }

    @Override
    public Field<Integer> field6() {
        return JTDrProductDc.T_DR_PRODUCT_DC.DC_RESULT_PRICE;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return JTDrProductDc.T_DR_PRODUCT_DC.START_DATE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return JTDrProductDc.T_DR_PRODUCT_DC.END_DATE;
    }

    @Override
    public Field<String> field9() {
        return JTDrProductDc.T_DR_PRODUCT_DC.COMPLETE_YN;
    }

    @Override
    public Field<Integer> field10() {
        return JTDrProductDc.T_DR_PRODUCT_DC.MAX_DISCOUNT;
    }

    @Override
    public Field<Integer> field11() {
        return JTDrProductDc.T_DR_PRODUCT_DC.MIN_DISCOUNT;
    }

    @Override
    public Field<Integer> field12() {
        return JTDrProductDc.T_DR_PRODUCT_DC.MAX_DC_PRICE;
    }

    @Override
    public Field<Integer> field13() {
        return JTDrProductDc.T_DR_PRODUCT_DC.MIN_DC_PRICE;
    }

    @Override
    public Field<String> field14() {
        return JTDrProductDc.T_DR_PRODUCT_DC.REGIST_ID;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return JTDrProductDc.T_DR_PRODUCT_DC.REGIST_DATE;
    }

    @Override
    public Field<String> field16() {
        return JTDrProductDc.T_DR_PRODUCT_DC.UPDATE_ID;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return JTDrProductDc.T_DR_PRODUCT_DC.UPDATE_DATE;
    }

    @Override
    public Integer component1() {
        return getIdx();
    }

    @Override
    public String component2() {
        return getPCode();
    }

    @Override
    public String component3() {
        return getDcCode();
    }

    @Override
    public Integer component4() {
        return getDiscount();
    }

    @Override
    public Integer component5() {
        return getDcPrice();
    }

    @Override
    public Integer component6() {
        return getDcResultPrice();
    }

    @Override
    public LocalDateTime component7() {
        return getStartDate();
    }

    @Override
    public LocalDateTime component8() {
        return getEndDate();
    }

    @Override
    public String component9() {
        return getCompleteYn();
    }

    @Override
    public Integer component10() {
        return getMaxDiscount();
    }

    @Override
    public Integer component11() {
        return getMinDiscount();
    }

    @Override
    public Integer component12() {
        return getMaxDcPrice();
    }

    @Override
    public Integer component13() {
        return getMinDcPrice();
    }

    @Override
    public String component14() {
        return getRegistId();
    }

    @Override
    public LocalDateTime component15() {
        return getRegistDate();
    }

    @Override
    public String component16() {
        return getUpdateId();
    }

    @Override
    public LocalDateTime component17() {
        return getUpdateDate();
    }

    @Override
    public Integer value1() {
        return getIdx();
    }

    @Override
    public String value2() {
        return getPCode();
    }

    @Override
    public String value3() {
        return getDcCode();
    }

    @Override
    public Integer value4() {
        return getDiscount();
    }

    @Override
    public Integer value5() {
        return getDcPrice();
    }

    @Override
    public Integer value6() {
        return getDcResultPrice();
    }

    @Override
    public LocalDateTime value7() {
        return getStartDate();
    }

    @Override
    public LocalDateTime value8() {
        return getEndDate();
    }

    @Override
    public String value9() {
        return getCompleteYn();
    }

    @Override
    public Integer value10() {
        return getMaxDiscount();
    }

    @Override
    public Integer value11() {
        return getMinDiscount();
    }

    @Override
    public Integer value12() {
        return getMaxDcPrice();
    }

    @Override
    public Integer value13() {
        return getMinDcPrice();
    }

    @Override
    public String value14() {
        return getRegistId();
    }

    @Override
    public LocalDateTime value15() {
        return getRegistDate();
    }

    @Override
    public String value16() {
        return getUpdateId();
    }

    @Override
    public LocalDateTime value17() {
        return getUpdateDate();
    }

    @Override
    public JTDrProductDcRecord value1(Integer value) {
        setIdx(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value2(String value) {
        setPCode(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value3(String value) {
        setDcCode(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value4(Integer value) {
        setDiscount(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value5(Integer value) {
        setDcPrice(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value6(Integer value) {
        setDcResultPrice(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value7(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value8(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value9(String value) {
        setCompleteYn(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value10(Integer value) {
        setMaxDiscount(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value11(Integer value) {
        setMinDiscount(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value12(Integer value) {
        setMaxDcPrice(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value13(Integer value) {
        setMinDcPrice(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value14(String value) {
        setRegistId(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value15(LocalDateTime value) {
        setRegistDate(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value16(String value) {
        setUpdateId(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord value17(LocalDateTime value) {
        setUpdateDate(value);
        return this;
    }

    @Override
    public JTDrProductDcRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Integer value6, LocalDateTime value7, LocalDateTime value8, String value9, Integer value10, Integer value11, Integer value12, Integer value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JTDrProductDcRecord
     */
    public JTDrProductDcRecord() {
        super(JTDrProductDc.T_DR_PRODUCT_DC);
    }

    /**
     * Create a detached, initialised JTDrProductDcRecord
     */
    public JTDrProductDcRecord(Integer idx, String pCode, String dcCode, Integer discount, Integer dcPrice, Integer dcResultPrice, LocalDateTime startDate, LocalDateTime endDate, String completeYn, Integer maxDiscount, Integer minDiscount, Integer maxDcPrice, Integer minDcPrice, String registId, LocalDateTime registDate, String updateId, LocalDateTime updateDate) {
        super(JTDrProductDc.T_DR_PRODUCT_DC);

        setIdx(idx);
        setPCode(pCode);
        setDcCode(dcCode);
        setDiscount(discount);
        setDcPrice(dcPrice);
        setDcResultPrice(dcResultPrice);
        setStartDate(startDate);
        setEndDate(endDate);
        setCompleteYn(completeYn);
        setMaxDiscount(maxDiscount);
        setMinDiscount(minDiscount);
        setMaxDcPrice(maxDcPrice);
        setMinDcPrice(minDcPrice);
        setRegistId(registId);
        setRegistDate(registDate);
        setUpdateId(updateId);
        setUpdateDate(updateDate);
    }

    /**
     * Create a detached, initialised JTDrProductDcRecord
     */
    public JTDrProductDcRecord(jooq.jooq_dsl.tables.pojos.JTDrProductDc value) {
        super(JTDrProductDc.T_DR_PRODUCT_DC);

        if (value != null) {
            setIdx(value.getIdx());
            setPCode(value.getPCode());
            setDcCode(value.getDcCode());
            setDiscount(value.getDiscount());
            setDcPrice(value.getDcPrice());
            setDcResultPrice(value.getDcResultPrice());
            setStartDate(value.getStartDate());
            setEndDate(value.getEndDate());
            setCompleteYn(value.getCompleteYn());
            setMaxDiscount(value.getMaxDiscount());
            setMinDiscount(value.getMinDiscount());
            setMaxDcPrice(value.getMaxDcPrice());
            setMinDcPrice(value.getMinDcPrice());
            setRegistId(value.getRegistId());
            setRegistDate(value.getRegistDate());
            setUpdateId(value.getUpdateId());
            setUpdateDate(value.getUpdateDate());
        }
    }
}
