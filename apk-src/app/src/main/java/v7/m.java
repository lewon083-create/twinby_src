package v7;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.a f34787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7.a f34788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.c f34789c;

    static {
        l7.n.i("WMFgUpdater");
    }

    public m(WorkDatabase workDatabase, m7.c cVar, x7.b bVar) {
        this.f34788b = cVar;
        this.f34787a = bVar;
        this.f34789c = workDatabase.n();
    }
}
