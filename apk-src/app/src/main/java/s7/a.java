package s7;

import android.content.Intent;
import android.content.IntentFilter;
import l7.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public static final String i = n.i("BatteryChrgTracker");

    @Override // s7.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f32788b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            n.g().f(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // s7.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // s7.c
    public final void g(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        n.g().e(i, "Received ".concat(action), new Throwable[0]);
        switch (action) {
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                c(Boolean.FALSE);
                break;
            case "android.os.action.DISCHARGING":
                c(Boolean.FALSE);
                break;
            case "android.os.action.CHARGING":
                c(Boolean.TRUE);
                break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                c(Boolean.TRUE);
                break;
        }
    }
}
