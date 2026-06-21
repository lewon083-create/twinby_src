package uc;

import d8.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends cb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f34449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sb.g f34450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f34451e;

    public f(g gVar, sb.g gVar2) {
        u uVar = new u("OnRequestInstallCallback");
        this.f34451e = gVar;
        super(6);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f34449c = uVar;
        this.f34450d = gVar2;
    }
}
