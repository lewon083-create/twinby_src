package l0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f27741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f27742b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f27744d;

    public i(i iVar) {
        this.f27741a = iVar;
    }

    public final void a(long j10, h screenFlashListener) {
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.f27742b) {
            this.f27743c = true;
            this.f27744d = screenFlashListener;
            Unit unit = Unit.f27471a;
        }
        i iVar = this.f27741a;
        if (iVar != null) {
            iVar.a(j10, new h(0, this));
        } else {
            com.google.android.gms.internal.auth.g.k("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        synchronized (this.f27742b) {
            try {
                if (this.f27743c) {
                    i iVar = this.f27741a;
                    if (iVar != null) {
                        iVar.b();
                    } else {
                        com.google.android.gms.internal.auth.g.k("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    com.google.android.gms.internal.auth.g.O("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f27743c = false;
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f27742b) {
            try {
                h hVar = this.f27744d;
                if (hVar != null) {
                    hVar.a();
                }
                this.f27744d = null;
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
