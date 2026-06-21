package sc;

import xc.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends cb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f32891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sb.g f32892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f32893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, sb.g gVar) {
        super(7);
        this.f32893e = fVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f32891c = new n("OnRequestIntegrityTokenCallback");
        this.f32892d = gVar;
    }
}
