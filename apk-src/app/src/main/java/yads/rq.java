package yads;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu2 f42695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ko2 f42696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qq f42697c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rq(nu2 nu2Var) {
        lu3 lu3Var = (lu3) nu2Var;
        this(nu2Var, lu3Var.a(), new qq(lu3Var.c()));
    }

    public final boolean a(Context context, v9 v9Var, z9 z9Var, d4 d4Var, String str) {
        z1 z1VarA = y1.a();
        long jA = z21.a();
        Intent intentA = this.f42697c.a(context, str, jA);
        z1VarA.a(jA, new x1(v9Var, d4Var, z9Var, this.f42695a, null, 0, null, 112));
        try {
            context.startActivity(intentA);
            return true;
        } catch (Exception e3) {
            z1VarA.a(jA);
            e3.toString();
            this.f42696b.reportError("Failed to show Browser", e3);
            return false;
        }
    }

    public rq(nu2 nu2Var, ko2 ko2Var, qq qqVar) {
        this.f42695a = nu2Var;
        this.f42696b = ko2Var;
        this.f42697c = qqVar;
    }
}
