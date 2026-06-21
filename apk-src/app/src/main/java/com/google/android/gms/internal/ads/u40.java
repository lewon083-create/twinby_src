package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u40 implements pj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10815a;

    public u40(List list) {
        this.f10815a = list;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void p() {
        for (ed.d dVar : this.f10815a) {
            dVar.a(new l81(0, dVar, new fp(25)), f81.f5272b);
        }
    }

    public u40(r40 r40Var) {
        this.f10815a = Collections.singletonList(vv.d(r40Var));
    }
}
