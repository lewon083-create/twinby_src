package yads;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f44634e = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f44635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vm0 f44636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa2 f44637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f44638d;

    public xc(Dialog dialog, kd kdVar, vm0 vm0Var, qa2 qa2Var, Handler handler) {
        this.f44635a = dialog;
        this.f44636b = vm0Var;
        this.f44637c = qa2Var;
        this.f44638d = handler;
    }
}
