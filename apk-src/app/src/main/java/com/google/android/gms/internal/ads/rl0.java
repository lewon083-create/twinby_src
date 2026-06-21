package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rl0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r81 f9959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f9960c;

    public /* synthetic */ rl0(Context context, r81 r81Var, int i) {
        this.f9958a = i;
        this.f9960c = context;
        this.f9959b = r81Var;
    }

    public Intent a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.f3082kc)).booleanValue();
        Context context = this.f9960c;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        switch (this.f9958a) {
            case 0:
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3007fe)).booleanValue()) {
                    return vv.d(new sl0(0, null, false));
                }
                ContentResolver contentResolver = this.f9960c.getContentResolver();
                if (contentResolver == null) {
                    return vv.d(new sl0(0, null, false));
                }
                return ((gx) this.f9959b).b(new ze(10, contentResolver));
            case 1:
                return ((gx) this.f9959b).b(new ze(13, this));
            case 2:
                return ((gx) this.f9959b).b(new ze(14, this));
            case 3:
                return ((gx) this.f9959b).b(new ze(16, this));
            case 4:
                return ((gx) this.f9959b).b(new ze(17, this));
            case 5:
                return ((gx) this.f9959b).b(new ze(26, this));
            case 6:
                if (!((Boolean) ul.f10968b.r()).booleanValue()) {
                    return vv.d(new tn0(-1, -1));
                }
                return ((gx) this.f9959b).b(new ze(27, this));
            default:
                return ((gx) this.f9959b).b(new ze(29, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        switch (this.f9958a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            default:
                return 39;
        }
    }

    public /* synthetic */ rl0(r81 r81Var, Context context, int i) {
        this.f9958a = i;
        this.f9959b = r81Var;
        this.f9960c = context;
    }
}
