package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class af extends pn1 {
    public final /* synthetic */ int H = 0;
    public Long I;
    public Object J;
    public Object K;

    public /* synthetic */ af() {
    }

    @Override // com.google.android.gms.internal.ads.pn1
    public final HashMap f() {
        switch (this.H) {
            case 0:
                HashMap map = new HashMap();
                map.put(0, this.I);
                map.put(1, (Long) this.J);
                map.put(2, (Long) this.K);
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put(0, this.I);
                map2.put(1, (Boolean) this.J);
                map2.put(2, (Boolean) this.K);
                return map2;
        }
    }

    public af(String str) {
        HashMap mapN = pn1.n(str);
        if (mapN != null) {
            this.I = (Long) mapN.get(0);
            this.J = (Boolean) mapN.get(1);
            this.K = (Boolean) mapN.get(2);
        }
    }
}
