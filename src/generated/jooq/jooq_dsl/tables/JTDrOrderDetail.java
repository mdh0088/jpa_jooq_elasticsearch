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
import jooq.jooq_dsl.tables.records.JTDrOrderDetailRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
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
public class JTDrOrderDetail extends TableImpl<JTDrOrderDetailRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_ORDER_DETAIL</code>
     */
    public static final JTDrOrderDetail T_DR_ORDER_DETAIL = new JTDrOrderDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrOrderDetailRecord> getRecordType() {
        return JTDrOrderDetailRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.IDX</code>.
     */
    public final TableField<JTDrOrderDetailRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.ORDER_CODE</code>. 주문코드
     */
    public final TableField<JTDrOrderDetailRecord, String> ORDER_CODE = createField(DSL.name("ORDER_CODE"), SQLDataType.VARCHAR(45).nullable(false), this, "주문코드");

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.ORDER_PRODUCT_TYPE</code>.
     * 주문상품타입
     */
    public final TableField<JTDrOrderDetailRecord, String> ORDER_PRODUCT_TYPE = createField(DSL.name("ORDER_PRODUCT_TYPE"), SQLDataType.VARCHAR(45), this, "주문상품타입");

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.OP_CODE</code>. 상품 및 보고서코드
     */
    public final TableField<JTDrOrderDetailRecord, String> OP_CODE = createField(DSL.name("OP_CODE"), SQLDataType.VARCHAR(45), this, "상품 및 보고서코드");

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.OP_NAME</code>. 상품 및 보고서 이름
     */
    public final TableField<JTDrOrderDetailRecord, String> OP_NAME = createField(DSL.name("OP_NAME"), SQLDataType.VARCHAR(1000), this, "상품 및 보고서 이름");

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.OP_TYPE_CODE</code>. 상품 및
     * 보고서 타입 코드
     */
    public final TableField<JTDrOrderDetailRecord, String> OP_TYPE_CODE = createField(DSL.name("OP_TYPE_CODE"), SQLDataType.VARCHAR(20), this, "상품 및 보고서 타입 코드");

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.CUSTOM_START_DATE</code>.
     * 임의적용 시작일
     */
    public final TableField<JTDrOrderDetailRecord, LocalDateTime> CUSTOM_START_DATE = createField(DSL.name("CUSTOM_START_DATE"), SQLDataType.LOCALDATETIME(0), this, "임의적용 시작일");

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.CUSTOM_END_DATE</code>.
     * 임의적용 종료일
     */
    public final TableField<JTDrOrderDetailRecord, LocalDateTime> CUSTOM_END_DATE = createField(DSL.name("CUSTOM_END_DATE"), SQLDataType.LOCALDATETIME(0), this, "임의적용 종료일");

    /**
     * The column <code>dmc_report.T_DR_ORDER_DETAIL.REG_DATE</code>. 등록일
     */
    public final TableField<JTDrOrderDetailRecord, LocalDateTime> REG_DATE = createField(DSL.name("REG_DATE"), SQLDataType.LOCALDATETIME(0), this, "등록일");

    private JTDrOrderDetail(Name alias, Table<JTDrOrderDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrOrderDetail(Name alias, Table<JTDrOrderDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_ORDER_DETAIL</code> table
     * reference
     */
    public JTDrOrderDetail(String alias) {
        this(DSL.name(alias), T_DR_ORDER_DETAIL);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_ORDER_DETAIL</code> table
     * reference
     */
    public JTDrOrderDetail(Name alias) {
        this(alias, T_DR_ORDER_DETAIL);
    }

    /**
     * Create a <code>dmc_report.T_DR_ORDER_DETAIL</code> table reference
     */
    public JTDrOrderDetail() {
        this(DSL.name("T_DR_ORDER_DETAIL"), null);
    }

    public <O extends Record> JTDrOrderDetail(Table<O> child, ForeignKey<O, JTDrOrderDetailRecord> key) {
        super(child, key, T_DR_ORDER_DETAIL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.T_DR_ORDER_DETAIL_OP_CODE, Indexes.T_DR_ORDER_DETAIL_ORDER_CODE);
    }

    @Override
    public Identity<JTDrOrderDetailRecord, Integer> getIdentity() {
        return (Identity<JTDrOrderDetailRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrOrderDetailRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_ORDER_DETAIL_PRIMARY;
    }

    @Override
    public JTDrOrderDetail as(String alias) {
        return new JTDrOrderDetail(DSL.name(alias), this);
    }

    @Override
    public JTDrOrderDetail as(Name alias) {
        return new JTDrOrderDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrOrderDetail rename(String name) {
        return new JTDrOrderDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrOrderDetail rename(Name name) {
        return new JTDrOrderDetail(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
