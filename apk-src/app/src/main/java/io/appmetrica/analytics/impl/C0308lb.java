package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0308lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0172g2 f24289a = new C0172g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0303l6 f24290b = new C0303l6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0644yn f24291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24293e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, Ua ua2) {
        if (this.f24293e) {
            return;
        }
        kotlin.collections.x.n(this.f24290b.f24273a, new Ga[]{this.f24289a.a(context, appMetricaConfig, ua2)});
        this.f24293e = true;
    }

    public final synchronized void b() {
        if (this.f24292d) {
            return;
        }
        C0303l6 c0303l6 = this.f24290b;
        ArrayList arrayList = C0071c4.l().i.f24321a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c0303l6.f24273a.addAll(arrayList2);
        this.f24292d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f24291c != null) {
                return;
            }
            P1 p12 = new P1(this.f24290b);
            this.f24291c = new C0644yn(p12);
            C0619xn c0619xn = new C0619xn();
            c0619xn.f25049a.add(p12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c0619xn.f25049a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c0619xn);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a() {
        this.f24290b.f24273a.clear();
        this.f24292d = false;
        this.f24293e = false;
    }
}
