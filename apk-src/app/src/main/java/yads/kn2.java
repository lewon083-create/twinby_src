package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5 f40290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pn2 f40291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn2 f40292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jn2 f40293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hn2 f40294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40295f;

    public /* synthetic */ kn2(Context context, e9 e9Var, v9 v9Var, d4 d4Var, nu2 nu2Var, va vaVar, f5 f5Var, pn2 pn2Var, mn2 mn2Var, List list) {
        this(e9Var, f5Var, pn2Var, mn2Var, new jn2(context, v9Var, d4Var, nu2Var, vaVar, list));
    }

    public kn2(e9 e9Var, f5 f5Var, pn2 pn2Var, mn2 mn2Var, jn2 jn2Var) {
        this.f40290a = f5Var;
        this.f40291b = pn2Var;
        this.f40292c = mn2Var;
        this.f40293d = jn2Var;
        this.f40294e = new hn2(e9Var, this);
    }
}
