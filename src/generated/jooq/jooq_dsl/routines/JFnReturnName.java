/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.routines;


import jooq.jooq_dsl.JDmcReport;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JFnReturnName extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>dmc_report.FN_RETURN_NAME.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR(128), false, false);

    /**
     * The parameter <code>dmc_report.FN_RETURN_NAME.input1</code>.
     */
    public static final Parameter<String> INPUT1 = Internal.createParameter("input1", SQLDataType.VARCHAR(32), false, false);

    /**
     * The parameter <code>dmc_report.FN_RETURN_NAME.input2</code>.
     */
    public static final Parameter<String> INPUT2 = Internal.createParameter("input2", SQLDataType.VARCHAR(32), false, false);

    /**
     * Create a new routine call instance
     */
    public JFnReturnName() {
        super("FN_RETURN_NAME", JDmcReport.DMC_REPORT, SQLDataType.VARCHAR(128));

        setReturnParameter(RETURN_VALUE);
        addInParameter(INPUT1);
        addInParameter(INPUT2);
    }

    /**
     * Set the <code>input1</code> parameter IN value to the routine
     */
    public void setInput1(String value) {
        setValue(INPUT1, value);
    }

    /**
     * Set the <code>input1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public JFnReturnName setInput1(Field<String> field) {
        setField(INPUT1, field);
        return this;
    }

    /**
     * Set the <code>input2</code> parameter IN value to the routine
     */
    public void setInput2(String value) {
        setValue(INPUT2, value);
    }

    /**
     * Set the <code>input2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public JFnReturnName setInput2(Field<String> field) {
        setField(INPUT2, field);
        return this;
    }
}
