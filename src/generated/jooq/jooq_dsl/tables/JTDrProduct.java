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
import jooq.jooq_dsl.tables.records.JTDrProductRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
public class JTDrProduct extends TableImpl<JTDrProductRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_PRODUCT</code>
     */
    public static final JTDrProduct T_DR_PRODUCT = new JTDrProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrProductRecord> getRecordType() {
        return JTDrProductRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.IDX</code>.
     */
    public final TableField<JTDrProductRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.P_CODE</code>. 상품코드
     */
    public final TableField<JTDrProductRecord, String> P_CODE = createField(DSL.name("P_CODE"), SQLDataType.VARCHAR(20).nullable(false), this, "상품코드");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.P_TYPE</code>. 상품 타입
     */
    public final TableField<JTDrProductRecord, String> P_TYPE = createField(DSL.name("P_TYPE"), SQLDataType.VARCHAR(20), this, "상품 타입");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.P_SUB_TYPE</code>. 상품 하위 타입
     */
    public final TableField<JTDrProductRecord, String> P_SUB_TYPE = createField(DSL.name("P_SUB_TYPE"), SQLDataType.VARCHAR(20), this, "상품 하위 타입");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.NAME</code>. 상품명
     */
    public final TableField<JTDrProductRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(500), this, "상품명");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.PERIOD_CODE</code>. 상품기간 코드
     */
    public final TableField<JTDrProductRecord, String> PERIOD_CODE = createField(DSL.name("PERIOD_CODE"), SQLDataType.VARCHAR(45), this, "상품기간 코드");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.PERIOD_START_DATE</code>. 상품기간
     * 시작일
     */
    public final TableField<JTDrProductRecord, LocalDateTime> PERIOD_START_DATE = createField(DSL.name("PERIOD_START_DATE"), SQLDataType.LOCALDATETIME(0), this, "상품기간 시작일");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.PERIOD_END_DATE</code>. 상품기간 종료일
     */
    public final TableField<JTDrProductRecord, LocalDateTime> PERIOD_END_DATE = createField(DSL.name("PERIOD_END_DATE"), SQLDataType.LOCALDATETIME(0), this, "상품기간 종료일");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.AUTH_DOWNLOAD_TYPE</code>. 계정상품
     * 다운로드 형식
     */
    public final TableField<JTDrProductRecord, String> AUTH_DOWNLOAD_TYPE = createField(DSL.name("AUTH_DOWNLOAD_TYPE"), SQLDataType.VARCHAR(45), this, "계정상품 다운로드 형식");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.PRICE</code>. 계정권한 상품가격
     */
    public final TableField<JTDrProductRecord, Integer> PRICE = createField(DSL.name("PRICE"), SQLDataType.INTEGER, this, "계정권한 상품가격");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.VIEW_YN</code>. 노출여부
     */
    public final TableField<JTDrProductRecord, String> VIEW_YN = createField(DSL.name("VIEW_YN"), SQLDataType.CHAR(1).defaultValue(DSL.inline("N", SQLDataType.CHAR)), this, "노출여부");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.BEST_VIEW_YN</code>. 인기리포트 여부
     */
    public final TableField<JTDrProductRecord, String> BEST_VIEW_YN = createField(DSL.name("BEST_VIEW_YN"), SQLDataType.CHAR(1).defaultValue(DSL.inline("N", SQLDataType.CHAR)), this, "인기리포트 여부");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.PAGE_CNT</code>. 페이지 수
     */
    public final TableField<JTDrProductRecord, String> PAGE_CNT = createField(DSL.name("PAGE_CNT"), SQLDataType.VARCHAR(100), this, "페이지 수");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.SAMPLE_COMMENT</code>. 표본 수
     */
    public final TableField<JTDrProductRecord, String> SAMPLE_COMMENT = createField(DSL.name("SAMPLE_COMMENT"), SQLDataType.VARCHAR(100), this, "표본 수");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.IBSN</code>. IBSN
     */
    public final TableField<JTDrProductRecord, String> IBSN = createField(DSL.name("IBSN"), SQLDataType.VARCHAR(100), this, "IBSN");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.TAG</code>. 태그
     */
    public final TableField<JTDrProductRecord, String> TAG = createField(DSL.name("TAG"), SQLDataType.VARCHAR(2000), this, "태그");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.SUMMARY</code>. 개요
     */
    public final TableField<JTDrProductRecord, String> SUMMARY = createField(DSL.name("SUMMARY"), SQLDataType.VARCHAR(7000), this, "개요");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.TOC</code>. 목차
     */
    public final TableField<JTDrProductRecord, String> TOC = createField(DSL.name("TOC"), SQLDataType.VARCHAR(3000), this, "목차");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.DETAILE_CONTENT</code>. 상세설명
     */
    public final TableField<JTDrProductRecord, String> DETAILE_CONTENT = createField(DSL.name("DETAILE_CONTENT"), SQLDataType.VARCHAR(7000), this, "상세설명");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.VIEW_CNT</code>. 조회수
     */
    public final TableField<JTDrProductRecord, Integer> VIEW_CNT = createField(DSL.name("VIEW_CNT"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "조회수");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.DOWN_CNT</code>. 다운로드수
     */
    public final TableField<JTDrProductRecord, Integer> DOWN_CNT = createField(DSL.name("DOWN_CNT"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "다운로드수");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.CUSTOM_DATE</code>.
     */
    public final TableField<JTDrProductRecord, LocalDateTime> CUSTOM_DATE = createField(DSL.name("CUSTOM_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.REGIST_ID</code>.
     */
    public final TableField<JTDrProductRecord, String> REGIST_ID = createField(DSL.name("REGIST_ID"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.REGIST_DATE</code>. 등록일
     */
    public final TableField<JTDrProductRecord, LocalDateTime> REGIST_DATE = createField(DSL.name("REGIST_DATE"), SQLDataType.LOCALDATETIME(0), this, "등록일");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.UPDATE_ID</code>.
     */
    public final TableField<JTDrProductRecord, String> UPDATE_ID = createField(DSL.name("UPDATE_ID"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>dmc_report.T_DR_PRODUCT.UPDATE_DATE</code>. 수정일
     */
    public final TableField<JTDrProductRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("UPDATE_DATE"), SQLDataType.LOCALDATETIME(0), this, "수정일");

    private JTDrProduct(Name alias, Table<JTDrProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrProduct(Name alias, Table<JTDrProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_PRODUCT</code> table reference
     */
    public JTDrProduct(String alias) {
        this(DSL.name(alias), T_DR_PRODUCT);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_PRODUCT</code> table reference
     */
    public JTDrProduct(Name alias) {
        this(alias, T_DR_PRODUCT);
    }

    /**
     * Create a <code>dmc_report.T_DR_PRODUCT</code> table reference
     */
    public JTDrProduct() {
        this(DSL.name("T_DR_PRODUCT"), null);
    }

    public <O extends Record> JTDrProduct(Table<O> child, ForeignKey<O, JTDrProductRecord> key) {
        super(child, key, T_DR_PRODUCT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.T_DR_PRODUCT_P_CODE);
    }

    @Override
    public Identity<JTDrProductRecord, Integer> getIdentity() {
        return (Identity<JTDrProductRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrProductRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_PRODUCT_PRIMARY;
    }

    @Override
    public JTDrProduct as(String alias) {
        return new JTDrProduct(DSL.name(alias), this);
    }

    @Override
    public JTDrProduct as(Name alias) {
        return new JTDrProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrProduct rename(String name) {
        return new JTDrProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrProduct rename(Name name) {
        return new JTDrProduct(name, null);
    }
}
