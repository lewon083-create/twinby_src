package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends ip1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f9689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f9690f;

    public static String F1(tk0 tk0Var) {
        int iL = tk0Var.L();
        int i = tk0Var.f10642b;
        tk0Var.G(iL);
        return new String(tk0Var.f10641a, i, iL);
    }

    public static HashMap G1(tk0 tk0Var) {
        int iH = tk0Var.h();
        HashMap map = new HashMap(iH);
        for (int i = 0; i < iH; i++) {
            String strF1 = F1(tk0Var);
            Serializable serializableH1 = H1(tk0Var.K(), tk0Var);
            if (serializableH1 != null) {
                map.put(strF1, serializableH1);
            }
        }
        return map;
    }

    public static Serializable H1(int i, tk0 tk0Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(tk0Var.d()));
        }
        if (i == 1) {
            return Boolean.valueOf(tk0Var.K() == 1);
        }
        if (i == 2) {
            return F1(tk0Var);
        }
        if (i != 3) {
            if (i == 8) {
                return G1(tk0Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(tk0Var.d()));
                tk0Var.G(2);
                return date;
            }
            int iH = tk0Var.h();
            ArrayList arrayList = new ArrayList(iH);
            for (int i10 = 0; i10 < iH; i10++) {
                Serializable serializableH1 = H1(tk0Var.K(), tk0Var);
                if (serializableH1 != null) {
                    arrayList.add(serializableH1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strF1 = F1(tk0Var);
            int iK = tk0Var.K();
            if (iK == 9) {
                return map;
            }
            Serializable serializableH12 = H1(iK, tk0Var);
            if (serializableH12 != null) {
                map.put(strF1, serializableH12);
            }
        }
    }
}
