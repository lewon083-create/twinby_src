package gb;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends oa.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb.g f20071d;

    public e(Boolean bool, sb.g gVar) {
        this.f20070c = bool;
        this.f20071d = gVar;
    }

    @Override // oa.g
    public final void y1(Status status) {
        a.a.o(status, this.f20070c, this.f20071d);
    }
}
