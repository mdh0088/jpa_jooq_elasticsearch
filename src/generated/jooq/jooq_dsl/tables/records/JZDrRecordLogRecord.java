/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.jooq_dsl.tables.JZDrRecordLog;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrRecordLogRecord extends UpdatableRecordImpl<JZDrRecordLogRecord> implements Record9<Integer, String, String, String, String, String, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.Z_DR_RECORD_LOG.IDX</code>. 번호
     */
    public JZDrRecordLogRecord setIdx(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_RECORD_LOG.IDX</code>. 번호
     */
    public Integer getIdx() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_RECORD_LOG.USER_ID</code>. 사용자ID
     */
    public JZDrRecordLogRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_RECORD_LOG.USER_ID</code>. 사용자ID
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_RECORD_LOG.RECORD_PATH</code>. 기록내용
     */
    public JZDrRecordLogRecord setRecordPath(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_RECORD_LOG.RECORD_PATH</code>. 기록내용
     */
    public String getRecordPath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_RECORD_LOG.RECORD_CODE</code>. 기록타입코드
     */
    public JZDrRecordLogRecord setRecordCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_RECORD_LOG.RECORD_CODE</code>. 기록타입코드
     */
    public String getRecordCode() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>dmc_report.Z_DR_RECORD_LOG.RECORD_OCCURRENCE_VALUES</code>. 기록 발생된
     * 코드값
     */
    public JZDrRecordLogRecord setRecordOccurrenceValues(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>dmc_report.Z_DR_RECORD_LOG.RECORD_OCCURRENCE_VALUES</code>. 기록 발생된
     * 코드값
     */
    public String getRecordOccurrenceValues() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_RECORD_LOG.CONNECTION_IP</code>. 접속IP
     */
    public JZDrRecordLogRecord setConnectionIp(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_RECORD_LOG.CONNECTION_IP</code>. 접속IP
     */
    public String getConnectionIp() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_RECORD_LOG.USE_BROWSER</code>. 접속 브라우저
     */
    public JZDrRecordLogRecord setUseBrowser(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_RECORD_LOG.USE_BROWSER</code>. 접속 브라우저
     */
    public String getUseBrowser() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_RECORD_LOG.EXECUTABLE_QUERY</code>.
     * 사용된쿼리
     */
    public JZDrRecordLogRecord setExecutableQuery(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_RECORD_LOG.EXECUTABLE_QUERY</code>.
     * 사용된쿼리
     */
    public String getExecutableQuery() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_RECORD_LOG.REGIST_DATETIME</code>. 등록일
     */
    public JZDrRecordLogRecord setRegistDatetime(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_RECORD_LOG.REGIST_DATETIME</code>. 등록일
     */
    public LocalDateTime getRegistDatetime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String, String, String, String, String, String, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.IDX;
    }

    @Override
    public Field<String> field2() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.RECORD_PATH;
    }

    @Override
    public Field<String> field4() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.RECORD_CODE;
    }

    @Override
    public Field<String> field5() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.RECORD_OCCURRENCE_VALUES;
    }

    @Override
    public Field<String> field6() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.CONNECTION_IP;
    }

    @Override
    public Field<String> field7() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.USE_BROWSER;
    }

    @Override
    public Field<String> field8() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.EXECUTABLE_QUERY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return JZDrRecordLog.Z_DR_RECORD_LOG.REGIST_DATETIME;
    }

    @Override
    public Integer component1() {
        return getIdx();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getRecordPath();
    }

    @Override
    public String component4() {
        return getRecordCode();
    }

    @Override
    public String component5() {
        return getRecordOccurrenceValues();
    }

    @Override
    public String component6() {
        return getConnectionIp();
    }

    @Override
    public String component7() {
        return getUseBrowser();
    }

    @Override
    public String component8() {
        return getExecutableQuery();
    }

    @Override
    public LocalDateTime component9() {
        return getRegistDatetime();
    }

    @Override
    public Integer value1() {
        return getIdx();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getRecordPath();
    }

    @Override
    public String value4() {
        return getRecordCode();
    }

    @Override
    public String value5() {
        return getRecordOccurrenceValues();
    }

    @Override
    public String value6() {
        return getConnectionIp();
    }

    @Override
    public String value7() {
        return getUseBrowser();
    }

    @Override
    public String value8() {
        return getExecutableQuery();
    }

    @Override
    public LocalDateTime value9() {
        return getRegistDatetime();
    }

    @Override
    public JZDrRecordLogRecord value1(Integer value) {
        setIdx(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord value3(String value) {
        setRecordPath(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord value4(String value) {
        setRecordCode(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord value5(String value) {
        setRecordOccurrenceValues(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord value6(String value) {
        setConnectionIp(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord value7(String value) {
        setUseBrowser(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord value8(String value) {
        setExecutableQuery(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord value9(LocalDateTime value) {
        setRegistDatetime(value);
        return this;
    }

    @Override
    public JZDrRecordLogRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, LocalDateTime value9) {
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
     * Create a detached JZDrRecordLogRecord
     */
    public JZDrRecordLogRecord() {
        super(JZDrRecordLog.Z_DR_RECORD_LOG);
    }

    /**
     * Create a detached, initialised JZDrRecordLogRecord
     */
    public JZDrRecordLogRecord(Integer idx, String userId, String recordPath, String recordCode, String recordOccurrenceValues, String connectionIp, String useBrowser, String executableQuery, LocalDateTime registDatetime) {
        super(JZDrRecordLog.Z_DR_RECORD_LOG);

        setIdx(idx);
        setUserId(userId);
        setRecordPath(recordPath);
        setRecordCode(recordCode);
        setRecordOccurrenceValues(recordOccurrenceValues);
        setConnectionIp(connectionIp);
        setUseBrowser(useBrowser);
        setExecutableQuery(executableQuery);
        setRegistDatetime(registDatetime);
    }

    /**
     * Create a detached, initialised JZDrRecordLogRecord
     */
    public JZDrRecordLogRecord(jooq.jooq_dsl.tables.pojos.JZDrRecordLog value) {
        super(JZDrRecordLog.Z_DR_RECORD_LOG);

        if (value != null) {
            setIdx(value.getIdx());
            setUserId(value.getUserId());
            setRecordPath(value.getRecordPath());
            setRecordCode(value.getRecordCode());
            setRecordOccurrenceValues(value.getRecordOccurrenceValues());
            setConnectionIp(value.getConnectionIp());
            setUseBrowser(value.getUseBrowser());
            setExecutableQuery(value.getExecutableQuery());
            setRegistDatetime(value.getRegistDatetime());
        }
    }
}