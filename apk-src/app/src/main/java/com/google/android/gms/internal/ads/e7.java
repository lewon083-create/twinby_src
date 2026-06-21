package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4866f;

    public /* synthetic */ e7(int i, int i10, int i11, int i12, int i13, int i14) {
        this.f4861a = i;
        this.f4862b = i10;
        this.f4863c = i11;
        this.f4864d = i12;
        this.f4865e = i13;
        this.f4866f = i14;
    }

    public static e7 a(String str) {
        com.google.android.gms.internal.measurement.h5.h(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strX = com.google.android.gms.internal.measurement.j4.x(strArrSplit[i14].trim());
            strX.getClass();
            switch (strX) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "layer":
                    i = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new e7(i, i10, i11, i12, i13, strArrSplit.length);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static e7 b(String str) {
        ix.o(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i11 == -1 || i12 == -1 || i14 == -1) {
                    return null;
                }
                return new e7(i10, i11, i12, i13, i14, length);
            }
            String strH = ix.h(strArrSplit[i].trim());
            switch (strH.hashCode()) {
                case 100571:
                    if (strH.equals("end")) {
                        i12 = i;
                    }
                    break;
                case 3556653:
                    if (strH.equals("text")) {
                        i14 = i;
                    }
                    break;
                case 102749521:
                    if (strH.equals(AdRevenueConstants.LAYER_KEY)) {
                        i10 = i;
                    }
                    break;
                case 109757538:
                    if (strH.equals("start")) {
                        i11 = i;
                    }
                    break;
                case 109780401:
                    if (strH.equals("style")) {
                        i13 = i;
                    }
                    break;
            }
            i++;
        }
    }
}
