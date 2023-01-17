/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.time.LocalDateTime;

import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JZDrUserPointRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 포인트 지급 기록 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrUserPoint extends TableImpl<JZDrUserPointRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.Z_DR_USER_POINT</code>
     */
    public static final JZDrUserPoint Z_DR_USER_POINT = new JZDrUserPoint();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JZDrUserPointRecord> getRecordType() {
        return JZDrUserPointRecord.class;
    }

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT.IDX</code>.
     */
    public final TableField<JZDrUserPointRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT.USER_ID</code>.
     */
    public final TableField<JZDrUserPointRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT.POINT_CODE</code>.
     */
    public final TableField<JZDrUserPointRecord, String> POINT_CODE = createField(DSL.name("POINT_CODE"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT.POINT_NAME</code>. 포인트 명
     */
    public final TableField<JZDrUserPointRecord, String> POINT_NAME = createField(DSL.name("POINT_NAME"), SQLDataType.VARCHAR(32).nullable(false), this, "포인트 명");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT.POINT_NUM</code>.
     */
    public final TableField<JZDrUserPointRecord, Integer> POINT_NUM = createField(DSL.name("POINT_NUM"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT.POINT_ACC</code>. 사용자 누적 포인트
     */
    public final TableField<JZDrUserPointRecord, Integer> POINT_ACC = createField(DSL.name("POINT_ACC"), SQLDataType.INTEGER, this, "사용자 누적 포인트");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT.REG_ID</code>. 등록자 ID
     */
    public final TableField<JZDrUserPointRecord, String> REG_ID = createField(DSL.name("REG_ID"), SQLDataType.VARCHAR(32), this, "등록자 ID");

    /**
     * The column <code>dmc_report.Z_DR_USER_POINT.REG_DATE</code>. 등록 일자
     */
    public final TableField<JZDrUserPointRecord, LocalDateTime> REG_DATE = createField(DSL.name("REG_DATE"), SQLDataType.LOCALDATETIME(0), this, "등록 일자");

    private JZDrUserPoint(Name alias, Table<JZDrUserPointRecord> aliased) {
        this(alias, aliased, null);
    }

    private JZDrUserPoint(Name alias, Table<JZDrUserPointRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("포인트 지급 기록 테이블"), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_USER_POINT</code> table reference
     */
    public JZDrUserPoint(String alias) {
        this(DSL.name(alias), Z_DR_USER_POINT);
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_USER_POINT</code> table reference
     */
    public JZDrUserPoint(Name alias) {
        this(alias, Z_DR_USER_POINT);
    }

    /**
     * Create a <code>dmc_report.Z_DR_USER_POINT</code> table reference
     */
    public JZDrUserPoint() {
        this(DSL.name("Z_DR_USER_POINT"), null);
    }

    public <O extends Record> JZDrUserPoint(Table<O> child, ForeignKey<O, JZDrUserPointRecord> key) {
        super(child, key, Z_DR_USER_POINT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public Identity<JZDrUserPointRecord, Integer> getIdentity() {
        return (Identity<JZDrUserPointRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JZDrUserPointRecord> getPrimaryKey() {
        return Keys.KEY_Z_DR_USER_POINT_PRIMARY;
    }

    @Override
    public JZDrUserPoint as(String alias) {
        return new JZDrUserPoint(DSL.name(alias), this);
    }

    @Override
    public JZDrUserPoint as(Name alias) {
        return new JZDrUserPoint(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrUserPoint rename(String name) {
        return new JZDrUserPoint(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrUserPoint rename(Name name) {
        return new JZDrUserPoint(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, String, Integer, Integer, String, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
