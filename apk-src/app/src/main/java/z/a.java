package z;

import a0.o;
import j1.h;
import j1.i;
import k0.j;
import t.a0;
import t.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f45763c;

    public /* synthetic */ a(c cVar, int i) {
        this.f45762b = i;
        this.f45763c = cVar;
    }

    @Override // j1.i
    public final Object m(final h hVar) {
        switch (this.f45762b) {
            case 0:
                final c cVar = this.f45763c;
                final int i = 1;
                cVar.f45770d.execute(new Runnable() { // from class: z.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.f45768b = true;
                                o oVar = new o("Camera2CameraControl was updated with new options.");
                                h hVar2 = cVar2.f45773g;
                                if (hVar2 != null) {
                                    hVar2.d(oVar);
                                    cVar2.f45773g = null;
                                }
                                cVar2.f45773g = hVar;
                                if (cVar2.f45767a) {
                                    t.o oVar2 = cVar2.f45769c;
                                    oVar2.getClass();
                                    j.f(i0.o.w(new k(oVar2, 1))).a(new a0(16, cVar2), cVar2.f45770d);
                                    cVar2.f45768b = false;
                                }
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.f45768b = true;
                                o oVar3 = new o("Camera2CameraControl was updated with new options.");
                                h hVar3 = cVar3.f45773g;
                                if (hVar3 != null) {
                                    hVar3.d(oVar3);
                                    cVar3.f45773g = null;
                                }
                                cVar3.f45773g = hVar;
                                if (cVar3.f45767a) {
                                    t.o oVar4 = cVar3.f45769c;
                                    oVar4.getClass();
                                    j.f(i0.o.w(new k(oVar4, 1))).a(new a0(16, cVar3), cVar3.f45770d);
                                    cVar3.f45768b = false;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
            default:
                final c cVar2 = this.f45763c;
                final int i10 = 0;
                cVar2.f45770d.execute(new Runnable() { // from class: z.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c cVar22 = cVar2;
                                cVar22.f45768b = true;
                                o oVar = new o("Camera2CameraControl was updated with new options.");
                                h hVar2 = cVar22.f45773g;
                                if (hVar2 != null) {
                                    hVar2.d(oVar);
                                    cVar22.f45773g = null;
                                }
                                cVar22.f45773g = hVar;
                                if (cVar22.f45767a) {
                                    t.o oVar2 = cVar22.f45769c;
                                    oVar2.getClass();
                                    j.f(i0.o.w(new k(oVar2, 1))).a(new a0(16, cVar22), cVar22.f45770d);
                                    cVar22.f45768b = false;
                                }
                                break;
                            default:
                                c cVar3 = cVar2;
                                cVar3.f45768b = true;
                                o oVar3 = new o("Camera2CameraControl was updated with new options.");
                                h hVar3 = cVar3.f45773g;
                                if (hVar3 != null) {
                                    hVar3.d(oVar3);
                                    cVar3.f45773g = null;
                                }
                                cVar3.f45773g = hVar;
                                if (cVar3.f45767a) {
                                    t.o oVar4 = cVar3.f45769c;
                                    oVar4.getClass();
                                    j.f(i0.o.w(new k(oVar4, 1))).a(new a0(16, cVar3), cVar3.f45770d);
                                    cVar3.f45768b = false;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
        }
    }
}
