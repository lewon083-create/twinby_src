package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xb1 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f44633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.f44633b = integrationInspectorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new m70(this.f44633b.getApplicationContext());
    }
}
