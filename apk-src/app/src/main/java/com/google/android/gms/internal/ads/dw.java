package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dw implements fh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4695e;

    public dw(Context context, String str) {
        this.f4692b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f4694d = str;
        this.f4695e = false;
        this.f4693c = new Object();
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final void I(eh ehVar) {
        a(ehVar.f4951j);
    }

    public final void a(boolean z5) {
        p9.k kVar = p9.k.C;
        fw fwVar = kVar.f31318y;
        Context context = this.f4692b;
        if (fwVar.a(context)) {
            synchronized (this.f4693c) {
                try {
                    if (this.f4695e == z5) {
                        return;
                    }
                    this.f4695e = z5;
                    String str = this.f4694d;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f4695e) {
                        fw fwVar2 = kVar.f31318y;
                        if (fwVar2.a(context)) {
                            fwVar2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        fw fwVar3 = kVar.f31318y;
                        if (fwVar3.a(context)) {
                            fwVar3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }
}
