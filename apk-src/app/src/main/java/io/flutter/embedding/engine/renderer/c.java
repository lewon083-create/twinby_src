package io.flutter.embedding.engine.renderer;

import io.flutter.view.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f25572c;

    public /* synthetic */ c(o oVar, int i) {
        this.f25571b = i;
        this.f25572c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25571b) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f25572c).lambda$dequeueImage$0();
                break;
            default:
                ((h) this.f25572c).getClass();
                break;
        }
    }
}
