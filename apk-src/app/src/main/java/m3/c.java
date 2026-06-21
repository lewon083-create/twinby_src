package m3;

import com.google.android.gms.internal.ads.yd1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1 f28549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28550d;

    public /* synthetic */ c(yd1 yd1Var, Object obj, int i) {
        this.f28548b = i;
        this.f28549c = yd1Var;
        this.f28550d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28548b) {
            case 0:
                yd1 yd1Var = this.f28549c;
                if (yd1Var.f12599b == 0) {
                    yd1Var.e(this.f28550d);
                }
                break;
            default:
                yd1 yd1Var2 = this.f28549c;
                int i = yd1Var2.f12599b - 1;
                yd1Var2.f12599b = i;
                if (i == 0) {
                    yd1Var2.e(this.f28550d);
                }
                break;
        }
    }
}
