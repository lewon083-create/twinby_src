package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ep0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38220c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile ep0 f38221d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap0 f38222a = new ap0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yy2 f38223b;

    public final nr a(Context context) {
        yy2 yy2VarA;
        synchronized (f38220c) {
            yy2VarA = this.f38223b;
            if (yy2VarA == null) {
                yy2VarA = this.f38222a.a(context);
                this.f38223b = yy2VarA;
            }
        }
        return yy2VarA;
    }
}
