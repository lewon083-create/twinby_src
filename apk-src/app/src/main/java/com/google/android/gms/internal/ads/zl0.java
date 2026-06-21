package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f13036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t9.e0 f13039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h50 f13041g;

    public zl0(Context context, Bundle bundle, String str, String str2, t9.e0 e0Var, String str3, h50 h50Var) {
        this.f13035a = context;
        this.f13036b = bundle;
        this.f13037c = str;
        this.f13038d = str2;
        this.f13039e = e0Var;
        this.f13040f = str3;
        this.f13041g = h50Var;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        bundle.putBundle("quality_signals", this.f13036b);
        bundle.putString("seq_num", this.f13037c);
        if (!this.f13039e.t()) {
            bundle.putString("session_id", this.f13038d);
        }
        bundle.putBoolean("client_purpose_one", !r0.t());
        b(bundle);
        String str = this.f13040f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            h50 h50Var = this.f13041g;
            Long l10 = (Long) h50Var.f6030d.get(str);
            bundle2.putLong("dload", l10 == null ? -1L : l10.longValue());
            Integer num = (Integer) h50Var.f6028b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Xa)).booleanValue()) {
            p9.k kVar = p9.k.C;
            if (kVar.f31302h.f3950l.get() > 0) {
                bundle.putInt("nrwv", kVar.f31302h.f3950l.get());
            }
        }
    }

    public final void b(Bundle bundle) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3239v6)).booleanValue()) {
            try {
                t9.g0 g0Var = p9.k.C.f31297c;
                bundle.putString("_app_id", t9.g0.O(this.f13035a));
            } catch (RemoteException | RuntimeException e3) {
                p9.k.C.f31302h.d("AppStatsSignal_AppId", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        Bundle bundle = ((w50) obj).f11647b;
        bundle.putBundle("quality_signals", this.f13036b);
        b(bundle);
    }
}
