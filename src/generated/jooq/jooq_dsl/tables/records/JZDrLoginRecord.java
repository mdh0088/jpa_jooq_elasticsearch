/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.jooq_dsl.tables.JZDrLogin;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 로그인 이력 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrLoginRecord extends UpdatableRecordImpl<JZDrLoginRecord> implements Record6<Integer, String, String, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.Z_DR_LOGIN.ID</code>.
     */
    public JZDrLoginRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_LOGIN.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_LOGIN.USER_ID</code>.
     */
    public JZDrLoginRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_LOGIN.USER_ID</code>.
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_LOGIN.KEY_CODE</code>.
     */
    public JZDrLoginRecord setKeyCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_LOGIN.KEY_CODE</code>.
     */
    public String getKeyCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_LOGIN.LOGIN_DATE</code>.
     */
    public JZDrLoginRecord setLoginDate(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_LOGIN.LOGIN_DATE</code>.
     */
    public LocalDateTime getLoginDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_LOGIN.IP</code>.
     */
    public JZDrLoginRecord setIp(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_LOGIN.IP</code>.
     */
    public String getIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dmc_report.Z_DR_LOGIN.MAC</code>.
     */
    public JZDrLoginRecord setMac(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_LOGIN.MAC</code>.
     */
    public String getMac() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, LocalDateTime, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JZDrLogin.Z_DR_LOGIN.ID;
    }

    @Override
    public Field<String> field2() {
        return JZDrLogin.Z_DR_LOGIN.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return JZDrLogin.Z_DR_LOGIN.KEY_CODE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return JZDrLogin.Z_DR_LOGIN.LOGIN_DATE;
    }

    @Override
    public Field<String> field5() {
        return JZDrLogin.Z_DR_LOGIN.IP;
    }

    @Override
    public Field<String> field6() {
        return JZDrLogin.Z_DR_LOGIN.MAC;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getKeyCode();
    }

    @Override
    public LocalDateTime component4() {
        return getLoginDate();
    }

    @Override
    public String component5() {
        return getIp();
    }

    @Override
    public String component6() {
        return getMac();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getKeyCode();
    }

    @Override
    public LocalDateTime value4() {
        return getLoginDate();
    }

    @Override
    public String value5() {
        return getIp();
    }

    @Override
    public String value6() {
        return getMac();
    }

    @Override
    public JZDrLoginRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public JZDrLoginRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public JZDrLoginRecord value3(String value) {
        setKeyCode(value);
        return this;
    }

    @Override
    public JZDrLoginRecord value4(LocalDateTime value) {
        setLoginDate(value);
        return this;
    }

    @Override
    public JZDrLoginRecord value5(String value) {
        setIp(value);
        return this;
    }

    @Override
    public JZDrLoginRecord value6(String value) {
        setMac(value);
        return this;
    }

    @Override
    public JZDrLoginRecord values(Integer value1, String value2, String value3, LocalDateTime value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JZDrLoginRecord
     */
    public JZDrLoginRecord() {
        super(JZDrLogin.Z_DR_LOGIN);
    }

    /**
     * Create a detached, initialised JZDrLoginRecord
     */
    public JZDrLoginRecord(Integer id, String userId, String keyCode, LocalDateTime loginDate, String ip, String mac) {
        super(JZDrLogin.Z_DR_LOGIN);

        setId(id);
        setUserId(userId);
        setKeyCode(keyCode);
        setLoginDate(loginDate);
        setIp(ip);
        setMac(mac);
    }

    /**
     * Create a detached, initialised JZDrLoginRecord
     */
    public JZDrLoginRecord(jooq.jooq_dsl.tables.pojos.JZDrLogin value) {
        super(JZDrLogin.Z_DR_LOGIN);

        if (value != null) {
            setId(value.getId());
            setUserId(value.getUserId());
            setKeyCode(value.getKeyCode());
            setLoginDate(value.getLoginDate());
            setIp(value.getIp());
            setMac(value.getMac());
        }
    }
}
