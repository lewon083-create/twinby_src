package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tq implements eq, sq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sq f10693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f10694c = new HashSet();

    public tq(hq hqVar) {
        this.f10693b = hqVar;
    }

    @Override // com.google.android.gms.internal.ads.eq, com.google.android.gms.internal.ads.iq
    public final void b(String str) {
        this.f10693b.b(str);
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final void i(String str, vo voVar) {
        this.f10693b.i(str, voVar);
        this.f10694c.remove(new AbstractMap.SimpleEntry(str, voVar));
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final void j(String str, vo voVar) {
        this.f10693b.j(str, voVar);
        this.f10694c.add(new AbstractMap.SimpleEntry(str, voVar));
    }
}
