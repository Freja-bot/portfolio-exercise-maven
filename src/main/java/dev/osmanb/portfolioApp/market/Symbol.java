package dev.osmanb.portfolioApp.market;

/**
 * Represents a stock ticker symbol.
 *  @author OSNB
 *  @version 1.0
 */
public enum Symbol {

    APP,
    ADTN,
    AXTI,
    BCYC,
    BKKT,
    BWXT,
    CCIR,
    CFR,
    CMTL,
    CTEV,
    DQ,
    EARN,
    EOSE,
    FBIN,
    FNV,
    GABC,
    GIGM,
    GSRT,
    HURA,
    INMD,
    JOBY,
    LBTYA,
    LSE,
    MGRX,
    NOK,
    OSIS,
    PLUT,
    RGA,
    SEVN,
    SOBR,
    TDUP,
    TEAM,
    TRI,
    UBFO,
    UROY,
    VOD,
    WDFC,
    WTO,
    XRAY,
    YJ,
    ZIP;

    private static final Symbol[] symbols = Symbol.values();

    public static boolean isValidSymbol(String symbol) {

        for(Symbol validSymbol : symbols){
            if(symbol.equals(validSymbol.toString())){
                return true;
            }
        }

        return false;
    }
}
