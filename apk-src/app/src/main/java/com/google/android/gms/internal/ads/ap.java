package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ap implements s9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q9.a f3346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f3347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f3348e;

    public ap(bp bpVar, boolean z5, q9.a aVar, HashMap map, Map map2) {
        this.f3345b = z5;
        this.f3346c = aVar;
        this.f3347d = map;
        this.f3348e = map2;
        Objects.requireNonNull(bpVar);
        this.f3344a = false;
    }

    @Override // s9.a
    public final void l0(boolean z5) {
        if (this.f3344a) {
            return;
        }
        q9.a aVar = this.f3346c;
        if (z5 && this.f3345b) {
            ((v80) aVar).J();
        }
        this.f3344a = true;
        String str = (String) this.f3348e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z5);
        HashMap map = this.f3347d;
        map.put(str, boolValueOf);
        ((dq) aVar).c("openIntentAsync", map);
    }

    @Override // s9.a
    public final void u(int i) {
    }
}
