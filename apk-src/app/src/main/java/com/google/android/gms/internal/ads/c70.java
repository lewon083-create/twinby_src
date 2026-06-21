package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c70 extends ip1 implements lo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f4067d;

    public c70(Set set) {
        super(set);
        this.f4067d = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.lo
    public final synchronized void j(Bundle bundle, String str) {
        this.f4067d.putAll(bundle);
        A1(v60.i);
    }
}
