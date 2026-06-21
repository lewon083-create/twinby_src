package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mv2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ un1 f41042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f41043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1 f41044d;

    public mv2(un1 un1Var, CustomizableMediaView customizableMediaView, qn1 qn1Var) {
        this.f41042b = un1Var;
        this.f41043c = customizableMediaView;
        this.f41044d = qn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41042b.b(this.f41043c, this.f41044d);
    }
}
