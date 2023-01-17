/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.jooq_dsl.tables.JTDrCoupon;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 쿠폰 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrCouponRecord extends UpdatableRecordImpl<JTDrCouponRecord> implements Record10<String, String, LocalDateTime, LocalDateTime, String, Integer, String, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.COUPON_CODE</code>. 쿠폰 코드
     */
    public JTDrCouponRecord setCouponCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.COUPON_CODE</code>. 쿠폰 코드
     */
    public String getCouponCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.COUPON_TYPE</code>. 쿠폰 타입
     */
    public JTDrCouponRecord setCouponType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.COUPON_TYPE</code>. 쿠폰 타입
     */
    public String getCouponType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.START_DATE</code>. 발행일
     */
    public JTDrCouponRecord setStartDate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.START_DATE</code>. 발행일
     */
    public LocalDateTime getStartDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.END_DATE</code>. 만료일
     */
    public JTDrCouponRecord setEndDate(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.END_DATE</code>. 만료일
     */
    public LocalDateTime getEndDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.COUPON_NAME</code>. 이름
     */
    public JTDrCouponRecord setCouponName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.COUPON_NAME</code>. 이름
     */
    public String getCouponName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.COUPON_CNT</code>. 발행수
     */
    public JTDrCouponRecord setCouponCnt(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.COUPON_CNT</code>. 발행수
     */
    public Integer getCouponCnt() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.COUPON_STATUS</code>. 상태 1:지급중
     * 2:전체만료
     */
    public JTDrCouponRecord setCouponStatus(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.COUPON_STATUS</code>. 상태 1:지급중
     * 2:전체만료
     */
    public String getCouponStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.OPT_TYPE</code>. 발행 옵션기준
     */
    public JTDrCouponRecord setOptType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.OPT_TYPE</code>. 발행 옵션기준
     */
    public String getOptType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.OPT_VALUE</code>. 옵션값
     */
    public JTDrCouponRecord setOptValue(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.OPT_VALUE</code>. 옵션값
     */
    public Integer getOptValue() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>dmc_report.T_DR_COUPON.COUPON_DESC</code>. 설명
     */
    public JTDrCouponRecord setCouponDesc(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_COUPON.COUPON_DESC</code>. 설명
     */
    public String getCouponDesc() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, LocalDateTime, LocalDateTime, String, Integer, String, String, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<String, String, LocalDateTime, LocalDateTime, String, Integer, String, String, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JTDrCoupon.T_DR_COUPON.COUPON_CODE;
    }

    @Override
    public Field<String> field2() {
        return JTDrCoupon.T_DR_COUPON.COUPON_TYPE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return JTDrCoupon.T_DR_COUPON.START_DATE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return JTDrCoupon.T_DR_COUPON.END_DATE;
    }

    @Override
    public Field<String> field5() {
        return JTDrCoupon.T_DR_COUPON.COUPON_NAME;
    }

    @Override
    public Field<Integer> field6() {
        return JTDrCoupon.T_DR_COUPON.COUPON_CNT;
    }

    @Override
    public Field<String> field7() {
        return JTDrCoupon.T_DR_COUPON.COUPON_STATUS;
    }

    @Override
    public Field<String> field8() {
        return JTDrCoupon.T_DR_COUPON.OPT_TYPE;
    }

    @Override
    public Field<Integer> field9() {
        return JTDrCoupon.T_DR_COUPON.OPT_VALUE;
    }

    @Override
    public Field<String> field10() {
        return JTDrCoupon.T_DR_COUPON.COUPON_DESC;
    }

    @Override
    public String component1() {
        return getCouponCode();
    }

    @Override
    public String component2() {
        return getCouponType();
    }

    @Override
    public LocalDateTime component3() {
        return getStartDate();
    }

    @Override
    public LocalDateTime component4() {
        return getEndDate();
    }

    @Override
    public String component5() {
        return getCouponName();
    }

    @Override
    public Integer component6() {
        return getCouponCnt();
    }

    @Override
    public String component7() {
        return getCouponStatus();
    }

    @Override
    public String component8() {
        return getOptType();
    }

    @Override
    public Integer component9() {
        return getOptValue();
    }

    @Override
    public String component10() {
        return getCouponDesc();
    }

    @Override
    public String value1() {
        return getCouponCode();
    }

    @Override
    public String value2() {
        return getCouponType();
    }

    @Override
    public LocalDateTime value3() {
        return getStartDate();
    }

    @Override
    public LocalDateTime value4() {
        return getEndDate();
    }

    @Override
    public String value5() {
        return getCouponName();
    }

    @Override
    public Integer value6() {
        return getCouponCnt();
    }

    @Override
    public String value7() {
        return getCouponStatus();
    }

    @Override
    public String value8() {
        return getOptType();
    }

    @Override
    public Integer value9() {
        return getOptValue();
    }

    @Override
    public String value10() {
        return getCouponDesc();
    }

    @Override
    public JTDrCouponRecord value1(String value) {
        setCouponCode(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value2(String value) {
        setCouponType(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value3(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value4(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value5(String value) {
        setCouponName(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value6(Integer value) {
        setCouponCnt(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value7(String value) {
        setCouponStatus(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value8(String value) {
        setOptType(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value9(Integer value) {
        setOptValue(value);
        return this;
    }

    @Override
    public JTDrCouponRecord value10(String value) {
        setCouponDesc(value);
        return this;
    }

    @Override
    public JTDrCouponRecord values(String value1, String value2, LocalDateTime value3, LocalDateTime value4, String value5, Integer value6, String value7, String value8, Integer value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JTDrCouponRecord
     */
    public JTDrCouponRecord() {
        super(JTDrCoupon.T_DR_COUPON);
    }

    /**
     * Create a detached, initialised JTDrCouponRecord
     */
    public JTDrCouponRecord(String couponCode, String couponType, LocalDateTime startDate, LocalDateTime endDate, String couponName, Integer couponCnt, String couponStatus, String optType, Integer optValue, String couponDesc) {
        super(JTDrCoupon.T_DR_COUPON);

        setCouponCode(couponCode);
        setCouponType(couponType);
        setStartDate(startDate);
        setEndDate(endDate);
        setCouponName(couponName);
        setCouponCnt(couponCnt);
        setCouponStatus(couponStatus);
        setOptType(optType);
        setOptValue(optValue);
        setCouponDesc(couponDesc);
    }

    /**
     * Create a detached, initialised JTDrCouponRecord
     */
    public JTDrCouponRecord(jooq.jooq_dsl.tables.pojos.JTDrCoupon value) {
        super(JTDrCoupon.T_DR_COUPON);

        if (value != null) {
            setCouponCode(value.getCouponCode());
            setCouponType(value.getCouponType());
            setStartDate(value.getStartDate());
            setEndDate(value.getEndDate());
            setCouponName(value.getCouponName());
            setCouponCnt(value.getCouponCnt());
            setCouponStatus(value.getCouponStatus());
            setOptType(value.getOptType());
            setOptValue(value.getOptValue());
            setCouponDesc(value.getCouponDesc());
        }
    }
}