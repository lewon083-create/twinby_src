package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0623y2 f23054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23055c;

    public U1(List list, C0623y2 c0623y2, List list2) {
        this.f23053a = list;
        this.f23054b = c0623y2;
        this.f23055c = list2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppPermissionsState{mPermissionStateList=");
        sb2.append(this.f23053a);
        sb2.append(", mBackgroundRestrictionsState=");
        sb2.append(this.f23054b);
        sb2.append(", mAvailableProviders=");
        return a0.u.p(sb2, this.f23055c, '}');
    }
}
