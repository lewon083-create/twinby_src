package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g30 implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i30 f5645c;

    public /* synthetic */ g30(i30 i30Var, int i) {
        this.f5644b = i;
        this.f5645c = i30Var;
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        switch (this.f5644b) {
            case 0:
                i30 i30Var = this.f5645c;
                i30Var.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(i30Var.f6351a)) {
                        i30Var.f6353c.execute(new s(29, this));
                        break;
                    }
                }
                break;
            default:
                i30 i30Var2 = this.f5645c;
                i30Var2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(i30Var2.f6351a)) {
                        i30Var2.f6353c.execute(new h30(0, this));
                        break;
                    }
                }
                break;
        }
    }
}
