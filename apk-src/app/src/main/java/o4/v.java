package o4;

import android.os.Handler;
import com.google.android.gms.internal.ads.vs1;
import j3.y0;
import m3.c0;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f29700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s3.t f29701b;

    public v(Handler handler, s3.t tVar, int i) {
        switch (i) {
            case 1:
                this.f29700a = handler;
                this.f29701b = tVar;
                break;
            default:
                if (tVar != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.f29700a = handler;
                this.f29701b = tVar;
                break;
        }
    }

    public void a(vs1 vs1Var) {
        synchronized (vs1Var) {
        }
        Handler handler = this.f29700a;
        if (handler != null) {
            handler.post(new v0(9, this, vs1Var));
        }
    }

    public void b(y0 y0Var) {
        Handler handler = this.f29700a;
        if (handler != null) {
            handler.post(new c0(10, this, y0Var));
        }
    }
}
