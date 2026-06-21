package od;

import android.content.Context;
import com.google.android.gms.internal.auth.m;
import dk.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g0;
import m4.d;
import p2.h;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f30635d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f30637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f30638c;

    static {
        b0 b0Var = new b0(e.NO_RECEIVER, b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        g0.f27511a.getClass();
        f30635d = new i[]{b0Var};
    }

    public b(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f30636a = name;
        this.f30637b = new ThreadLocal();
        a produceNewData = new a(this, 0);
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        d dVar = new d();
        dVar.f28630b = produceNewData;
        this.f30638c = (h) m.s(name, dVar, new a(this, 1), 8).getValue(context, f30635d[0]);
    }

    public final void a(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
    }
}
