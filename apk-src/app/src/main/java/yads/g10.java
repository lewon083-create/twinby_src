package yads;

import android.content.Context;
import hk.c1;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu2 f38614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f38615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hk.a0 f38616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q02 f38617d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g10(Context context, lu3 lu3Var) {
        e00 e00Var = e00.f37945g;
        Context applicationContext = context.getApplicationContext();
        this(lu3Var, applicationContext, z10.a(lu3Var.a()), new q02(applicationContext, lu3Var, e00Var));
    }

    public final void a() {
        q02 q02Var = this.f38617d;
        Iterator it = q02Var.f42129d.iterator();
        while (it.hasNext()) {
            o02 o02Var = ((r02) it.next()).f42438b;
            c1 c1Var = (c1) o02Var.f45475k.f37513c.e().get(hk.b1.f20637b);
            if (c1Var != null) {
                hk.j1 block = new hk.j1((hk.k1) c1Var, null);
                Intrinsics.checkNotNullParameter(block, "block");
                Intrinsics.checkNotNullParameter(block, "block");
                ek.k kVar = new ek.k();
                kVar.f16416e = nj.f.a(block, kVar, kVar);
                while (kVar.hasNext()) {
                    ((c1) kVar.next()).a(null);
                }
            }
            o4 o4Var = o02Var.f45481q;
            zo2 zo2Var = o4Var.f41457a;
            String str = o4Var.f41458b;
            zo2Var.getClass();
            zo2.a(str);
            o02Var.f41423x.f44559b.removeCallbacksAndMessages(null);
            o02Var.A.a(ke1.f40176b, o02Var);
            o02Var.a(z5.f45250b);
            o02Var.B.a();
        }
        q02Var.f42129d.clear();
        hk.c0.d(this.f38616c);
    }

    public g10(lu3 lu3Var, Context context, hk.a0 a0Var, q02 q02Var) {
        this.f38614a = lu3Var;
        this.f38615b = context;
        this.f38616c = a0Var;
        this.f38617d = q02Var;
    }
}
