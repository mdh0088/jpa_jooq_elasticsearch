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
import jooq.jooq_dsl.tables.records.JTDrReportRecord;

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
public class JTDrReport extends TableImpl<JTDrReportRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_REPORT</code>
     */
    public static final JTDrReport T_DR_REPORT = new JTDrReport();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrReportRecord> getRecordType() {
        return JTDrReportRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_REPORT.IDX</code>.
     */
    public final TableField<JTDrReportRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_REPORT.DR_CODE</code>. 보고서 코드
     */
    public final TableField<JTDrReportRecord, String> DR_CODE = createField(DSL.name("DR_CODE"), SQLDataType.VARCHAR(20).nullable(false), this, "보고서 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT.R_TYPE</code>. 리포트 타입(0:일반 1:DL)
     */
    public final TableField<JTDrReportRecord, Integer> R_TYPE = createField(DSL.name("R_TYPE"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "리포트 타입(0:일반 1:DL)");

    /**
     * The column <code>dmc_report.T_DR_REPORT.TYPE_CODE</code>. 소분류 코드
     */
    public final TableField<JTDrReportRecord, String> TYPE_CODE = createField(DSL.name("TYPE_CODE"), SQLDataType.VARCHAR(20), this, "소분류 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT.REPORT_NAME</code>. 보고서명
     */
    public final TableField<JTDrReportRecord, String> REPORT_NAME = createField(DSL.name("REPORT_NAME"), SQLDataType.VARCHAR(1000), this, "보고서명");

    /**
     * The column <code>dmc_report.T_DR_REPORT.PAGE_CNT</code>. 페이지 수
     */
    public final TableField<JTDrReportRecord, String> PAGE_CNT = createField(DSL.name("PAGE_CNT"), SQLDataType.VARCHAR(100), this, "페이지 수");

    /**
     * The column <code>dmc_report.T_DR_REPORT.SAMPLE_COMMENT</code>. 표본 수
     */
    public final TableField<JTDrReportRecord, String> SAMPLE_COMMENT = createField(DSL.name("SAMPLE_COMMENT"), SQLDataType.VARCHAR(100), this, "표본 수");

    /**
     * The column <code>dmc_report.T_DR_REPORT.IBSN</code>. IBSN
     */
    public final TableField<JTDrReportRecord, String> IBSN = createField(DSL.name("IBSN"), SQLDataType.VARCHAR(100), this, "IBSN");

    /**
     * The column <code>dmc_report.T_DR_REPORT.VIEW_YN</code>. 노출여부
     */
    public final TableField<JTDrReportRecord, String> VIEW_YN = createField(DSL.name("VIEW_YN"), SQLDataType.CHAR(1).defaultValue(DSL.inline("N", SQLDataType.CHAR)), this, "노출여부");

    /**
     * The column <code>dmc_report.T_DR_REPORT.BEST_VIEW_YN</code>. 인기리포트 여부
     */
    public final TableField<JTDrReportRecord, String> BEST_VIEW_YN = createField(DSL.name("BEST_VIEW_YN"), SQLDataType.CHAR(1), this, "인기리포트 여부");

    /**
     * The column <code>dmc_report.T_DR_REPORT.SALES_TYPE</code>. 무료 : 'free'
     * 유료 : 'pay'
     */
    public final TableField<JTDrReportRecord, String> SALES_TYPE = createField(DSL.name("SALES_TYPE"), SQLDataType.VARCHAR(10).defaultValue(DSL.inline("free", SQLDataType.VARCHAR)), this, "무료 : 'free'\n유료 : 'pay'");

    /**
     * The column <code>dmc_report.T_DR_REPORT.POINT_MINUS</code>. 차감포인트
     */
    public final TableField<JTDrReportRecord, Integer> POINT_MINUS = createField(DSL.name("POINT_MINUS"), SQLDataType.INTEGER, this, "차감포인트");

    /**
     * The column <code>dmc_report.T_DR_REPORT.POINT_MINUS_PERIOD</code>. 차감포인트
     * 기간
     */
    public final TableField<JTDrReportRecord, Integer> POINT_MINUS_PERIOD = createField(DSL.name("POINT_MINUS_PERIOD"), SQLDataType.INTEGER, this, "차감포인트 기간");

    /**
     * The column <code>dmc_report.T_DR_REPORT.RATING_POINT_CODE</code>. 평가시 적립
     * 포인트 코드
     */
    public final TableField<JTDrReportRecord, String> RATING_POINT_CODE = createField(DSL.name("RATING_POINT_CODE"), SQLDataType.VARCHAR(100), this, "평가시 적립 포인트 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT.SHARE_POINT_CODE</code>. 공유시 적립
     * 포인트 코드
     */
    public final TableField<JTDrReportRecord, String> SHARE_POINT_CODE = createField(DSL.name("SHARE_POINT_CODE"), SQLDataType.VARCHAR(100), this, "공유시 적립 포인트 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT.ABRIDGEMENT_DOWNLINK</code>. 요약본
     * 다운로드 링크
     */
    public final TableField<JTDrReportRecord, String> ABRIDGEMENT_DOWNLINK = createField(DSL.name("ABRIDGEMENT_DOWNLINK"), SQLDataType.VARCHAR(255), this, "요약본 다운로드 링크");

    /**
     * The column <code>dmc_report.T_DR_REPORT.TAG</code>. 태그
     */
    public final TableField<JTDrReportRecord, String> TAG = createField(DSL.name("TAG"), SQLDataType.VARCHAR(2000), this, "태그");

    /**
     * The column <code>dmc_report.T_DR_REPORT.SUMMARY</code>. 개요
     */
    public final TableField<JTDrReportRecord, String> SUMMARY = createField(DSL.name("SUMMARY"), SQLDataType.VARCHAR(7000), this, "개요");

    /**
     * The column <code>dmc_report.T_DR_REPORT.TOC</code>. 목차
     */
    public final TableField<JTDrReportRecord, String> TOC = createField(DSL.name("TOC"), SQLDataType.CLOB, this, "목차");

    /**
     * The column <code>dmc_report.T_DR_REPORT.DETAILE_CONTENT</code>. 상세설명
     */
    public final TableField<JTDrReportRecord, String> DETAILE_CONTENT = createField(DSL.name("DETAILE_CONTENT"), SQLDataType.VARCHAR(7000), this, "상세설명");

    /**
     * The column <code>dmc_report.T_DR_REPORT.VIEW_CNT</code>. 조회 수
     */
    public final TableField<JTDrReportRecord, Integer> VIEW_CNT = createField(DSL.name("VIEW_CNT"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "조회 수");

    /**
     * The column <code>dmc_report.T_DR_REPORT.DOWN_CNT</code>. 다운로드 수
     */
    public final TableField<JTDrReportRecord, Integer> DOWN_CNT = createField(DSL.name("DOWN_CNT"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "다운로드 수");

    /**
     * The column <code>dmc_report.T_DR_REPORT.DOWN_CHART_CNT</code>. 차트다운로드 수
     */
    public final TableField<JTDrReportRecord, Integer> DOWN_CHART_CNT = createField(DSL.name("DOWN_CHART_CNT"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "차트다운로드 수");

    /**
     * The column <code>dmc_report.T_DR_REPORT.DOWN_EXCEL_CNT</code>. 엑셀다운로드 수
     */
    public final TableField<JTDrReportRecord, Integer> DOWN_EXCEL_CNT = createField(DSL.name("DOWN_EXCEL_CNT"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "엑셀다운로드 수");

    /**
     * The column <code>dmc_report.T_DR_REPORT.CUSTOM_DATE</code>. 커스텀등록일
     */
    public final TableField<JTDrReportRecord, LocalDateTime> CUSTOM_DATE = createField(DSL.name("CUSTOM_DATE"), SQLDataType.LOCALDATETIME(0), this, "커스텀등록일");

    /**
     * The column <code>dmc_report.T_DR_REPORT.REGIST_ID</code>. 등록자
     */
    public final TableField<JTDrReportRecord, String> REGIST_ID = createField(DSL.name("REGIST_ID"), SQLDataType.VARCHAR(45), this, "등록자");

    /**
     * The column <code>dmc_report.T_DR_REPORT.REGIST_DATE</code>. 등록일
     */
    public final TableField<JTDrReportRecord, LocalDateTime> REGIST_DATE = createField(DSL.name("REGIST_DATE"), SQLDataType.LOCALDATETIME(0), this, "등록일");

    /**
     * The column <code>dmc_report.T_DR_REPORT.UPDATE_ID</code>. 수정자
     */
    public final TableField<JTDrReportRecord, String> UPDATE_ID = createField(DSL.name("UPDATE_ID"), SQLDataType.VARCHAR(45), this, "수정자");

    /**
     * The column <code>dmc_report.T_DR_REPORT.UPDATE_DATE</code>. 수정일
     */
    public final TableField<JTDrReportRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("UPDATE_DATE"), SQLDataType.LOCALDATETIME(0), this, "수정일");

    private JTDrReport(Name alias, Table<JTDrReportRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrReport(Name alias, Table<JTDrReportRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_REPORT</code> table reference
     */
    public JTDrReport(String alias) {
        this(DSL.name(alias), T_DR_REPORT);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_REPORT</code> table reference
     */
    public JTDrReport(Name alias) {
        this(alias, T_DR_REPORT);
    }

    /**
     * Create a <code>dmc_report.T_DR_REPORT</code> table reference
     */
    public JTDrReport() {
        this(DSL.name("T_DR_REPORT"), null);
    }

    public <O extends Record> JTDrReport(Table<O> child, ForeignKey<O, JTDrReportRecord> key) {
        super(child, key, T_DR_REPORT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.T_DR_REPORT_DR_CODE);
    }

    @Override
    public Identity<JTDrReportRecord, Integer> getIdentity() {
        return (Identity<JTDrReportRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrReportRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_REPORT_PRIMARY;
    }

    @Override
    public JTDrReport as(String alias) {
        return new JTDrReport(DSL.name(alias), this);
    }

    @Override
    public JTDrReport as(Name alias) {
        return new JTDrReport(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrReport rename(String name) {
        return new JTDrReport(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrReport rename(Name name) {
        return new JTDrReport(name, null);
    }
}
