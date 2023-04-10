package com.jpa.springpostgres.hibernate;

import org.hibernate.dialect.PostgreSQL10Dialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.BooleanType;

/**
 * Date: 4/10/2023<br/>
 * Time: 4:10 PM<br/>
 */
public class PostgreSQLDialect extends PostgreSQL10Dialect {

    public PostgreSQLDialect() {

        registerFunction("fts", new SQLFunctionTemplate(BooleanType.INSTANCE, "to_tsvector(?1) @@ plainto_tsquery(?2)"));
    }

}