package x0;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f35684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f35685b;

    public x(h hVar, Context context) {
        this.f35685b = hVar;
        this.f35684a = context;
    }

    @Override // x0.z
    public final a1.g a(a1.n nVar, Executor executor) {
        return new a1.g(nVar, executor, this.f35684a);
    }
}
