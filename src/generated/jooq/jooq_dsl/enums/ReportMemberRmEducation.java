/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 학력(0:미선택 1:초졸 2:중졸 3:고졸 4:대졸 5:학사 이상)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReportMemberRmEducation implements EnumType {

    _0("0"),

    _1("1"),

    _2("2"),

    _3("3"),

    _4("4"),

    _5("5");

    private final String literal;

    private ReportMemberRmEducation(String literal) {
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
        return "Report_Member_rm_education";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
