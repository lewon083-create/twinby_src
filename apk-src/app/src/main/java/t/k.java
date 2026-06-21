package t;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f33135c;

    public /* synthetic */ k(o oVar, int i) {
        this.f33134b = i;
        this.f33135c = oVar;
    }

    @Override // j1.i
    public final Object m(final j1.h hVar) {
        switch (this.f33134b) {
            case 0:
                final o oVar = this.f33135c;
                try {
                    final int i = 1;
                    oVar.f33173c.execute(new Runnable() { // from class: t.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    o oVar2 = oVar;
                                    k0.j.g(i0.o.w(new f9.f(oVar2, oVar2.F())), hVar);
                                    break;
                                default:
                                    hVar.b(Boolean.valueOf(oVar.f33192w));
                                    break;
                            }
                        }
                    });
                    return "isRepeatingRequestAvailable";
                } catch (RejectedExecutionException unused) {
                    hVar.d(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
                    return "isRepeatingRequestAvailable";
                }
            default:
                final o oVar2 = this.f33135c;
                final int i10 = 0;
                oVar2.f33173c.execute(new Runnable() { // from class: t.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                o oVar22 = oVar2;
                                k0.j.g(i0.o.w(new f9.f(oVar22, oVar22.F())), hVar);
                                break;
                            default:
                                hVar.b(Boolean.valueOf(oVar2.f33192w));
                                break;
                        }
                    }
                });
                return "updateSessionConfigAsync";
        }
    }
}
