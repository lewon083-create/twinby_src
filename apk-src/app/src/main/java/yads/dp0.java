package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f37872c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile dp0 f37873d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo0 f37874a = new zo0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q3.s f37875b;

    public final q3.b a(Context context) {
        q3.s sVarA;
        synchronized (f37872c) {
            sVarA = this.f37875b;
            if (sVarA == null) {
                sVarA = this.f37874a.a(context);
                this.f37875b = sVarA;
            }
        }
        return sVarA;
    }
}
