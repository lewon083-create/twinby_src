package od;

import aj.i;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import r2.c;
import r2.d;
import s2.j;
import s2.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f30634c;

    public /* synthetic */ a(b bVar, int i) {
        this.f30633b = i;
        this.f30634c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30633b) {
            case 0:
                p2.b ex = (p2.b) obj;
                Intrinsics.checkNotNullParameter(ex, "ex");
                Log.w(g0.a(b.class).d(), "CorruptionException in " + this.f30634c.f30636a + " DataStore running in process " + Process.myPid(), ex);
                return new t2.b(true);
            default:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "it");
                String sharedPreferencesName = this.f30634c.f30636a;
                LinkedHashSet keysToMigrate = k.f32429a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
                Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
                return r.c(new c(context, sharedPreferencesName, d.f32184a, new i(keysToMigrate, null, 6), new j(3, null)));
        }
    }
}
