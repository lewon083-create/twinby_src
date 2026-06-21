package yads;

import android.content.Context;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f37908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ct1 f37909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37912e;

    public dx1(Context context, v9 v9Var, nu2 nu2Var) {
        this.f37908a = v9Var;
        lu3 lu3Var = (lu3) nu2Var;
        lu3Var.d();
        su3 su3Var = su3.f43085a;
        this.f37909b = cf.a(context, lu3Var.b());
        this.f37910c = true;
        this.f37911d = true;
        this.f37912e = true;
    }

    public final void a(String str) {
        eo2 eo2Var = eo2.f38194c;
        HashMap mapF = kotlin.collections.j0.f(new Pair("event_type", str));
        this.f37909b.a(new go2("multibanner_event", kotlin.collections.j0.m(mapF), this.f37908a.i));
    }
}
