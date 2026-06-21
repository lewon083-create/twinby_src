package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m90 implements t40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f7820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final na0 f7821e;

    public m90(Map map, Map map2, Map map3, ls1 ls1Var, na0 na0Var) {
        this.f7817a = map;
        this.f7818b = map2;
        this.f7819c = map3;
        this.f7820d = ls1Var;
        this.f7821e = na0Var;
    }

    @Override // com.google.android.gms.internal.ads.t40
    public final zh0 a(int i, String str) {
        zh0 zh0VarA;
        zh0 zh0Var = (zh0) this.f7817a.get(str);
        if (zh0Var != null) {
            return zh0Var;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            dj0 dj0Var = (dj0) this.f7819c.get(str);
            if (dj0Var != null) {
                return new ai0(dj0Var, u5.f10821g);
            }
            zh0VarA = (zh0) this.f7818b.get(str);
            if (zh0VarA == null) {
                return null;
            }
        } else if (this.f7821e.f8254d == null || (zh0VarA = ((t40) this.f7820d.j()).a(i, str)) == null) {
            return null;
        }
        return new ai0(zh0VarA, u5.f10820f);
    }
}
