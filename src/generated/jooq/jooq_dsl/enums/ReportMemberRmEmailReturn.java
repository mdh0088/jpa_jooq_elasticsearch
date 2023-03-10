/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 메일수신(Y:수신,N:거절)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReportMemberRmEmailReturn implements EnumType {

    Y("Y"),

    N("N");

    private final String literal;

    private ReportMemberRmEmailReturn(String literal) {
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
        return "Report_Member_rm_email_return";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
