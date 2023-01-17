/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.util.Arrays;
import java.util.List;

import jooq.jooq_dsl.Indexes;
import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JTDrProductCateRecord;

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
public class JTDrProductCate extends TableImpl<JTDrProductCateRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_PRODUCT_CATE</code>
     */
    public static final JTDrProductCate T_DR_PRODUCT_CATE = new JTDrProductCate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrProductCateRecord> getRecordType() {
        return JTDrProductCateRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_PRODUCT_CATE.IDX</code>.
     */
    public final TableField<JTDrProductCateRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT_CATE.P_CODE</code>.
     */
    public final TableField<JTDrProductCateRecord, String> P_CODE = createField(DSL.name("P_CODE"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT_CATE.CATE_CODE</code>. 카테고리 코드
     */
    public final TableField<JTDrProductCateRecord, String> CATE_CODE = createField(DSL.name("CATE_CODE"), SQLDataType.VARCHAR(20), this, "카테고리 코드");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT_CATE.DR_CODE</code>.
     */
    public final TableField<JTDrProductCateRecord, String> DR_CODE = createField(DSL.name("DR_CODE"), SQLDataType.VARCHAR(20), this, "");

    private JTDrProductCate(Name alias, Table<JTDrProductCateRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrProductCate(Name alias, Table<JTDrProductCateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_PRODUCT_CATE</code> table
     * reference
     */
    public JTDrProductCate(String alias) {
        this(DSL.name(alias), T_DR_PRODUCT_CATE);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_PRODUCT_CATE</code> table
     * reference
     */
    public JTDrProductCate(Name alias) {
        this(alias, T_DR_PRODUCT_CATE);
    }

    /**
     * Create a <code>dmc_report.T_DR_PRODUCT_CATE</code> table reference
     */
    public JTDrProductCate() {
        this(DSL.name("T_DR_PRODUCT_CATE"), null);
    }

    public <O extends Record> JTDrProductCate(Table<O> child, ForeignKey<O, JTDrProductCateRecord> key) {
        super(child, key, T_DR_PRODUCT_CATE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.T_DR_PRODUCT_CATE_P_CODE);
    }

    @Override
    public Identity<JTDrProductCateRecord, Integer> getIdentity() {
        return (Identity<JTDrProductCateRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrProductCateRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_PRODUCT_CATE_PRIMARY;
    }

    @Override
    public JTDrProductCate as(String alias) {
        return new JTDrProductCate(DSL.name(alias), this);
    }

    @Override
    public JTDrProductCate as(Name alias) {
        return new JTDrProductCate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrProductCate rename(String name) {
        return new JTDrProductCate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrProductCate rename(Name name) {
        return new JTDrProductCate(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}