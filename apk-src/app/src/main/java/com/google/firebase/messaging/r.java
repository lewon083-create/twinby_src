package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements md.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md.q f14867c;

    public /* synthetic */ r(md.q qVar, int i) {
        this.f14866b = i;
        this.f14867c = qVar;
    }

    @Override // md.e
    public final Object l(q9.o oVar) {
        switch (this.f14866b) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f14867c, oVar);
            case 1:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f14867c, oVar);
            default:
                return new wd.c((Context) oVar.a(Context.class), ((fd.g) oVar.a(fd.g.class)).g(), oVar.e(md.q.a(wd.d.class)), oVar.d(fe.b.class), (Executor) oVar.b(this.f14867c));
        }
    }
}
