package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43996a;

    public vc2(Context context) {
        this.f43996a = context;
    }

    public final tc2 a() {
        Object systemService = this.f43996a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean boolValueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (boolValueOf != null && !boolValueOf.booleanValue()) {
            return tc2.f43270c;
        }
        Object systemService2 = this.f43996a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? tc2.f43271d : tc2.f43269b;
    }
}
