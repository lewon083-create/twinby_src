package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kl extends q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7250a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7251b = Arrays.asList(((String) q9.s.f31967e.f31970c.a(al.f3004fb)).split(StringUtils.COMMA));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ll f7252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.a f7253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wd0 f7254e;

    public kl(ll llVar, q.a aVar, wd0 wd0Var) {
        this.f7253d = aVar;
        this.f7252c = llVar;
        this.f7254e = wd0Var;
    }

    @Override // q.a
    public final void a(Bundle bundle, String str) {
        q.a aVar = this.f7253d;
        if (aVar != null) {
            aVar.a(bundle, str);
        }
    }

    @Override // q.a
    public final Bundle b(Bundle bundle, String str) {
        q.a aVar = this.f7253d;
        if (aVar != null) {
            return aVar.b(bundle, str);
        }
        return null;
    }

    @Override // q.a
    public final void c(int i, int i10, Bundle bundle) {
        q.a aVar = this.f7253d;
        if (aVar != null) {
            aVar.c(i, i10, bundle);
        }
    }

    @Override // q.a
    public final void d(Bundle bundle) {
        this.f7250a.set(false);
        q.a aVar = this.f7253d;
        if (aVar != null) {
            aVar.d(bundle);
        }
    }

    @Override // q.a
    public final void e(int i, Bundle bundle) {
        this.f7250a.set(false);
        q.a aVar = this.f7253d;
        if (aVar != null) {
            aVar.e(i, bundle);
        }
        p9.k kVar = p9.k.C;
        kVar.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ll llVar = this.f7252c;
        llVar.f7566j = jCurrentTimeMillis;
        List list = this.f7251b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        kVar.f31304k.getClass();
        llVar.i = SystemClock.elapsedRealtime() + ((long) ((Integer) q9.s.f31967e.f31970c.a(al.f2958cb)).intValue());
        if (llVar.f7562e == null) {
            llVar.f7562e = new s(14, llVar);
        }
        llVar.d();
        hl.l.z(this.f7254e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // q.a
    public final void f(Bundle bundle, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f7250a.set(true);
                hl.l.z(this.f7254e, "pact_action", new Pair("pe", "pact_con"));
                this.f7252c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e3) {
            t9.c0.n("Message is not in JSON format: ", e3);
        }
        q.a aVar = this.f7253d;
        if (aVar != null) {
            aVar.f(bundle, str);
        }
    }

    @Override // q.a
    public final void g(int i, Uri uri, boolean z5, Bundle bundle) {
        q.a aVar = this.f7253d;
        if (aVar != null) {
            aVar.g(i, uri, z5, bundle);
        }
    }
}
