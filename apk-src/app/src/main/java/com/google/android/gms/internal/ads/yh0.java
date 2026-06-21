package com.google.android.gms.internal.ads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yh0 implements o31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12621b;

    public /* synthetic */ yh0(Context context) {
        this.f12621b = context;
    }

    public ed.d a(boolean z5) {
        try {
            Intrinsics.checkNotNullParameter("com.google.android.gms.ads", "adsSdkName");
            h6.b bVar = new h6.b(z5);
            f6.a aVarA = f6.a.a(this.f12621b);
            return aVarA != null ? aVarA.b(bVar) : vv.y(new IllegalStateException());
        } catch (Exception e3) {
            return vv.y(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object mo8h() {
        return new b(this.f12621b);
    }
}
