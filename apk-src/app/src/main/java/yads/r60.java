package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r60 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f42499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f42500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(Context context, m70 m70Var) {
        super(0);
        this.f42499b = context;
        this.f42500c = m70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new d71(this.f42499b, (x61) this.f42500c.f40835y.getValue());
    }
}
