package yads;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e71 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f38040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f38041b;

    public e71(cn2 cn2Var, dn2 dn2Var) {
        this.f38040a = cn2Var;
        this.f38041b = dn2Var;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        this.f38041b.invoke(lm3Var);
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        this.f38040a.invoke((j80) obj);
    }
}
