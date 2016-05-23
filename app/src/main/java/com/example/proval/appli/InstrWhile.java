package com.example.proval.appli;

/**
 * Created by proval on 5/23/16.
 */
public class InstrWhile extends Instr {
    Cond cond;
    Instr instr;

    InstrWhile (Cond c, Instr i) {
        this.cond = c;
        this.instr = i;
    }
}
