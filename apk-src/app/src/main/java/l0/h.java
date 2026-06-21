package l0;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27740b;

    public /* synthetic */ h(int i, Object obj) {
        this.f27739a = i;
        this.f27740b = obj;
    }

    public final void a() {
        switch (this.f27739a) {
            case 0:
                i iVar = (i) this.f27740b;
                synchronized (iVar.f27742b) {
                    try {
                        if (iVar.f27744d == null) {
                            com.google.android.gms.internal.auth.g.O("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        iVar.c();
                        Unit unit = Unit.f27471a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                j1.h hVar = (j1.h) this.f27740b;
                com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                hVar.b(null);
                return;
        }
    }
}
