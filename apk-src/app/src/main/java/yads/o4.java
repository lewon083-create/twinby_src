package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo2 f41457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f41459c;

    public /* synthetic */ o4(Context context) {
        this(context, yo2.a());
    }

    public final void a(pn pnVar) {
        pnVar.f42672q = this.f41458b;
        zo2 zo2Var = this.f41457a;
        Context context = this.f41459c;
        synchronized (zo2Var) {
            u82.a(context).a(pnVar);
        }
    }

    public o4(Context context, zo2 zo2Var) {
        this.f41457a = zo2Var;
        this.f41458b = tb.a(this);
        this.f41459c = context.getApplicationContext();
    }
}
