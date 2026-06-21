package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class he extends pn1 {
    public String H;
    public final long I;
    public final String J;
    public final String K;
    public final String L;

    public he(String str) {
        this.H = "E";
        this.I = -1L;
        this.J = "E";
        this.K = "E";
        this.L = "E";
        HashMap mapN = pn1.n(str);
        if (mapN != null) {
            this.H = mapN.get(0) == null ? "E" : (String) mapN.get(0);
            this.I = mapN.get(1) != null ? ((Long) mapN.get(1)).longValue() : -1L;
            this.J = mapN.get(2) == null ? "E" : (String) mapN.get(2);
            this.K = mapN.get(3) == null ? "E" : (String) mapN.get(3);
            this.L = mapN.get(4) != null ? (String) mapN.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.pn1
    public final HashMap f() {
        HashMap map = new HashMap();
        map.put(0, this.H);
        map.put(4, this.L);
        map.put(3, this.K);
        map.put(2, this.J);
        map.put(1, Long.valueOf(this.I));
        return map;
    }
}
