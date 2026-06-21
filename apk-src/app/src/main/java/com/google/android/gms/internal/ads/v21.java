package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v21 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fa1 f11216c = new fa1("OverlayDisplayService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Intent f11217d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi0 f11218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11219b;

    public v21(Context context) {
        if (z21.a(context)) {
            this.f11218a = new yi0(context.getApplicationContext(), f11216c, f11217d);
        } else {
            this.f11218a = null;
        }
        this.f11219b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(ni.i iVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        f11216c.c(str, new Object[0]);
        byte b2 = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b2 == 3) {
            iVar.E(new r21(8160, null, 0));
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((b2 & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final void a(s21 s21Var, ni.i iVar, int i) {
        yi0 yi0Var = this.f11218a;
        if (yi0Var == null) {
            f11216c.c("error: %s", "Play Store not found.");
        } else if (c(iVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(s21Var.f10157a, s21Var.f10158b))) {
            yi0Var.i(new y21(yi0Var, new uy(this, s21Var, i, iVar), 0));
        }
    }
}
