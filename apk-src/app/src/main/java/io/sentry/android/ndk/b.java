package io.sentry.android.ndk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NdkScopeObserver f25971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25972d;

    public /* synthetic */ b(NdkScopeObserver ndkScopeObserver, String str, int i) {
        this.f25970b = i;
        this.f25971c = ndkScopeObserver;
        this.f25972d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25970b) {
            case 0:
                this.f25971c.lambda$removeTag$3(this.f25972d);
                break;
            case 1:
                this.f25971c.lambda$removeExtra$5(this.f25972d);
                break;
            default:
                this.f25971c.lambda$addAttachment$7(this.f25972d);
                break;
        }
    }
}
