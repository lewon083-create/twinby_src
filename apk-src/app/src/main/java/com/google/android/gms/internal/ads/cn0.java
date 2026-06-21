package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cn0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cloneable f4268b;

    public /* synthetic */ cn0(Cloneable cloneable, int i) {
        this.f4267a = i;
        this.f4268b = cloneable;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f4267a) {
            case 0:
                Bundle bundle = (Bundle) this.f4268b;
                w50 w50Var = (w50) obj;
                if (bundle != null) {
                    w50Var.f11646a.putAll(bundle);
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) this.f4268b;
                w50 w50Var2 = (w50) obj;
                if (!bundle2.isEmpty()) {
                    w50Var2.f11646a.putBundle("shared_pref", bundle2);
                }
                break;
            default:
                ((w50) obj).f11646a.putStringArrayList("ad_types", (ArrayList) this.f4268b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        switch (this.f4267a) {
            case 0:
                Bundle bundle = (Bundle) this.f4268b;
                w50 w50Var = (w50) obj;
                if (bundle != null) {
                    w50Var.f11647b.putAll(bundle);
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) this.f4268b;
                w50 w50Var2 = (w50) obj;
                if (!bundle2.isEmpty()) {
                    w50Var2.f11647b.putBundle("shared_pref", bundle2);
                }
                break;
            default:
                ((w50) obj).f11647b.putStringArrayList("ad_types", (ArrayList) this.f4268b);
                break;
        }
    }
}
