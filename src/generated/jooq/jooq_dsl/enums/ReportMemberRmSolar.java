/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReportMemberRmSolar implements EnumType {

    Y("Y"),

    N("N");

    private final String literal;

    private ReportMemberRmSolar(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "Report_Member_rm_solar";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}