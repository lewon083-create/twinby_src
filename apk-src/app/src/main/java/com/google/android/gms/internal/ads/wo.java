package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wo implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ff0 f11861c;

    public /* synthetic */ wo(ff0 ff0Var, int i) {
        this.f11860b = i;
        this.f11861c = ff0Var;
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        switch (this.f11860b) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                ff0 ff0Var = this.f11861c;
                String str = (String) map.get("persistentData");
                synchronized (ff0Var) {
                    ff0Var.f5360x = str;
                    p9.k.C.f31302h.g().g(ff0Var.f5360x);
                }
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j10 = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j10 = Long.parseLong((String) map.get("expires"));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                ff0 ff0Var2 = this.f11861c;
                String str2 = (String) map.get("extras");
                synchronized (ff0Var2) {
                    ff0Var2.f5351o = str2;
                    ff0Var2.f5353q = j10;
                    ff0Var2.m();
                }
                return;
        }
    }
}
