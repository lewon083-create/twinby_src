package p2;

import com.google.android.gms.internal.ads.cx0;
import hk.s1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements kotlin.coroutines.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f30981b = new i();

    public static e0 a(s0 serializer, mk.c scope, Function0 produceFile, int i) {
        kotlin.collections.b0 migrations = kotlin.collections.b0.f27475b;
        if ((i & 8) != 0) {
            ok.e eVar = hk.k0.f20682a;
            ok.d dVar = ok.d.f30722d;
            s1 s1Var = new s1();
            dVar.getClass();
            scope = hk.c0.a(kotlin.coroutines.e.d(dVar, s1Var));
        }
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        i0 storage = new i0(serializer, produceFile);
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        ob.a0 a0Var = new ob.a0(24);
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new e0(storage, kotlin.collections.r.c(new cx0(migrations, (mj.a) null, 9)), a0Var, scope);
    }
}
