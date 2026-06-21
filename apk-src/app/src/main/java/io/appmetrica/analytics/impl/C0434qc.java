package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0434qc extends Y4 implements Na, Ma {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0288kg f24629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0388og f24630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final F6 f24631y;

    public C0434qc(@NonNull Context context, @NonNull C0140em c0140em, @NonNull R4 r42, @NonNull C0401p4 c0401p4, @NonNull C0288kg c0288kg, @NonNull F6 f62, @NonNull W4 w42) {
        this(context, r42, c0401p4, new C0272k0(), new TimePassedChecker(), new C0483sc(context, r42, c0401p4, w42, c0140em, new C0309lc(f62), C0382oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0382oa.k().w(), C0382oa.k().l(), new C0156fc()), c0288kg, f62);
    }

    @Override // io.appmetrica.analytics.impl.Y4
    public final void C() {
        this.f24629w.a(this.f24630x);
    }

    public final boolean D() {
        boolean zOptBoolean;
        wo woVar = this.f23300t;
        synchronized (woVar) {
            zOptBoolean = woVar.f24991a.a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public final synchronized void a(@NonNull C0401p4 c0401p4) {
        super.a(c0401p4);
        this.f24631y.a(c0401p4.i);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a() {
        wo woVar = this.f23300t;
        synchronized (woVar) {
            xo xoVar = woVar.f24991a;
            xoVar.a(xoVar.a().put("referrer_handled", true));
        }
    }

    public C0434qc(Context context, R4 r42, C0401p4 c0401p4, C0272k0 c0272k0, TimePassedChecker timePassedChecker, C0483sc c0483sc, C0288kg c0288kg, F6 f62) {
        super(context, r42, c0272k0, timePassedChecker, c0483sc, c0401p4);
        this.f24629w = c0288kg;
        Y8 y8K = k();
        y8K.a(EnumC0078cb.EVENT_TYPE_REGULAR, new Gg(y8K.b()));
        this.f24630x = c0483sc.a(this);
        this.f24631y = f62;
        C0382oa.k().x().onMainReporterCreated(new C0541uk(this, c0401p4));
    }
}
