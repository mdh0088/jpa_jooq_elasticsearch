/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.time.LocalDateTime;

import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JZDrAuthExpiryLogRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrAuthExpiryLog extends TableImpl<JZDrAuthExpiryLogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG</code>
     */
    public static final JZDrAuthExpiryLog Z_DR_AUTH_EXPIRY_LOG = new JZDrAuthExpiryLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JZDrAuthExpiryLogRecord> getRecordType() {
        return JZDrAuthExpiryLogRecord.class;
    }

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.IDX</code>.
     */
    public final TableField<JZDrAuthExpiryLogRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.USER_ID</code>. 사용자 ID
     */
    public final TableField<JZDrAuthExpiryLogRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(100), this, "사용자 ID");

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.ORDER_CODE</code>. 주문코드
     */
    public final TableField<JZDrAuthExpiryLogRecord, String> ORDER_CODE = createField(DSL.name("ORDER_CODE"), SQLDataType.VARCHAR(32), this, "주문코드");

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.P_CODE</code>. 상품코드
     */
    public final TableField<JZDrAuthExpiryLogRecord, String> P_CODE = createField(DSL.name("P_CODE"), SQLDataType.VARCHAR(16), this, "상품코드");

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.START_DATE</code>. 시작일
     */
    public final TableField<JZDrAuthExpiryLogRecord, LocalDateTime> START_DATE = createField(DSL.name("START_DATE"), SQLDataType.LOCALDATETIME(0), this, "시작일");

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.END_DATE</code>. 종료일
     */
    public final TableField<JZDrAuthExpiryLogRecord, LocalDateTime> END_DATE = createField(DSL.name("END_DATE"), SQLDataType.LOCALDATETIME(0), this, "종료일");

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.EXPIRY_CODE</code>.
     * 만료적용유형
     */
    public final TableField<JZDrAuthExpiryLogRecord, String> EXPIRY_CODE = createField(DSL.name("EXPIRY_CODE"), SQLDataType.VARCHAR(45), this, "만료적용유형");

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.EXPIRY_MEMO</code>.
     * 만료적용내용
     */
    public final TableField<JZDrAuthExpiryLogRecord, String> EXPIRY_MEMO = createField(DSL.name("EXPIRY_MEMO"), SQLDataType.VARCHAR(200), this, "만료적용내용");

    /**
     * The column <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG.REG_DATE</code>. 저장된시간
     */
    public final TableField<JZDrAuthExpiryLogRecord, LocalDateTime> REG_DATE = createField(DSL.name("REG_DATE"), SQLDataType.LOCALDATETIME(0), this, "저장된시간");

    private JZDrAuthExpiryLog(Name alias, Table<JZDrAuthExpiryLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private JZDrAuthExpiryLog(Name alias, Table<JZDrAuthExpiryLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG</code> table
     * reference
     */
    public JZDrAuthExpiryLog(String alias) {
        this(DSL.name(alias), Z_DR_AUTH_EXPIRY_LOG);
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG</code> table
     * reference
     */
    public JZDrAuthExpiryLog(Name alias) {
        this(alias, Z_DR_AUTH_EXPIRY_LOG);
    }

    /**
     * Create a <code>dmc_report.Z_DR_AUTH_EXPIRY_LOG</code> table reference
     */
    public JZDrAuthExpiryLog() {
        this(DSL.name("Z_DR_AUTH_EXPIRY_LOG"), null);
    }

    public <O extends Record> JZDrAuthExpiryLog(Table<O> child, ForeignKey<O, JZDrAuthExpiryLogRecord> key) {
        super(child, key, Z_DR_AUTH_EXPIRY_LOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public Identity<JZDrAuthExpiryLogRecord, Integer> getIdentity() {
        return (Identity<JZDrAuthExpiryLogRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JZDrAuthExpiryLogRecord> getPrimaryKey() {
        return Keys.KEY_Z_DR_AUTH_EXPIRY_LOG_PRIMARY;
    }

    @Override
    public JZDrAuthExpiryLog as(String alias) {
        return new JZDrAuthExpiryLog(DSL.name(alias), this);
    }

    @Override
    public JZDrAuthExpiryLog as(Name alias) {
        return new JZDrAuthExpiryLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrAuthExpiryLog rename(String name) {
        return new JZDrAuthExpiryLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrAuthExpiryLog rename(Name name) {
        return new JZDrAuthExpiryLog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, LocalDateTime, LocalDateTime, String, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
