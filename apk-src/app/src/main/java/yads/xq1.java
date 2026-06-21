package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f44791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to1 f44792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uq1 f44793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tq1 f44794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io1 f44795e;

    public xq1(Executor executor, to1 to1Var, uq1 uq1Var, tq1 tq1Var, io1 io1Var) {
        this.f44791a = executor;
        this.f44792b = to1Var;
        this.f44793c = uq1Var;
        this.f44794d = tq1Var;
        this.f44795e = io1Var;
    }

    public final void a(Context context, d03 d03Var, sq1 sq1Var, ep epVar, vq1 vq1Var) {
        this.f44792b.a(context, sq1Var, com.monetization.ads.mediation.base.a.class);
        com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) vq1Var;
        b92.a((b92) oVar.f14859c, (CountDownLatch) oVar.f14860d, (ArrayList) oVar.f14861e, (JSONObject) null);
    }

    public /* synthetic */ xq1(zo1 zo1Var) {
        this(pg1.a().a(), new to1(zo1Var), new uq1(), new tq1(zo1Var), new io1());
    }
}
