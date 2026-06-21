package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class M1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static B1 f22642d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A1 f22644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BinderC0647z1 f22645c;

    public M1(@NotNull Context context, @NotNull A1 a12) {
        this.f22643a = context;
        this.f22644b = a12;
    }

    public final void b() {
        C0382oa.a(this.f22643a);
        PublicLogger.Companion.init(this.f22643a);
        Context context = this.f22643a;
        A1 a12 = this.f22644b;
        if (f22642d == null) {
            C1 c12 = new C1(context, a12, new C0123e5(context));
            C0113dk c0113dk = C0382oa.I.f24510v;
            F1 f12 = new F1(c12);
            LinkedHashMap linkedHashMap = c0113dk.f23704a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(f12);
            f22642d = c12;
        }
        B1 b12 = f22642d;
        if (b12 != null) {
            this.f22645c = new BinderC0647z1(b12);
            C0382oa c0382oa = C0382oa.I;
            c0382oa.f24495f = new C0316lj(c0382oa.f24490a, new C0341mj(b12));
            ((C1) b12).onCreate();
        }
    }

    public final boolean c(@NotNull Intent intent) {
        B1 b12 = f22642d;
        if (b12 != null) {
            ((C1) b12).b(intent);
        }
        String action = intent.getAction();
        return (action == null || !kotlin.text.a0.n(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) && intent.getData() == null;
    }

    public final void d() {
        f22642d = null;
    }

    public final void a(@NotNull Intent intent, int i) {
        B1 b12 = f22642d;
        if (b12 != null) {
            ((C0521u0) ((C1) b12).f22178c).f24822a.stopSelf(i);
        }
    }

    public final void c() {
        B1 b12 = f22642d;
        if (b12 != null) {
            ((C1) b12).onDestroy();
        }
    }

    public final int a(@NotNull Intent intent, int i, int i10) {
        B1 b12 = f22642d;
        if (b12 == null) {
            return 2;
        }
        ((C0521u0) ((C1) b12).f22178c).f24822a.stopSelf(i10);
        return 2;
    }

    @NotNull
    public final IBinder a(@NotNull Intent intent) {
        B1 b12 = f22642d;
        if (b12 != null) {
            ((C1) b12).a(intent);
        }
        String action = intent.getAction();
        if (action != null && kotlin.text.a0.n(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) {
            return new Bo();
        }
        BinderC0647z1 binderC0647z1 = this.f22645c;
        if (binderC0647z1 != null) {
            return binderC0647z1;
        }
        Intrinsics.g("coreBinder");
        throw null;
    }

    public final void a(@NotNull Configuration configuration) {
        if (f22642d != null) {
            C0382oa.I.v().a(configuration);
        }
    }

    public final void b(@NotNull Intent intent) {
        B1 b12 = f22642d;
        if (b12 != null) {
            ((C1) b12).c(intent);
        }
    }
}
