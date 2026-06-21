package a1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f325b;

    public /* synthetic */ f(g gVar) {
        this.f325b = gVar;
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        com.google.android.gms.internal.auth.g.e("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f325b.hashCode())));
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.auth.g.e("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f325b.hashCode())));
    }
}
