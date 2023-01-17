/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.util.Arrays;
import java.util.List;

import jooq.jooq_dsl.Indexes;
import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JTDrReportPkgoptRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class JTDrReportPkgopt extends TableImpl<JTDrReportPkgoptRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_REPORT_PKGOPT</code>
     */
    public static final JTDrReportPkgopt T_DR_REPORT_PKGOPT = new JTDrReportPkgopt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrReportPkgoptRecord> getRecordType() {
        return JTDrReportPkgoptRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_REPORT_PKGOPT.IDX</code>.
     */
    public final TableField<JTDrReportPkgoptRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_REPORT_PKGOPT.DR_CODE</code>. 보고서 코드
     */
    public final TableField<JTDrReportPkgoptRecord, String> DR_CODE = createField(DSL.name("DR_CODE"), SQLDataType.VARCHAR(20), this, "보고서 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT_PKGOPT.OPT_CODE</code>. 옵션 코드
     */
    public final TableField<JTDrReportPkgoptRecord, String> OPT_CODE = createField(DSL.name("OPT_CODE"), SQLDataType.VARCHAR(20), this, "옵션 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT_PKGOPT.PKG_CODE</code>. 패키지 코드
     */
    public final TableField<JTDrReportPkgoptRecord, String> PKG_CODE = createField(DSL.name("PKG_CODE"), SQLDataType.VARCHAR(20), this, "패키지 코드");

    private JTDrReportPkgopt(Name alias, Table<JTDrReportPkgoptRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrReportPkgopt(Name alias, Table<JTDrReportPkgoptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_REPORT_PKGOPT</code> table
     * reference
     */
    public JTDrReportPkgopt(String alias) {
        this(DSL.name(alias), T_DR_REPORT_PKGOPT);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_REPORT_PKGOPT</code> table
     * reference
     */
    public JTDrReportPkgopt(Name alias) {
        this(alias, T_DR_REPORT_PKGOPT);
    }

    /**
     * Create a <code>dmc_report.T_DR_REPORT_PKGOPT</code> table reference
     */
    public JTDrReportPkgopt() {
        this(DSL.name("T_DR_REPORT_PKGOPT"), null);
    }

    public <O extends Record> JTDrReportPkgopt(Table<O> child, ForeignKey<O, JTDrReportPkgoptRecord> key) {
        super(child, key, T_DR_REPORT_PKGOPT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.T_DR_REPORT_PKGOPT_DR_CODE);
    }

    @Override
    public Identity<JTDrReportPkgoptRecord, Integer> getIdentity() {
        return (Identity<JTDrReportPkgoptRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrReportPkgoptRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_REPORT_PKGOPT_PRIMARY;
    }

    @Override
    public JTDrReportPkgopt as(String alias) {
        return new JTDrReportPkgopt(DSL.name(alias), this);
    }

    @Override
    public JTDrReportPkgopt as(Name alias) {
        return new JTDrReportPkgopt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrReportPkgopt rename(String name) {
        return new JTDrReportPkgopt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrReportPkgopt rename(Name name) {
        return new JTDrReportPkgopt(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}