package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s40 implements t40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10173a;

    public s40(Map map) {
        this.f10173a = map;
    }

    @Override // com.google.android.gms.internal.ads.t40
    public final zh0 a(int i, String str) {
        return (zh0) this.f10173a.get(str);
    }
}
