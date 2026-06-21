package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mg0 implements ng0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r81 f7887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p70 f7888c;

    public mg0(Map map, r81 r81Var, p70 p70Var) {
        this.f7886a = map;
        this.f7887b = r81Var;
        this.f7888c = p70Var;
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final ed.d c(ku kuVar) {
        this.f7888c.E(kuVar);
        f71 f71VarY = vv.y(new uf0(3));
        for (String str : ((String) q9.s.f31967e.f31970c.a(al.f3138o9)).split(StringUtils.COMMA)) {
            qs1 qs1Var = (qs1) this.f7886a.get(str.trim());
            if (qs1Var != null) {
                f71VarY = vv.H(f71VarY, uf0.class, new zq(7, qs1Var, kuVar), this.f7887b);
            }
        }
        f71VarY.a(new l81(0, f71VarY, new gk0(23, this)), hx.f6285g);
        return f71VarY;
    }
}
