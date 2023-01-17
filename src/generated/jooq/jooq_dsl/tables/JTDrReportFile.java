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
import jooq.jooq_dsl.tables.records.JTDrReportFileRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class JTDrReportFile extends TableImpl<JTDrReportFileRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_REPORT_FILE</code>
     */
    public static final JTDrReportFile T_DR_REPORT_FILE = new JTDrReportFile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrReportFileRecord> getRecordType() {
        return JTDrReportFileRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.IDX</code>.
     */
    public final TableField<JTDrReportFileRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.DR_CODE</code>. 보고서 코드
     */
    public final TableField<JTDrReportFileRecord, String> DR_CODE = createField(DSL.name("DR_CODE"), SQLDataType.VARCHAR(20), this, "보고서 코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_CODE</code>. 파일고유코드
     */
    public final TableField<JTDrReportFileRecord, String> FILE_CODE = createField(DSL.name("FILE_CODE"), SQLDataType.VARCHAR(45), this, "파일고유코드");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_TYPE_CODE</code>. 파일 타입
     */
    public final TableField<JTDrReportFileRecord, String> FILE_TYPE_CODE = createField(DSL.name("FILE_TYPE_CODE"), SQLDataType.VARCHAR(20), this, "파일 타입");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_EXTENSIONS</code>.
     * 파일확장자
     */
    public final TableField<JTDrReportFileRecord, String> FILE_EXTENSIONS = createField(DSL.name("FILE_EXTENSIONS"), SQLDataType.VARCHAR(45), this, "파일확장자");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_ORIGINALNAME</code>.
     * 파일원본이름
     */
    public final TableField<JTDrReportFileRecord, String> FILE_ORIGINALNAME = createField(DSL.name("FILE_ORIGINALNAME"), SQLDataType.VARCHAR(100), this, "파일원본이름");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_NAME</code>. 파일이름
     */
    public final TableField<JTDrReportFileRecord, String> FILE_NAME = createField(DSL.name("FILE_NAME"), SQLDataType.VARCHAR(100), this, "파일이름");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_SIZE</code>. 파일크기
     */
    public final TableField<JTDrReportFileRecord, Long> FILE_SIZE = createField(DSL.name("FILE_SIZE"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "파일크기");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_PATH</code>. 파일경로
     */
    public final TableField<JTDrReportFileRecord, String> FILE_PATH = createField(DSL.name("FILE_PATH"), SQLDataType.VARCHAR(255), this, "파일경로");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_URL</code>. 파일주소
     */
    public final TableField<JTDrReportFileRecord, String> FILE_URL = createField(DSL.name("FILE_URL"), SQLDataType.VARCHAR(255), this, "파일주소");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.FILE_SEQUENCE</code>. 파일순서
     */
    public final TableField<JTDrReportFileRecord, Integer> FILE_SEQUENCE = createField(DSL.name("FILE_SEQUENCE"), SQLDataType.INTEGER, this, "파일순서");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.REGIST_DATE</code>. 등록일
     */
    public final TableField<JTDrReportFileRecord, LocalDateTime> REGIST_DATE = createField(DSL.name("REGIST_DATE"), SQLDataType.LOCALDATETIME(0), this, "등록일");

    /**
     * The column <code>dmc_report.T_DR_REPORT_FILE.UPDATE_DATE</code>. 수정일
     */
    public final TableField<JTDrReportFileRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("UPDATE_DATE"), SQLDataType.LOCALDATETIME(0), this, "수정일");

    private JTDrReportFile(Name alias, Table<JTDrReportFileRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrReportFile(Name alias, Table<JTDrReportFileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_REPORT_FILE</code> table
     * reference
     */
    public JTDrReportFile(String alias) {
        this(DSL.name(alias), T_DR_REPORT_FILE);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_REPORT_FILE</code> table
     * reference
     */
    public JTDrReportFile(Name alias) {
        this(alias, T_DR_REPORT_FILE);
    }

    /**
     * Create a <code>dmc_report.T_DR_REPORT_FILE</code> table reference
     */
    public JTDrReportFile() {
        this(DSL.name("T_DR_REPORT_FILE"), null);
    }

    public <O extends Record> JTDrReportFile(Table<O> child, ForeignKey<O, JTDrReportFileRecord> key) {
        super(child, key, T_DR_REPORT_FILE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.T_DR_REPORT_FILE_DR_CODE);
    }

    @Override
    public Identity<JTDrReportFileRecord, Integer> getIdentity() {
        return (Identity<JTDrReportFileRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrReportFileRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_REPORT_FILE_PRIMARY;
    }

    @Override
    public JTDrReportFile as(String alias) {
        return new JTDrReportFile(DSL.name(alias), this);
    }

    @Override
    public JTDrReportFile as(Name alias) {
        return new JTDrReportFile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrReportFile rename(String name) {
        return new JTDrReportFile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrReportFile rename(Name name) {
        return new JTDrReportFile(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, String, String, String, String, String, String, Long, String, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}