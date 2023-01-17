/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import jooq.jooq_dsl.tables.JTDrOrderer;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrOrdererRecord extends UpdatableRecordImpl<JTDrOrdererRecord> implements Record18<Integer, String, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.IDX</code>.
     */
    public JTDrOrdererRecord setIdx(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.IDX</code>.
     */
    public Integer getIdx() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.ORDER_CODE</code>. 주문코드
     */
    public JTDrOrdererRecord setOrderCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.ORDER_CODE</code>. 주문코드
     */
    public String getOrderCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.NAME</code>. 주문자명
     */
    public JTDrOrdererRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.NAME</code>. 주문자명
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.COMPANY</code>. 회사명
     */
    public JTDrOrdererRecord setCompany(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.COMPANY</code>. 회사명
     */
    public String getCompany() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.DEPARTMENT</code>. 소속부서
     */
    public JTDrOrdererRecord setDepartment(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.DEPARTMENT</code>. 소속부서
     */
    public String getDepartment() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.LEVEL</code>. 직급
     */
    public JTDrOrdererRecord setLevel(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.LEVEL</code>. 직급
     */
    public String getLevel() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.EMAIL</code>. 이메일
     */
    public JTDrOrdererRecord setEmail(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.EMAIL</code>. 이메일
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.COMPANY_CATEGORY</code>. 기업분류
     */
    public JTDrOrdererRecord setCompanyCategory(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.COMPANY_CATEGORY</code>. 기업분류
     */
    public String getCompanyCategory() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.PHONE</code>. 전화번호
     */
    public JTDrOrdererRecord setPhone(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.PHONE</code>. 전화번호
     */
    public String getPhone() {
        return (String) get(8);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.MOBILE</code>. 휴대전화번호
     */
    public JTDrOrdererRecord setMobile(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.MOBILE</code>. 휴대전화번호
     */
    public String getMobile() {
        return (String) get(9);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.RECOGNIZE_CODE</code>. 구매인지경로 코드
     */
    public JTDrOrdererRecord setRecognizeCode(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.RECOGNIZE_CODE</code>. 구매인지경로 코드
     */
    public String getRecognizeCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.RECEIPT_NAME</code>. 배송자명
     */
    public JTDrOrdererRecord setReceiptName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.RECEIPT_NAME</code>. 배송자명
     */
    public String getReceiptName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR_NAME</code>. 배송지명
     */
    public JTDrOrdererRecord setReceiptAddrName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR_NAME</code>. 배송지명
     */
    public String getReceiptAddrName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR_NUM</code>. 우편번호
     */
    public JTDrOrdererRecord setReceiptAddrNum(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR_NUM</code>. 우편번호
     */
    public Integer getReceiptAddrNum() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR1</code>. 배송지 주소
     */
    public JTDrOrdererRecord setReceiptAddr1(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR1</code>. 배송지 주소
     */
    public String getReceiptAddr1() {
        return (String) get(14);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR2</code>. 배송지 상세주소
     */
    public JTDrOrdererRecord setReceiptAddr2(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR2</code>. 배송지 상세주소
     */
    public String getReceiptAddr2() {
        return (String) get(15);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.RECEIPT_PHONE_NUM</code>. 전화번호
     */
    public JTDrOrdererRecord setReceiptPhoneNum(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.RECEIPT_PHONE_NUM</code>. 전화번호
     */
    public String getReceiptPhoneNum() {
        return (String) get(16);
    }

    /**
     * Setter for <code>dmc_report.T_DR_ORDERER.RECEIPT_MEMO</code>. 배송 메모
     */
    public JTDrOrdererRecord setReceiptMemo(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ORDERER.RECEIPT_MEMO</code>. 배송 메모
     */
    public String getReceiptMemo() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, String, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Integer, String, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JTDrOrderer.T_DR_ORDERER.IDX;
    }

    @Override
    public Field<String> field2() {
        return JTDrOrderer.T_DR_ORDERER.ORDER_CODE;
    }

    @Override
    public Field<String> field3() {
        return JTDrOrderer.T_DR_ORDERER.NAME;
    }

    @Override
    public Field<String> field4() {
        return JTDrOrderer.T_DR_ORDERER.COMPANY;
    }

    @Override
    public Field<String> field5() {
        return JTDrOrderer.T_DR_ORDERER.DEPARTMENT;
    }

    @Override
    public Field<String> field6() {
        return JTDrOrderer.T_DR_ORDERER.LEVEL;
    }

    @Override
    public Field<String> field7() {
        return JTDrOrderer.T_DR_ORDERER.EMAIL;
    }

    @Override
    public Field<String> field8() {
        return JTDrOrderer.T_DR_ORDERER.COMPANY_CATEGORY;
    }

    @Override
    public Field<String> field9() {
        return JTDrOrderer.T_DR_ORDERER.PHONE;
    }

    @Override
    public Field<String> field10() {
        return JTDrOrderer.T_DR_ORDERER.MOBILE;
    }

    @Override
    public Field<String> field11() {
        return JTDrOrderer.T_DR_ORDERER.RECOGNIZE_CODE;
    }

    @Override
    public Field<String> field12() {
        return JTDrOrderer.T_DR_ORDERER.RECEIPT_NAME;
    }

    @Override
    public Field<String> field13() {
        return JTDrOrderer.T_DR_ORDERER.RECEIPT_ADDR_NAME;
    }

    @Override
    public Field<Integer> field14() {
        return JTDrOrderer.T_DR_ORDERER.RECEIPT_ADDR_NUM;
    }

    @Override
    public Field<String> field15() {
        return JTDrOrderer.T_DR_ORDERER.RECEIPT_ADDR1;
    }

    @Override
    public Field<String> field16() {
        return JTDrOrderer.T_DR_ORDERER.RECEIPT_ADDR2;
    }

    @Override
    public Field<String> field17() {
        return JTDrOrderer.T_DR_ORDERER.RECEIPT_PHONE_NUM;
    }

    @Override
    public Field<String> field18() {
        return JTDrOrderer.T_DR_ORDERER.RECEIPT_MEMO;
    }

    @Override
    public Integer component1() {
        return getIdx();
    }

    @Override
    public String component2() {
        return getOrderCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getCompany();
    }

    @Override
    public String component5() {
        return getDepartment();
    }

    @Override
    public String component6() {
        return getLevel();
    }

    @Override
    public String component7() {
        return getEmail();
    }

    @Override
    public String component8() {
        return getCompanyCategory();
    }

    @Override
    public String component9() {
        return getPhone();
    }

    @Override
    public String component10() {
        return getMobile();
    }

    @Override
    public String component11() {
        return getRecognizeCode();
    }

    @Override
    public String component12() {
        return getReceiptName();
    }

    @Override
    public String component13() {
        return getReceiptAddrName();
    }

    @Override
    public Integer component14() {
        return getReceiptAddrNum();
    }

    @Override
    public String component15() {
        return getReceiptAddr1();
    }

    @Override
    public String component16() {
        return getReceiptAddr2();
    }

    @Override
    public String component17() {
        return getReceiptPhoneNum();
    }

    @Override
    public String component18() {
        return getReceiptMemo();
    }

    @Override
    public Integer value1() {
        return getIdx();
    }

    @Override
    public String value2() {
        return getOrderCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getCompany();
    }

    @Override
    public String value5() {
        return getDepartment();
    }

    @Override
    public String value6() {
        return getLevel();
    }

    @Override
    public String value7() {
        return getEmail();
    }

    @Override
    public String value8() {
        return getCompanyCategory();
    }

    @Override
    public String value9() {
        return getPhone();
    }

    @Override
    public String value10() {
        return getMobile();
    }

    @Override
    public String value11() {
        return getRecognizeCode();
    }

    @Override
    public String value12() {
        return getReceiptName();
    }

    @Override
    public String value13() {
        return getReceiptAddrName();
    }

    @Override
    public Integer value14() {
        return getReceiptAddrNum();
    }

    @Override
    public String value15() {
        return getReceiptAddr1();
    }

    @Override
    public String value16() {
        return getReceiptAddr2();
    }

    @Override
    public String value17() {
        return getReceiptPhoneNum();
    }

    @Override
    public String value18() {
        return getReceiptMemo();
    }

    @Override
    public JTDrOrdererRecord value1(Integer value) {
        setIdx(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value2(String value) {
        setOrderCode(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value4(String value) {
        setCompany(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value5(String value) {
        setDepartment(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value6(String value) {
        setLevel(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value7(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value8(String value) {
        setCompanyCategory(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value9(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value10(String value) {
        setMobile(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value11(String value) {
        setRecognizeCode(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value12(String value) {
        setReceiptName(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value13(String value) {
        setReceiptAddrName(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value14(Integer value) {
        setReceiptAddrNum(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value15(String value) {
        setReceiptAddr1(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value16(String value) {
        setReceiptAddr2(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value17(String value) {
        setReceiptPhoneNum(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord value18(String value) {
        setReceiptMemo(value);
        return this;
    }

    @Override
    public JTDrOrdererRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, Integer value14, String value15, String value16, String value17, String value18) {
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
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JTDrOrdererRecord
     */
    public JTDrOrdererRecord() {
        super(JTDrOrderer.T_DR_ORDERER);
    }

    /**
     * Create a detached, initialised JTDrOrdererRecord
     */
    public JTDrOrdererRecord(Integer idx, String orderCode, String name, String company, String department, String level, String email, String companyCategory, String phone, String mobile, String recognizeCode, String receiptName, String receiptAddrName, Integer receiptAddrNum, String receiptAddr1, String receiptAddr2, String receiptPhoneNum, String receiptMemo) {
        super(JTDrOrderer.T_DR_ORDERER);

        setIdx(idx);
        setOrderCode(orderCode);
        setName(name);
        setCompany(company);
        setDepartment(department);
        setLevel(level);
        setEmail(email);
        setCompanyCategory(companyCategory);
        setPhone(phone);
        setMobile(mobile);
        setRecognizeCode(recognizeCode);
        setReceiptName(receiptName);
        setReceiptAddrName(receiptAddrName);
        setReceiptAddrNum(receiptAddrNum);
        setReceiptAddr1(receiptAddr1);
        setReceiptAddr2(receiptAddr2);
        setReceiptPhoneNum(receiptPhoneNum);
        setReceiptMemo(receiptMemo);
    }

    /**
     * Create a detached, initialised JTDrOrdererRecord
     */
    public JTDrOrdererRecord(jooq.jooq_dsl.tables.pojos.JTDrOrderer value) {
        super(JTDrOrderer.T_DR_ORDERER);

        if (value != null) {
            setIdx(value.getIdx());
            setOrderCode(value.getOrderCode());
            setName(value.getName());
            setCompany(value.getCompany());
            setDepartment(value.getDepartment());
            setLevel(value.getLevel());
            setEmail(value.getEmail());
            setCompanyCategory(value.getCompanyCategory());
            setPhone(value.getPhone());
            setMobile(value.getMobile());
            setRecognizeCode(value.getRecognizeCode());
            setReceiptName(value.getReceiptName());
            setReceiptAddrName(value.getReceiptAddrName());
            setReceiptAddrNum(value.getReceiptAddrNum());
            setReceiptAddr1(value.getReceiptAddr1());
            setReceiptAddr2(value.getReceiptAddr2());
            setReceiptPhoneNum(value.getReceiptPhoneNum());
            setReceiptMemo(value.getReceiptMemo());
        }
    }
}