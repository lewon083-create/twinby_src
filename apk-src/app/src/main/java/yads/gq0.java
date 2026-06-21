package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq0 f38847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma2 f38848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f38849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fq0 f38850e;

    public gq0(Handler handler, iw1 iw1Var, dq0 dq0Var, ma2 ma2Var) {
        this.f38846a = iw1Var;
        this.f38847b = dq0Var;
        this.f38848c = ma2Var;
        this.f38849d = handler;
    }

    public /* synthetic */ gq0(iw1 iw1Var, dq0 dq0Var, ma2 ma2Var) {
        this(new Handler(Looper.getMainLooper()), iw1Var, dq0Var, ma2Var);
    }
}
