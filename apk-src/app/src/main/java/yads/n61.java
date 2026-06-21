package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o61 f41178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f41179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl3 f41180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qc1 f41181d;

    public n61(o61 o61Var, Handler handler, xl3 xl3Var, qc1 qc1Var) {
        this.f41178a = o61Var;
        this.f41179b = handler;
        this.f41180c = xl3Var;
        this.f41181d = qc1Var;
    }

    public /* synthetic */ n61(l52 l52Var, List list) {
        this(new o61(), new Handler(Looper.getMainLooper()), new xl3(), rc1.a(l52Var, list));
    }
}
