package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements a0.d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.d2 f19633c;

    public k0(long j10, int i) {
        this.f19632b = i;
        switch (i) {
            case 1:
                this.f19633c = new t2(j10, new j0(j10));
                break;
            default:
                this.f19633c = new k0(j10, 1);
                break;
        }
    }

    @Override // a0.d2
    public final long a() {
        switch (this.f19632b) {
            case 0:
                return ((t2) ((k0) this.f19633c).f19633c).f19764b;
            default:
                return ((t2) this.f19633c).f19764b;
        }
    }

    @Override // a0.d2
    public final a0.c2 b(a4.g gVar) {
        switch (this.f19632b) {
            case 0:
                if (((t2) ((k0) this.f19633c).f19633c).b(gVar).f57b) {
                    return a0.c2.f54e;
                }
                Throwable th2 = (Throwable) gVar.f432e;
                if (th2 instanceof p0) {
                    com.google.android.gms.internal.auth.g.k("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((p0) th2).f19711b > 0) {
                        return a0.c2.f55f;
                    }
                }
                return a0.c2.f53d;
            default:
                return ((t2) this.f19633c).b(gVar);
        }
    }
}
