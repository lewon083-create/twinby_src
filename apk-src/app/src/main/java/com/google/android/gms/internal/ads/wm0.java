package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qs1 f11855b;

    public /* synthetic */ wm0() {
        this.f11854a = 21;
    }

    public static void a(wm0 wm0Var, qs1 qs1Var) {
        if (wm0Var.f11855b != null) {
            throw new IllegalStateException();
        }
        wm0Var.f11855b = qs1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f11854a) {
            case 0:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new tl0(4, gxVar, (ff0) this.f11855b.j());
            case 1:
                return new dl0(4, (wp0) this.f11855b.j());
            case 2:
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new jm0(((d10) this.f11855b).a(), gxVar2);
            case 3:
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new tl0(5, gxVar3, (de0) this.f11855b.j());
            case 4:
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                return new rl0(gxVar4, ((d10) this.f11855b).a(), 5);
            case 5:
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                ((d10) this.f11855b).a();
                return new jm0(gxVar5, 4);
            case 6:
                return new mo0((sq0) this.f11855b.j());
            case 7:
                return new np0((sq0) this.f11855b.j());
            case 8:
                return new as0((bs0) this.f11855b.j());
            case 9:
                return new as0((bs0) this.f11855b.j());
            case 10:
                return new File(new File((File) this.f11855b.j(), "drgd"), "pmtd.d");
            case 11:
                return new File(new File((File) this.f11855b.j(), "drgd"), "pcbc.d");
            case 12:
                return new File(new File((File) this.f11855b.j(), "drgd"), "pcam.jar.d");
            case 13:
                return new File(new File((File) this.f11855b.j(), "drgd"), "pmtd");
            case 14:
                return new File(new File(new File((File) this.f11855b.j(), "drgd"), "v"), "pcopt");
            case 15:
                return new File(new File((File) this.f11855b.j(), "drgd"), "pcbc");
            case 16:
                return new File(new File((File) this.f11855b.j(), "drgd"), "pcam.jar.tmp");
            case 17:
                return new File(new File(new File((File) this.f11855b.j(), "drgd"), "v"), "pcam.jar");
            case 18:
                return new File(new File((File) this.f11855b.j(), "ocs"), "pmtd");
            case 19:
                return new File(new File((File) this.f11855b.j(), "ocs"), "pcbc");
            case 20:
                return new File(new File((File) this.f11855b.j(), "ocs"), "pcam.jar");
            default:
                qs1 qs1Var = this.f11855b;
                if (qs1Var != null) {
                    return qs1Var.j();
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ wm0(qs1 qs1Var, int i) {
        this.f11854a = i;
        this.f11855b = qs1Var;
    }
}
