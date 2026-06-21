package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh1 f45401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gw2 f45402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f45403c;

    public /* synthetic */ zg(Context context) {
        this(context, new uh1(), fw2.a());
    }

    public final boolean a() {
        uh1 uh1Var = this.f45401a;
        Context context = this.f45403c;
        uh1Var.getClass();
        Boolean bool = (Boolean) uh1.a(context, vh1.i.f44042b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean b() {
        pt2 pt2VarA = this.f45402b.a(this.f45403c);
        boolean z5 = pt2VarA != null && pt2VarA.f42048q0;
        uh1 uh1Var = this.f45401a;
        Context context = this.f45403c;
        uh1Var.getClass();
        Boolean bool = (Boolean) uh1.a(context, vh1.f44039h.f44042b);
        return a() && !z5 && (bool != null ? bool.booleanValue() : true);
    }

    public final boolean c() {
        pt2 pt2VarA = this.f45402b.a(this.f45403c);
        return a() && (pt2VarA != null && pt2VarA.I);
    }

    public zg(Context context, uh1 uh1Var, gw2 gw2Var) {
        this.f45401a = uh1Var;
        this.f45402b = gw2Var;
        this.f45403c = uz.a(context);
    }
}
