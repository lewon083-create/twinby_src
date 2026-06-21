package io.sentry.android.core.internal.util;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AndroidConnectionStatusProvider f25915c;

    public /* synthetic */ a(AndroidConnectionStatusProvider androidConnectionStatusProvider, int i) {
        this.f25914b = i;
        this.f25915c = androidConnectionStatusProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25914b) {
            case 0:
                this.f25915c.lambda$onBackground$3();
                break;
            case 1:
                this.f25915c.lambda$close$1();
                break;
            case 2:
                this.f25915c.lambda$onForeground$2();
                break;
            default:
                this.f25915c.lambda$new$0();
                break;
        }
    }
}
