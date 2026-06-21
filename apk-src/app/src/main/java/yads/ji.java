package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f39870a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile hi f39871b;

    public static void a(Context context, ct1 ct1Var) {
        y10 y10Var = new y10(ct1Var);
        hk.s1 s1Var = new hk.s1();
        ok.e eVar = hk.k0.f20682a;
        mk.c cVarA = hk.c0.a(kotlin.coroutines.e.d(s1Var, ok.d.f30722d).plus(y10Var));
        if (f39870a.getAndSet(true)) {
            return;
        }
        hk.c0.m(cVarA, null, new ii(context, ct1Var, cVarA, null), 3);
    }
}
