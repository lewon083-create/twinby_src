package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jn0 implements pn0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final pm0 f6889k = new pm0(new JSONArray().toString(), "", new Bundle());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r81 f6890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f6891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk0 f6892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f6893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final iq0 f6894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jk0 f6895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gd0 f6896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0 f6897h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6898j;

    public jn0(r81 r81Var, ScheduledExecutorService scheduledExecutorService, String str, lk0 lk0Var, Context context, iq0 iq0Var, jk0 jk0Var, gd0 gd0Var, te0 te0Var, int i) {
        this.f6890a = r81Var;
        this.f6891b = scheduledExecutorService;
        this.f6898j = str;
        this.f6892c = lk0Var;
        this.f6893d = context;
        this.f6894e = iq0Var;
        this.f6895f = jk0Var;
        this.f6896g = gd0Var;
        this.f6897h = te0Var;
        this.i = i;
    }

    public final void a(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ok0 ok0Var = (ok0) ((Map.Entry) it.next()).getValue();
            String str = ok0Var.f8712a;
            Bundle bundle = this.f6894e.f6572d.f31812n;
            arrayList.add(b(str, Collections.singletonList(ok0Var.f8716e), bundle != null ? bundle.getBundle(str) : null, ok0Var.f8713b, ok0Var.f8714c));
        }
    }

    public final i81 b(String str, List list, Bundle bundle, boolean z5, boolean z10) {
        gn0 gn0Var = new gn0(this, str, list, bundle, z5, z10);
        r81 r81Var = this.f6890a;
        i81 i81VarS = i81.s(vv.E(gn0Var, r81Var));
        wk wkVar = al.W1;
        q9.s sVar = q9.s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            i81VarS = (i81) vv.I(i81VarS, ((Long) sVar.f31970c.a(al.P1)).longValue(), TimeUnit.MILLISECONDS, this.f6891b);
        }
        return vv.G(i81VarS, Throwable.class, new ro(str, 3), r81Var);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        int i = this.i;
        pm0 pm0Var = f6889k;
        if (i == 2) {
            return vv.d(pm0Var);
        }
        iq0 iq0Var = this.f6894e;
        if (iq0Var.f6586s) {
            if (!Arrays.asList(((String) q9.s.f31967e.f31970c.a(al.f2951c2)).split(StringUtils.COMMA)).contains(hl.l.w(hl.l.x(iq0Var.f6572d)))) {
                return vv.d(pm0Var);
            }
        }
        return vv.E(new in0(0, this), this.f6890a);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        return 32;
    }
}
