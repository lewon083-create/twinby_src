package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Nd extends kotlin.jvm.internal.p implements Function1 {
    public Nd(Object obj) {
        super(1, obj, Od.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Od od2 = (Od) this.receiver;
        od2.f22795a.markCrashCompleted((String) obj);
        od2.f22795a.deleteCompletedCrashes();
        return Unit.f27471a;
    }
}
