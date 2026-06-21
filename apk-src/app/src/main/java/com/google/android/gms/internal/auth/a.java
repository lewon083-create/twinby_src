package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends na.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l6.i f13167m = new l6.i("GoogleAuthService.API", new bb.f(1), new l7.b(5));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ad.m0 f13168n = new ad.m0("Auth", new String[]{"GoogleAuthServiceClient"});

    public static void f(Status status, Bundle bundle, sb.g gVar) {
        if (status.c() ? gVar.d(bundle) : gVar.c(pa.c0.n(status))) {
            return;
        }
        f13168n.t("The task is already complete.", new Object[0]);
    }
}
