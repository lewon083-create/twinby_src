package yads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class za {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f45298d = Executors.newCachedThreadPool(new gy1(gy1.f38941b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f45299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f45300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f45301c;

    public za(Context context, nu2 nu2Var, d4 d4Var) {
        this.f45299a = d4Var;
        this.f45300b = nu2Var;
        this.f45301c = context.getApplicationContext();
    }

    public static void a(za zaVar, String str, n83 n83Var) {
        kotlin.collections.c0 c0VarD = kotlin.collections.j0.d();
        fd2 fd2Var = new fd2(zaVar.f45301c, zaVar.f45299a, zaVar.f45300b, n83Var);
        if (str.length() > 0) {
            f45298d.execute(new ya(str, fd2Var, c0VarD));
        }
    }
}
