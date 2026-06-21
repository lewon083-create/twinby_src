package io.sentry.flutter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SentryFlutterReplayRecorder f26023c;

    public /* synthetic */ a(SentryFlutterReplayRecorder sentryFlutterReplayRecorder, int i) {
        this.f26022b = i;
        this.f26023c = sentryFlutterReplayRecorder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26022b) {
            case 0:
                SentryFlutterReplayRecorder.start$lambda$1(this.f26023c);
                break;
            case 1:
                SentryFlutterReplayRecorder.pause$lambda$5(this.f26023c);
                break;
            case 2:
                SentryFlutterReplayRecorder.stop$lambda$6(this.f26023c);
                break;
            case 3:
                SentryFlutterReplayRecorder.resume$lambda$2(this.f26023c);
                break;
            default:
                SentryFlutterReplayRecorder.reset$lambda$4(this.f26023c);
                break;
        }
    }
}
