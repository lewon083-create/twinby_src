package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9 f39254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kn2 f39255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f39256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39257d;

    public hn2(e9 e9Var, kn2 kn2Var) {
        this(e9Var, kn2Var, new Handler(Looper.getMainLooper()));
    }

    public hn2(e9 e9Var, kn2 kn2Var, Handler handler) {
        this.f39254a = e9Var;
        this.f39255b = kn2Var;
        this.f39256c = handler;
    }
}
