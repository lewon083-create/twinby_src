package s7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import l7.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f32784h = n.i("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bj.g f32785g;

    public c(Context context, x7.a aVar) {
        super(context, aVar);
        this.f32785g = new bj.g(9, this);
    }

    @Override // s7.d
    public final void d() {
        n.g().e(f32784h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f32788b.registerReceiver(this.f32785g, f());
    }

    @Override // s7.d
    public final void e() {
        n.g().e(f32784h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f32788b.unregisterReceiver(this.f32785g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
