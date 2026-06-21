package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0314lh extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0486sf f24306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wo f24307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f24308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeProvider f24309e;

    public C0314lh(@NonNull Y4 y42) {
        this(y42, y42.u(), C0382oa.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        Y4 y42 = this.f22888a;
        if (this.f24307c.d()) {
            return false;
        }
        Q5 q5A = ((C0264jh) y42.f23291k.a()).f24155e ? Q5.a(q5, EnumC0078cb.EVENT_TYPE_APP_UPDATE) : Q5.a(q5, EnumC0078cb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f24308d.getInstallerPackageName(y42.f23282a, y42.f23283b.f22909a), ""));
            C0486sf c0486sf = this.f24306b;
            c0486sf.f22882h.a(c0486sf.f22875a);
            jSONObject.put("preloadInfo", ((C0412pf) c0486sf.c()).b());
        } catch (Throwable unused) {
        }
        q5A.setValue(jSONObject.toString());
        C0306l9 c0306l9 = y42.f23294n;
        c0306l9.a(q5A, Qk.a(c0306l9.f24280c.b(q5A), q5A.i));
        wo woVar = this.f24307c;
        synchronized (woVar) {
            xo xoVar = woVar.f24991a;
            xoVar.a(xoVar.a().put("init_event_done", true));
        }
        this.f24307c.a(this.f24309e.currentTimeMillis());
        return false;
    }

    public C0314lh(Y4 y42, wo woVar, C0486sf c0486sf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(y42);
        this.f24307c = woVar;
        this.f24306b = c0486sf;
        this.f24308d = safePackageManager;
        this.f24309e = systemTimeProvider;
    }
}
