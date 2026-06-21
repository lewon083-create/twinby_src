package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rf extends pn1 {
    public final Long H;
    public final Long I;
    public final Long J;
    public final Long K;
    public final Long L;
    public final Long M;
    public final Long N;
    public final Long O;
    public final Long P;
    public final Long Q;
    public final Long R;

    public rf(String str) {
        HashMap mapN = pn1.n(str);
        if (mapN != null) {
            this.H = (Long) mapN.get(0);
            this.I = (Long) mapN.get(1);
            this.J = (Long) mapN.get(2);
            this.K = (Long) mapN.get(3);
            this.L = (Long) mapN.get(4);
            this.M = (Long) mapN.get(5);
            this.N = (Long) mapN.get(6);
            this.O = (Long) mapN.get(7);
            this.P = (Long) mapN.get(8);
            this.Q = (Long) mapN.get(9);
            this.R = (Long) mapN.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn1
    public final HashMap f() {
        HashMap map = new HashMap();
        map.put(0, this.H);
        map.put(1, this.I);
        map.put(2, this.J);
        map.put(3, this.K);
        map.put(4, this.L);
        map.put(5, this.M);
        map.put(6, this.N);
        map.put(7, this.O);
        map.put(8, this.P);
        map.put(9, this.Q);
        map.put(10, this.R);
        return map;
    }
}
