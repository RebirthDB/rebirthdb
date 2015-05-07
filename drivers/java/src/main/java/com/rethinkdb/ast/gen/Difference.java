// Autogenerated by convert_protofile.py on 2015-05-06.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Difference extends RqlQuery {


    public Difference(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Difference(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Difference(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.DIFFERENCE, args, optargs);
    }
    protected Difference(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


}