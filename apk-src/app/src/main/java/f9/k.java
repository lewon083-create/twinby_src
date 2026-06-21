package f9;

import android.content.Context;
import fh.nd;
import fh.of;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj.a f16719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj.a f16720c;

    public /* synthetic */ k(hj.a aVar, hj.a aVar2, int i) {
        this.f16718a = i;
        this.f16719b = aVar;
        this.f16720c = aVar2;
    }

    @Override // hj.a
    public final Object get() {
        switch (this.f16718a) {
            case 0:
                return new j(new of(), new nd(), a.f16696f, (m) this.f16719b.get(), this.f16720c);
            default:
                return new z8.d((Context) ((a9.c) this.f16719b).f536b, (x7.b) ((a9.c) this.f16720c).get());
        }
    }
}
