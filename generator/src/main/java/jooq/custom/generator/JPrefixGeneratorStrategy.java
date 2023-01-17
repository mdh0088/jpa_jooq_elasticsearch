package jooq.custom.generator;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

public class JPrefixGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(final Definition definition, final Mode mode) {
        if (mode == Mode.RECORD || mode == Mode.POJO || mode == Mode.DEFAULT) {
            return "J" + super.getJavaClassName(definition, mode);
        }
        return super.getJavaClassName(definition, mode);
    }
}