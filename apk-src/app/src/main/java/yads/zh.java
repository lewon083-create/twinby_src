package yads;

import android.app.ActivityManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zh extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ei f45412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ei eiVar) {
        super(0);
        this.f45412b = eiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Object systemService = this.f45412b.f38137a.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                return (ActivityManager) systemService;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
