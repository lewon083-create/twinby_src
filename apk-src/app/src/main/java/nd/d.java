package nd;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f29310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f29311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m4.d f29312e;

    public /* synthetic */ d(f fVar, Runnable runnable, m4.d dVar, int i) {
        this.f29309b = i;
        this.f29310c = fVar;
        this.f29311d = runnable;
        this.f29312e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29309b) {
            case 0:
                ExecutorService executorService = this.f29310c.f29317b;
                final int i = 0;
                final Runnable runnable = this.f29311d;
                final m4.d dVar = this.f29312e;
                executorService.execute(new Runnable() { // from class: nd.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) dVar.f28630b).l(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar.f28630b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) dVar.f28630b;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f29310c.f29317b;
                final int i10 = 2;
                final Runnable runnable2 = this.f29311d;
                final m4.d dVar2 = this.f29312e;
                executorService2.execute(new Runnable() { // from class: nd.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) dVar2.f28630b).l(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar2.f28630b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) dVar2.f28630b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f29310c.f29317b;
                final int i11 = 1;
                final Runnable runnable3 = this.f29311d;
                final m4.d dVar3 = this.f29312e;
                executorService3.execute(new Runnable() { // from class: nd.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) dVar3.f28630b).l(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar3.f28630b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) dVar3.f28630b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
