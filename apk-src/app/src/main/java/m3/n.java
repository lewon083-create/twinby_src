package m3;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f28576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f28577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f28578c;

    public n(o oVar, m4.g gVar, Executor executor) {
        this.f28578c = oVar;
        this.f28576a = new WeakReference(gVar);
        this.f28577b = executor;
    }
}
