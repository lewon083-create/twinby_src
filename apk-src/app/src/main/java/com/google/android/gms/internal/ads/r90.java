package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r90 implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f9766c;

    public /* synthetic */ r90(t90 t90Var, int i) {
        this.f9765b = i;
        switch (i) {
            case 1:
                this.f9766c = new WeakReference(t90Var);
                break;
            default:
                this.f9766c = new WeakReference(t90Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        switch (this.f9765b) {
            case 0:
                t90 t90Var = (t90) this.f9766c.get();
                if (t90Var != null) {
                    u80 u80Var = t90Var.f10547j;
                    if ("_ac".equals((String) map.get("eventName"))) {
                        t90Var.i.onAdClicked();
                        if (((Boolean) q9.s.f31967e.f31970c.a(al.Xb)).booleanValue()) {
                            u80Var.J();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                u80Var.L();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                t90 t90Var2 = (t90) this.f9766c.get();
                if (t90Var2 != null) {
                    u80 u80Var2 = t90Var2.f10547j;
                    t90Var2.i.onAdClicked();
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.Xb)).booleanValue()) {
                        u80Var2.J();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            u80Var2.L();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
