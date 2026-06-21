package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i10 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public i10(String str, l00 l00Var) {
        String strValueOf = String.valueOf(l00Var);
        super(t.z.g(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}
