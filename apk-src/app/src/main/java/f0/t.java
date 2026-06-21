package f0;

import com.google.firebase.messaging.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f16559c;

    public /* synthetic */ t(f fVar) {
        this.f16558b = 2;
        this.f16559c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16558b) {
            case 0:
                this.f16559c.getClass();
                throw null;
            case 1:
                y yVar = this.f16559c.f16498d;
                return;
            default:
                y yVar2 = this.f16559c.f16498d;
                return;
        }
    }

    public /* synthetic */ t(f fVar, Object obj, int i) {
        this.f16558b = i;
        this.f16559c = fVar;
    }
}
