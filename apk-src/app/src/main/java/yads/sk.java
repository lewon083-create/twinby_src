package yads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qk f42955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42956c;

    public sk(Context context, Handler handler, xn0 xn0Var) {
        this.f42954a = context.getApplicationContext();
        this.f42955b = new qk(this, handler, xn0Var);
    }

    public final void a() {
        if (this.f42956c) {
            this.f42954a.unregisterReceiver(this.f42955b);
            this.f42956c = false;
        }
    }
}
