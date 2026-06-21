package io.sentry.android.ndk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NdkScopeObserver f25967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f25969e;

    public /* synthetic */ a(NdkScopeObserver ndkScopeObserver, String str, String str2, int i) {
        this.f25966b = i;
        this.f25967c = ndkScopeObserver;
        this.f25968d = str;
        this.f25969e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25966b) {
            case 0:
                this.f25967c.lambda$setExtra$4(this.f25968d, this.f25969e);
                break;
            default:
                this.f25967c.lambda$setTag$2(this.f25968d, this.f25969e);
                break;
        }
    }
}
