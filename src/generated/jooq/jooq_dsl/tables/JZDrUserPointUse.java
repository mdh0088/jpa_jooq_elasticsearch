/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.time.LocalDateTime;

import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JZDrUserPointUseRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 포인트 사용 기록 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrUserPointUse extends TableImpl<JZDrUserPointUseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.Z_DR_USER_POINT_USE</code>
     */
    public static final JZDrUserPointUse Z_DR_USER_POINT_USE = new JZDrUserPointUse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JZDrUserPointUseRecord> getRecordType() {
        return JZDrUserPointUseRecord.class;
    }

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT_USE.IDX</code>.
     */
    public final TableField<JZDrUserPointUseRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT_USE.USER_ID</code>.
     */
    public final TableField<JZDrUserPointUseRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT_USE.ORDER_CODE</code>.
     */
    public final TableField<JZDrUserPointUseRecord, String> ORDER_CODE = createField(DSL.name("ORDER_CODE"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT_USE.ORDER_NAME</code>.
     */
    public final TableField<JZDrUserPointUseRecord, String> ORDER_NAME = createField(DSL.name("ORDER_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT_USE.POINT_NUM</code>.
     */
    public final TableField<JZDrUserPointUseRecord, Integer> POINT_NUM = createField(DSL.name("POINT_NUM"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT_USE.POINT_ACC</code>.
     * 사용자포인트누적
     */
    public final TableField<JZDrUserPointUseRecord, Integer> POINT_ACC = createField(DSL.name("POINT_ACC"), SQLDataType.INTEGER, this, "사용자포인트누적");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT_USE.USE_DATE</code>. 사용 일자
     */
    public final TableField<JZDrUserPointUseRecord, LocalDateTime> USE_DATE = createField(DSL.name("USE_DATE"), SQLDataType.LOCALDATETIME(0), this, "사용 일자");

    private JZDrUserPointUse(Name alias, Table<JZDrUserPointUseRecord> aliased) {
        this(alias, aliased, null);
    }

    private JZDrUserPointUse(Name alias, Table<JZDrUserPointUseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("포인트 사용 기록 테이블"), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_USER_POINT_USE</code> table
     * reference
     */
    public JZDrUserPointUse(String alias) {
        this(DSL.name(alias), Z_DR_USER_POINT_USE);
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_USER_POINT_USE</code> table
     * reference
     */
    public JZDrUserPointUse(Name alias) {
        this(alias, Z_DR_USER_POINT_USE);
    }

    /**
     * Create a <code>dmc_report.Z_DR_USER_POINT_USE</code> table reference
     */
    public JZDrUserPointUse() {
        this(DSL.name("Z_DR_USER_POINT_USE"), null);
    }

    public <O extends Record> JZDrUserPointUse(Table<O> child, ForeignKey<O, JZDrUserPointUseRecord> key) {
        super(child, key, Z_DR_USER_POINT_USE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public Identity<JZDrUserPointUseRecord, Integer> getIdentity() {
        return (Identity<JZDrUserPointUseRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JZDrUserPointUseRecord> getPrimaryKey() {
        return Keys.KEY_Z_DR_USER_POINT_USE_PRIMARY;
    }

    @Override
    public JZDrUserPointUse as(String alias) {
        return new JZDrUserPointUse(DSL.name(alias), this);
    }

    @Override
    public JZDrUserPointUse as(Name alias) {
        return new JZDrUserPointUse(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrUserPointUse rename(String name) {
        return new JZDrUserPointUse(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrUserPointUse rename(Name name) {
        return new JZDrUserPointUse(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, Integer, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
