package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rq0 implements l60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f10026b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dx f10028d;

    public rq0(Context context, dx dxVar) {
        this.f10027c = context;
        this.f10028d = dxVar;
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final synchronized void K(q9.x1 x1Var) {
        if (x1Var.f31976b != 3) {
            dx dxVar = this.f10028d;
            HashSet hashSet = this.f10026b;
            synchronized (dxVar.f4700b) {
                dxVar.f4704f.addAll(hashSet);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rq0.a():android.os.Bundle");
    }
}
