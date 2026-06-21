package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f21921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f21923d;

    public f(e eVar, Function1 function1, String str, SafePackageManager safePackageManager) {
        this.f21920a = eVar;
        this.f21921b = function1;
        this.f21922c = str;
        this.f21923d = safePackageManager;
    }

    public final Object a(Context context) throws g {
        IBinder iBinder;
        e eVar;
        if (this.f21923d.resolveService(context, this.f21920a.f21917a, 0) == null) {
            throw new l(a0.u.o(new StringBuilder("could not resolve "), this.f21922c, " services"));
        }
        try {
            eVar = this.f21920a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f21917a, eVar, 1)) {
            e eVar2 = this.f21920a;
            if (eVar2.f21918b == null) {
                synchronized (eVar2.f21919c) {
                    if (eVar2.f21918b == null) {
                        try {
                            eVar2.f21919c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f21918b;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            return this.f21921b.invoke(iBinder);
        }
        throw new g(a0.u.o(new StringBuilder("could not bind to "), this.f21922c, " services"));
    }

    public final void b(Context context) {
        try {
            this.f21920a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, Function1 function1, String str) {
        this(new e(intent, str), function1, str, new SafePackageManager());
    }
}
