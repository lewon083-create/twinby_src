package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0109dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0288kg f23690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Aa f23691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0562vg f23692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.g f23693d = ij.h.b(new C0031ag(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ij.g f23694e = ij.h.b(new Yf(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ij.g f23695f = ij.h.b(new C0083cg(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f23696g = new ArrayList();

    public C0109dg(C0288kg c0288kg, C0537ug c0537ug, Aa aa2, C0562vg c0562vg) {
        this.f23690a = c0288kg;
        this.f23691b = aa2;
        this.f23692c = c0562vg;
    }

    public static final Vf a(C0109dg c0109dg) {
        return (Vf) c0109dg.f23693d.getValue();
    }

    public static final void a(C0109dg c0109dg, C0338mg c0338mg, Vf vf) {
        boolean zA;
        c0109dg.f23696g.add(c0338mg);
        C0562vg c0562vg = c0109dg.f23692c;
        if (c0338mg == null) {
            c0562vg.getClass();
        } else {
            SafePackageManager safePackageManager = c0562vg.f24905b;
            Context context = c0562vg.f24904a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = c0338mg.f24375d.ordinal();
            if (iOrdinal == 1) {
                zA = Intrinsics.a(c0562vg.f24909f, installerPackageName);
            } else if (iOrdinal == 2) {
                zA = Intrinsics.a(c0562vg.f24910g, installerPackageName);
            }
            if (zA) {
                c0109dg.a(c0338mg);
                return;
            }
        }
        vf.a();
    }

    public final void a(C0338mg c0338mg) {
        C0288kg c0288kg = this.f23690a;
        synchronized (c0288kg) {
            c0288kg.f24241b = c0338mg;
            c0288kg.f24242c = true;
            c0288kg.f24243d.a(c0338mg);
            c0288kg.f24243d.d();
            c0288kg.a(c0288kg.f24241b);
        }
    }
}
