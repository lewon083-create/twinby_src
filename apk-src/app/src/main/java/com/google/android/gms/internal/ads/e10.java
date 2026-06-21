package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e10 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d10 f4786a;

    public e10(d10 d10Var) {
        this.f4786a = d10Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String j() {
        q9.n2 liteSdkVersion;
        q9.d1 d1Var = (q9.d1) oq0.l(this.f4786a.a()).f8763d;
        if (d1Var != null) {
            try {
                liteSdkVersion = d1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
                liteSdkVersion = null;
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.f31945d;
        }
        return null;
    }
}
