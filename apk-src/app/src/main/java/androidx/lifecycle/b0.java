package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f1536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1538d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f1539e;

    public b0(d0 d0Var, e0 e0Var) {
        this.f1539e = d0Var;
        this.f1536b = e0Var;
    }

    public final void a(boolean z5) {
        if (z5 == this.f1537c) {
            return;
        }
        this.f1537c = z5;
        int i = z5 ? 1 : -1;
        d0 d0Var = this.f1539e;
        int i10 = d0Var.f1552c;
        d0Var.f1552c = i + i10;
        if (!d0Var.f1553d) {
            d0Var.f1553d = true;
            while (true) {
                try {
                    int i11 = d0Var.f1552c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z10 = i10 == 0 && i11 > 0;
                    boolean z11 = i10 > 0 && i11 == 0;
                    if (z10) {
                        d0Var.g();
                    } else if (z11) {
                        d0Var.h();
                    }
                    i10 = i11;
                } catch (Throwable th2) {
                    d0Var.f1553d = false;
                    throw th2;
                }
            }
            d0Var.f1553d = false;
        }
        if (this.f1537c) {
            d0Var.c(this);
        }
    }

    public boolean c(u uVar) {
        return false;
    }

    public abstract boolean e();

    public void b() {
    }
}
