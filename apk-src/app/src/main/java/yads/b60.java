package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b60 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m70 f36936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f36937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(Context context, m70 m70Var) {
        super(0);
        this.f36936b = m70Var;
        this.f36937c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gw2 gw2Var = (gw2) this.f36936b.f40813b.getValue();
        ww wwVar = xw.f44819a;
        Context context = this.f36937c;
        wwVar.getClass();
        return new ez(gw2Var, ww.a(context));
    }
}
