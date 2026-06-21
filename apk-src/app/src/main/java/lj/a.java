package lj;

import kotlin.jvm.functions.Function0;
import r3.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28129b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28130c;

    public a(Function0 function0) {
        this.f28130c = function0;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f28129b) {
            case 0:
                ((Function0) this.f28130c).invoke();
                return;
            default:
                do {
                    try {
                    } catch (InterruptedException e3) {
                        throw new IllegalStateException(e3);
                    }
                    break;
                } while (((g) this.f28130c).j());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f28130c = gVar;
    }
}
