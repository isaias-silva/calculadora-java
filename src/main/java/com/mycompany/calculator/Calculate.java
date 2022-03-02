
package com.mycompany.calculator;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


public class Calculate {
  
    public static String math(String expression) throws ScriptException{
        Object value = evaluate(expression);
        return value.toString();
}

    private static Object evaluate( String ex) throws ScriptException {
        
      ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String foo = ex;
    return (engine.eval(foo));
    }

}
