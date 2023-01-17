/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import jooq.jooq_dsl.Indexes;
import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JZDrLoginRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 로그인 이력 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrLogin extends TableImpl<JZDrLoginRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.Z_DR_LOGIN</code>
     */
    public static final JZDrLogin Z_DR_LOGIN = new JZDrLogin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JZDrLoginRecord> getRecordType() {
        return JZDrLoginRecord.class;
    }

    /**
     * The column <code>dmc_report.Z_DR_LOGIN.ID</code>.
     */
    public final TableField<JZDrLoginRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.Z_DR_LOGIN.USER_ID</code>.
     */
    public final TableField<JZDrLoginRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>dmc_report.Z_DR_LOGIN.KEY_CODE</code>.
     */
    public final TableField<JZDrLoginRecord, String> KEY_CODE = createField(DSL.name("KEY_CODE"), SQLDataType.VARCHAR(37), this, "");

    /**
     * The column <code>dmc_report.Z_DR_LOGIN.LOGIN_DATE</code>.
     */
    public final TableField<JZDrLoginRecord, LocalDateTime> LOGIN_DATE = createField(DSL.name("LOGIN_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>dmc_report.Z_DR_LOGIN.IP</code>.
     */
    public final TableField<JZDrLoginRecord, String> IP = createField(DSL.name("IP"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>dmc_report.Z_DR_LOGIN.MAC</code>.
     */
    public final TableField<JZDrLoginRecord, String> MAC = createField(DSL.name("MAC"), SQLDataType.VARCHAR(20), this, "");

    private JZDrLogin(Name alias, Table<JZDrLoginRecord> aliased) {
        this(alias, aliased, null);
    }

    private JZDrLogin(Name alias, Table<JZDrLoginRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("로그인 이력 테이블"), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_LOGIN</code> table reference
     */
    public JZDrLogin(String alias) {
        this(DSL.name(alias), Z_DR_LOGIN);
    }

    /**
     * Create an aliased <code>dmc_report.Z_DR_LOGIN</code> table reference
     */
    public JZDrLogin(Name alias) {
        this(alias, Z_DR_LOGIN);
    }

    /**
     * Create a <code>dmc_report.Z_DR_LOGIN</code> table reference
     */
    public JZDrLogin() {
        this(DSL.name("Z_DR_LOGIN"), null);
    }

    public <O extends Record> JZDrLogin(Table<O> child, ForeignKey<O, JZDrLoginRecord> key) {
        super(child, key, Z_DR_LOGIN);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.Z_DR_LOGIN_IX_LOGIN_DATE, Indexes.Z_DR_LOGIN_IX_USER_ID);
    }

    @Override
    public Identity<JZDrLoginRecord, Integer> getIdentity() {
        return (Identity<JZDrLoginRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JZDrLoginRecord> getPrimaryKey() {
        return Keys.KEY_Z_DR_LOGIN_PRIMARY;
    }

    @Override
    public JZDrLogin as(String alias) {
        return new JZDrLogin(DSL.name(alias), this);
    }

    @Override
    public JZDrLogin as(Name alias) {
        return new JZDrLogin(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrLogin rename(String name) {
        return new JZDrLogin(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JZDrLogin rename(Name name) {
        return new JZDrLogin(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
