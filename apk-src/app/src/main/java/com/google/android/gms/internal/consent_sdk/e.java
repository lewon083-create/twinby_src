package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d6 f13368c;

    public /* synthetic */ e(d6 d6Var, int i) {
        this.f13367b = i;
        this.f13368c = d6Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public final Object j() {
        switch (this.f13367b) {
            case 0:
                return new d((Application) this.f13368c.f13360c);
            case 1:
                return new g((Application) this.f13368c.f13360c);
            default:
                return new z((Application) this.f13368c.f13360c);
        }
    }
}
