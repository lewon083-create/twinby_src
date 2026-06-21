package oe;

import com.google.android.gms.internal.ads.fm1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends fm1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f30654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i) {
        super(jVar);
        this.f30654g = i;
    }

    @Override // com.google.android.gms.internal.ads.fm1, java.util.Iterator
    public Object next() {
        switch (this.f30654g) {
            case 1:
                return a().f5866c;
            default:
                return super.next();
        }
    }
}
