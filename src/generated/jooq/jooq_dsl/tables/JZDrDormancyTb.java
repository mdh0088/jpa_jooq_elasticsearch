/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.time.LocalDateTime;

import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JZDrDormancyTbRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 휴면계정관리 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrDormancyTb extends TableImpl<JZDrDormancyTbRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.Z_DR_DORMANCY_TB</code>
     */
    public static final JZDrDormancyTb Z_DR_DORMANCY_TB = new JZDrDormancyTb();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JZDrDormancyTbRecord> getRecordType() {
        return JZDrDormancyTbRecord.class;
    }

    /**
     * The column <code>dmc_report.Z_DR_DORMANCY_TB.USER_ID</code>.
     */
    public final TableField<JZDrDormancyTbRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>dmc_report.Z_DR_DORMANCY_TB.REGIST_DATE</code>. 휴면계정 등록일
     */
    public final TableField<JZDrDormancyTbRecord, LocalDateTime> REGIST_DATE = createField(DSL.name("REGIST_DATE"), SQLDataType.LOCALDATETIME(0), this, "휴면계정 등록일");

    /**
     * The column <code>dmc_report.Z_DR_DORMANCY_TB.UPDATE_DATE</code>. 휴면계정 해제일
     */
    public final TableField<JZDrDormancyTbRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("UPDATE_DATE"), SQLDataType.LOCALDATETIME(0), this, "휴면계정 해제일");

    private JZDrDormancyTb(Name alias, Table<JZDrDormancyTbRecord> aliased) {
        this(alias, aliased, null);
    }

    private JZDrDormancyTb(Name alias, Table<JZDrDormancyTbRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("휴면계정관리 테이블"), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_DORMANCY_TB</code> table
     * reference
     */
    public JZDrDormancyTb(String alias) {
        this(DSL.name(alias), Z_DR_DORMANCY_TB);
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_DORMANCY_TB</code> table
     * reference
     */
    public JZDrDormancyTb(Name alias) {
        this(alias, Z_DR_DORMANCY_TB);
    }

    /**
     * Create a <code>dmc_report.Z_DR_DORMANCY_TB</code> table reference
     */
    public JZDrDormancyTb() {
        this(DSL.name("Z_DR_DORMANCY_TB"), null);
    }

    public <O extends Record> JZDrDormancyTb(Table<O> child, ForeignKey<O, JZDrDormancyTbRecord> key) {
        super(child, key, Z_DR_DORMANCY_TB);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public UniqueKey<JZDrDormancyTbRecord> getPrimaryKey() {
        return Keys.KEY_Z_DR_DORMANCY_TB_PRIMARY;
    }

    @Override
    public JZDrDormancyTb as(String alias) {
        return new JZDrDormancyTb(DSL.name(alias), this);
    }

    @Override
    public JZDrDormancyTb as(Name alias) {
        return new JZDrDormancyTb(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrDormancyTb rename(String name) {
        return new JZDrDormancyTb(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrDormancyTb rename(Name name) {
        return new JZDrDormancyTb(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
