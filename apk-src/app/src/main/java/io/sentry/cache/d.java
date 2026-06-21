package io.sentry.cache;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PersistingScopeObserver f26013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f26014d;

    public /* synthetic */ d(PersistingScopeObserver persistingScopeObserver, Map map, int i) {
        this.f26012b = i;
        this.f26013c = persistingScopeObserver;
        this.f26014d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26012b) {
            case 0:
                this.f26013c.lambda$setExtras$5(this.f26014d);
                break;
            default:
                this.f26013c.lambda$setTags$4(this.f26014d);
                break;
        }
    }
}
