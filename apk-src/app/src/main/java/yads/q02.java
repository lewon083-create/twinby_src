package yads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q02 implements s02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f42127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e00 f42128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f42129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final th1 f42130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c10 f42131f;

    public /* synthetic */ q02(Context context, lu3 lu3Var, e00 e00Var) {
        this(context, lu3Var, e00Var, new CopyOnWriteArrayList(), new th1(context), null, null, null);
    }

    public q02(Context context, lu3 lu3Var, e00 e00Var, List list, th1 th1Var, c10 c10Var, yt3 yt3Var, qu3 qu3Var) {
        this.f42126a = context;
        this.f42127b = lu3Var;
        this.f42128c = e00Var;
        this.f42129d = list;
        this.f42130e = th1Var;
        this.f42131f = c10Var;
        th1Var.a();
    }
}
