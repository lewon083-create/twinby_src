package ri;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f32350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugins.firebase.messaging.a f32352c;

    public h(io.flutter.plugins.firebase.messaging.a aVar, Intent intent, int i) {
        this.f32352c = aVar;
        this.f32350a = intent;
        this.f32351b = i;
    }

    @Override // ri.i
    public final void a() {
        this.f32352c.stopSelf(this.f32351b);
    }

    @Override // ri.i
    public final Intent getIntent() {
        return this.f32350a;
    }
}
