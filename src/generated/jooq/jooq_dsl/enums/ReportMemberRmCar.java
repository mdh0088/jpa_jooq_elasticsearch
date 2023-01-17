/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 자동차(Y:보유, N:미보유)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReportMemberRmCar implements EnumType {

    Y("Y"),

    N("N");

    private final String literal;

    private ReportMemberRmCar(String literal) {
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
        return "Report_Member_rm_car";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}