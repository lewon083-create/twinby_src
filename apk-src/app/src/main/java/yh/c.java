package yh;

import io.flutter.embedding.engine.FlutterEngine;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f45621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f45622b;

    public c(d dVar, FlutterEngine flutterEngine) {
        this.f45622b = dVar;
        this.f45621a = flutterEngine;
    }

    @Override // yh.b
    public final void a() {
        this.f45622b.f45623a.remove(this.f45621a);
    }

    @Override // yh.b
    public final void b() {
    }
}
