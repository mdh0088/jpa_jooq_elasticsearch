/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.jooq_dsl.tables.JTDrQna;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 상담 게시판
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrQnaRecord extends UpdatableRecordImpl<JTDrQnaRecord> implements Record14<Integer, Integer, String, String, LocalDateTime, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.T_DR_QNA.ID</code>.
     */
    public JTDrQnaRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.CONN_ID</code>. 연결된 게시물 ID (원본은 0)
     */
    public JTDrQnaRecord setConnId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.CONN_ID</code>. 연결된 게시물 ID (원본은 0)
     */
    public Integer getConnId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.TITLE</code>.
     */
    public JTDrQnaRecord setTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.TITLE</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.REG_USER</code>.
     */
    public JTDrQnaRecord setRegUser(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.REG_USER</code>.
     */
    public String getRegUser() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.REG_DATE</code>.
     */
    public JTDrQnaRecord setRegDate(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.REG_DATE</code>.
     */
    public LocalDateTime getRegDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.REG_AUTH</code>. 등록자  권한 (A:관리자
     * U:유저)
     */
    public JTDrQnaRecord setRegAuth(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.REG_AUTH</code>. 등록자  권한 (A:관리자
     * U:유저)
     */
    public String getRegAuth() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.CHECK_YN</code>. 사용자 확인여부
     */
    public JTDrQnaRecord setCheckYn(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.CHECK_YN</code>. 사용자 확인여부
     */
    public String getCheckYn() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.TYPE_CODE</code>.
     */
    public JTDrQnaRecord setTypeCode(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.TYPE_CODE</code>.
     */
    public String getTypeCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.CONTENTS</code>. 내용
     */
    public JTDrQnaRecord setContents(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.CONTENTS</code>. 내용
     */
    public String getContents() {
        return (String) get(8);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.FILE_ORIGINALNAME</code>. 파일원본이름
     */
    public JTDrQnaRecord setFileOriginalname(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.FILE_ORIGINALNAME</code>. 파일원본이름
     */
    public String getFileOriginalname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.FILE_NAME</code>. 파일이름
     */
    public JTDrQnaRecord setFileName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.FILE_NAME</code>. 파일이름
     */
    public String getFileName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.FILE_PATH</code>. 파일경로
     */
    public JTDrQnaRecord setFilePath(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.FILE_PATH</code>. 파일경로
     */
    public String getFilePath() {
        return (String) get(11);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.FILE_URL</code>. 파일주소
     */
    public JTDrQnaRecord setFileUrl(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.FILE_URL</code>. 파일주소
     */
    public String getFileUrl() {
        return (String) get(12);
    }

    /**
     * Setter for <code>dmc_report.T_DR_QNA.PANNEL_TEMP_KEY</code>.
     */
    public JTDrQnaRecord setPannelTempKey(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.T_DR_QNA.PANNEL_TEMP_KEY</code>.
     */
    public String getPannelTempKey() {
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
    public Row14<Integer, Integer, String, String, LocalDateTime, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Integer, Integer, String, String, LocalDateTime, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JTDrQna.T_DR_QNA.ID;
    }

    @Override
    public Field<Integer> field2() {
        return JTDrQna.T_DR_QNA.CONN_ID;
    }

    @Override
    public Field<String> field3() {
        return JTDrQna.T_DR_QNA.TITLE;
    }

    @Override
    public Field<String> field4() {
        return JTDrQna.T_DR_QNA.REG_USER;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return JTDrQna.T_DR_QNA.REG_DATE;
    }

    @Override
    public Field<String> field6() {
        return JTDrQna.T_DR_QNA.REG_AUTH;
    }

    @Override
    public Field<String> field7() {
        return JTDrQna.T_DR_QNA.CHECK_YN;
    }

    @Override
    public Field<String> field8() {
        return JTDrQna.T_DR_QNA.TYPE_CODE;
    }

    @Override
    public Field<String> field9() {
        return JTDrQna.T_DR_QNA.CONTENTS;
    }

    @Override
    public Field<String> field10() {
        return JTDrQna.T_DR_QNA.FILE_ORIGINALNAME;
    }

    @Override
    public Field<String> field11() {
        return JTDrQna.T_DR_QNA.FILE_NAME;
    }

    @Override
    public Field<String> field12() {
        return JTDrQna.T_DR_QNA.FILE_PATH;
    }

    @Override
    public Field<String> field13() {
        return JTDrQna.T_DR_QNA.FILE_URL;
    }

    @Override
    public Field<String> field14() {
        return JTDrQna.T_DR_QNA.PANNEL_TEMP_KEY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getConnId();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public String component4() {
        return getRegUser();
    }

    @Override
    public LocalDateTime component5() {
        return getRegDate();
    }

    @Override
    public String component6() {
        return getRegAuth();
    }

    @Override
    public String component7() {
        return getCheckYn();
    }

    @Override
    public String component8() {
        return getTypeCode();
    }

    @Override
    public String component9() {
        return getContents();
    }

    @Override
    public String component10() {
        return getFileOriginalname();
    }

    @Override
    public String component11() {
        return getFileName();
    }

    @Override
    public String component12() {
        return getFilePath();
    }

    @Override
    public String component13() {
        return getFileUrl();
    }

    @Override
    public String component14() {
        return getPannelTempKey();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getConnId();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public String value4() {
        return getRegUser();
    }

    @Override
    public LocalDateTime value5() {
        return getRegDate();
    }

    @Override
    public String value6() {
        return getRegAuth();
    }

    @Override
    public String value7() {
        return getCheckYn();
    }

    @Override
    public String value8() {
        return getTypeCode();
    }

    @Override
    public String value9() {
        return getContents();
    }

    @Override
    public String value10() {
        return getFileOriginalname();
    }

    @Override
    public String value11() {
        return getFileName();
    }

    @Override
    public String value12() {
        return getFilePath();
    }

    @Override
    public String value13() {
        return getFileUrl();
    }

    @Override
    public String value14() {
        return getPannelTempKey();
    }

    @Override
    public JTDrQnaRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value2(Integer value) {
        setConnId(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value4(String value) {
        setRegUser(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value5(LocalDateTime value) {
        setRegDate(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value6(String value) {
        setRegAuth(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value7(String value) {
        setCheckYn(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value8(String value) {
        setTypeCode(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value9(String value) {
        setContents(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value10(String value) {
        setFileOriginalname(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value11(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value12(String value) {
        setFilePath(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value13(String value) {
        setFileUrl(value);
        return this;
    }

    @Override
    public JTDrQnaRecord value14(String value) {
        setPannelTempKey(value);
        return this;
    }

    @Override
    public JTDrQnaRecord values(Integer value1, Integer value2, String value3, String value4, LocalDateTime value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14) {
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
     * Create a detached JTDrQnaRecord
     */
    public JTDrQnaRecord() {
        super(JTDrQna.T_DR_QNA);
    }

    /**
     * Create a detached, initialised JTDrQnaRecord
     */
    public JTDrQnaRecord(Integer id, Integer connId, String title, String regUser, LocalDateTime regDate, String regAuth, String checkYn, String typeCode, String contents, String fileOriginalname, String fileName, String filePath, String fileUrl, String pannelTempKey) {
        super(JTDrQna.T_DR_QNA);

        setId(id);
        setConnId(connId);
        setTitle(title);
        setRegUser(regUser);
        setRegDate(regDate);
        setRegAuth(regAuth);
        setCheckYn(checkYn);
        setTypeCode(typeCode);
        setContents(contents);
        setFileOriginalname(fileOriginalname);
        setFileName(fileName);
        setFilePath(filePath);
        setFileUrl(fileUrl);
        setPannelTempKey(pannelTempKey);
    }

    /**
     * Create a detached, initialised JTDrQnaRecord
     */
    public JTDrQnaRecord(jooq.jooq_dsl.tables.pojos.JTDrQna value) {
        super(JTDrQna.T_DR_QNA);

        if (value != null) {
            setId(value.getId());
            setConnId(value.getConnId());
            setTitle(value.getTitle());
            setRegUser(value.getRegUser());
            setRegDate(value.getRegDate());
            setRegAuth(value.getRegAuth());
            setCheckYn(value.getCheckYn());
            setTypeCode(value.getTypeCode());
            setContents(value.getContents());
            setFileOriginalname(value.getFileOriginalname());
            setFileName(value.getFileName());
            setFilePath(value.getFilePath());
            setFileUrl(value.getFileUrl());
            setPannelTempKey(value.getPannelTempKey());
        }
    }
}
