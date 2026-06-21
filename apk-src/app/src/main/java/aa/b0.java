package aa;

import com.google.android.gms.internal.ads.d10;
import com.google.android.gms.internal.ads.ms1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10 f558b;

    public /* synthetic */ b0(d10 d10Var, int i) {
        this.f557a = i;
        this.f558b = d10Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* bridge */ /* synthetic */ Object j() {
        switch (this.f557a) {
            case 0:
                return new a0(this.f558b.a());
            default:
                return new t9.a0(this.f558b.a());
        }
    }
}
