package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qk extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rk f42325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f42326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk f42327d;

    public qk(sk skVar, Handler handler, xn0 xn0Var) {
        this.f42327d = skVar;
        this.f42326c = handler;
        this.f42325b = xn0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f42326c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f42327d.f42956c) {
            ((xn0) this.f42325b).f44771a.a(-1, 3, false);
        }
    }
}
