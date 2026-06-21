package aa;

import com.google.android.gms.internal.ads.tr0;
import com.google.android.gms.internal.ads.ut;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f590e;

    public /* synthetic */ g0(int i, Object obj, boolean z5, boolean z10) {
        this.f587b = i;
        this.f590e = obj;
        this.f588c = z5;
        this.f589d = z10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f587b) {
            case 0:
                ((i0) this.f590e).d(this.f588c, this.f589d);
                break;
            default:
                ((ut) ((tr0) this.f590e).f10703d).q(this.f588c, this.f589d);
                break;
        }
    }
}
