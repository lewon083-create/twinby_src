package ij;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends b implements mj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk.l f21328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Unit f21329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mj.a f21330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f21331e;

    @Override // mj.a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f27499b;
    }

    @Override // mj.a
    public final void resumeWith(Object obj) {
        this.f21330d = null;
        this.f21331e = obj;
    }
}
