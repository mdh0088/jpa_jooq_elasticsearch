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
import jooq.jooq_dsl.tables.records.JTDrReportRatingRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 리포트 평가 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrReportRating extends TableImpl<JTDrReportRatingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_REPORT_RATING</code>
     */
    public static final JTDrReportRating T_DR_REPORT_RATING = new JTDrReportRating();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrReportRatingRecord> getRecordType() {
        return JTDrReportRatingRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.IDX</code>.
     */
    public final TableField<JTDrReportRatingRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.USER_ID</code>. 사용자 ID
     */
    public final TableField<JTDrReportRatingRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(100), this, "사용자 ID");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.USER_AUTH_CODE</code>. 계정
     * 권한 코드
     */
    public final TableField<JTDrReportRatingRecord, String> USER_AUTH_CODE = createField(DSL.name("USER_AUTH_CODE"), SQLDataType.VARCHAR(32), this, "계정 권한 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.DR_CODE</code>. 보고서 코드
     */
    public final TableField<JTDrReportRatingRecord, String> DR_CODE = createField(DSL.name("DR_CODE"), SQLDataType.VARCHAR(45), this, "보고서 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.RATING_CNT</code>. 평가 점수
     */
    public final TableField<JTDrReportRatingRecord, Double> RATING_CNT = createField(DSL.name("RATING_CNT"), SQLDataType.DOUBLE, this, "평가 점수");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.CONNECTION_IP</code>. 접속IP
     */
    public final TableField<JTDrReportRatingRecord, String> CONNECTION_IP = createField(DSL.name("CONNECTION_IP"), SQLDataType.VARCHAR(32), this, "접속IP");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.NETWORK_PATH</code>. 접속경로
     */
    public final TableField<JTDrReportRatingRecord, String> NETWORK_PATH = createField(DSL.name("NETWORK_PATH"), SQLDataType.VARCHAR(32), this, "접속경로");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.KEYWORD_TYPE</code>. 키워드
     * 종류
     */
    public final TableField<JTDrReportRatingRecord, String> KEYWORD_TYPE = createField(DSL.name("KEYWORD_TYPE"), SQLDataType.VARCHAR(32), this, "키워드 종류");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.KEYWORD</code>. 키워드
     */
    public final TableField<JTDrReportRatingRecord, String> KEYWORD = createField(DSL.name("KEYWORD"), SQLDataType.VARCHAR(45), this, "키워드");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.CATEGORY</code>. 카테고리 내역
     */
    public final TableField<JTDrReportRatingRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(200), this, "카테고리 내역");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.DEVICE_TYPE</code>. 디바이스
     * 종류
     */
    public final TableField<JTDrReportRatingRecord, String> DEVICE_TYPE = createField(DSL.name("DEVICE_TYPE"), SQLDataType.VARCHAR(32), this, "디바이스 종류");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.DEVICE</code>. 이용기기
     */
    public final TableField<JTDrReportRatingRecord, String> DEVICE = createField(DSL.name("DEVICE"), SQLDataType.VARCHAR(100), this, "이용기기");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.BROWSER</code>. 접속 브라우저
     */
    public final TableField<JTDrReportRatingRecord, String> BROWSER = createField(DSL.name("BROWSER"), SQLDataType.VARCHAR(100), this, "접속 브라우저");

    /**
     * The column <code>dmc_report.T_DR_REPORT_RATING.REG_DATE</code>. 등록일
     */
    public final TableField<JTDrReportRatingRecord, LocalDateTime> REG_DATE = createField(DSL.name("REG_DATE"), SQLDataType.LOCALDATETIME(0), this, "등록일");

    private JTDrReportRating(Name alias, Table<JTDrReportRatingRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrReportRating(Name alias, Table<JTDrReportRatingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("리포트 평가 테이블"), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_REPORT_RATING</code> table
     * reference
     */
    public JTDrReportRating(String alias) {
        this(DSL.name(alias), T_DR_REPORT_RATING);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_REPORT_RATING</code> table
     * reference
     */
    public JTDrReportRating(Name alias) {
        this(alias, T_DR_REPORT_RATING);
    }

    /**
     * Create a <code>dmc_report.T_DR_REPORT_RATING</code> table reference
     */
    public JTDrReportRating() {
        this(DSL.name("T_DR_REPORT_RATING"), null);
    }

    public <O extends Record> JTDrReportRating(Table<O> child, ForeignKey<O, JTDrReportRatingRecord> key) {
        super(child, key, T_DR_REPORT_RATING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.T_DR_REPORT_RATING_DR_CODE);
    }

    @Override
    public Identity<JTDrReportRatingRecord, Integer> getIdentity() {
        return (Identity<JTDrReportRatingRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrReportRatingRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_REPORT_RATING_PRIMARY;
    }

    @Override
    public JTDrReportRating as(String alias) {
        return new JTDrReportRating(DSL.name(alias), this);
    }

    @Override
    public JTDrReportRating as(Name alias) {
        return new JTDrReportRating(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrReportRating rename(String name) {
        return new JTDrReportRating(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrReportRating rename(Name name) {
        return new JTDrReportRating(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, String, Double, String, String, String, String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}