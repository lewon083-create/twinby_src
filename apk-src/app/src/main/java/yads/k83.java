package yads;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k83 implements l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f40103d = {wb.a(k83.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q32 f40104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f40105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nm2 f40106c;

    public k83(Activity activity, q32 q32Var, w0 w0Var) {
        this.f40104a = q32Var;
        this.f40105b = w0Var;
        this.f40106c = om2.a(activity);
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        nm2 nm2Var = this.f40106c;
        dk.i iVar = f40103d[0];
        Context context = (Context) nm2Var.f41294a.get();
        if (context == null || !context.equals(activity)) {
            return;
        }
        this.f40104a.f42161a.h();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        nm2 nm2Var = this.f40106c;
        dk.i iVar = f40103d[0];
        Context context = (Context) nm2Var.f41294a.get();
        if (context == null || !context.equals(activity)) {
            return;
        }
        this.f40104a.f42161a.g();
    }
}
