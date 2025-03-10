package hu.nye.csokibolt;

public enum CsokiTipus {
    TEJ, ÉT, FEHÉR;

    public int getKaloria(){
        switch (this){
            case TEJ -> { return 535; }
            case ÉT -> { return 597; }
            case FEHÉR -> { return  565; }
            default -> { return 0; }
        }
    }
}
