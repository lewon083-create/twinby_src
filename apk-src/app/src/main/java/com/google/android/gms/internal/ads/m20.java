package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m20 implements k20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff0 f7747b;

    public /* synthetic */ m20(ff0 ff0Var, int i) {
        this.f7746a = i;
        this.f7747b = ff0Var;
    }

    @Override // com.google.android.gms.internal.ads.k20
    public final void a(HashMap map) {
        switch (this.f7746a) {
            case 0:
                String str = (String) map.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int iHashCode = str.hashCode();
                    ff0 ff0Var = this.f7747b;
                    if (iHashCode == 97520651) {
                        if (str.equals("flick")) {
                            ff0Var.h(cf0.f4196d, true);
                        }
                    } else if (iHashCode == 109399814 && str.equals("shake")) {
                        ff0Var.h(cf0.f4195c, true);
                    }
                    ff0Var.h(cf0.f4194b, true);
                    break;
                }
                break;
            default:
                String str2 = (String) map.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.f7747b.b(str2.equals("true"));
                    break;
                }
                break;
        }
    }
}
