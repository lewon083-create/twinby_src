package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bl f3808b = new bl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bl f3809c = new bl(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bl f3810d = new bl(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3811a;

    public /* synthetic */ bl(int i) {
        this.f3811a = i;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < str.length() && str.charAt(i10) == ',') {
            i10++;
        }
        while (length > 0) {
            int i11 = length - 1;
            if (str.charAt(i11) != ',') {
                break;
            }
            length = i11;
        }
        if (length < i10) {
            return null;
        }
        if (i10 != 0) {
            i = i10;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    public final String a(String str, String str2) {
        switch (this.f3811a) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String strB = b(str);
                String strB2 = b(str2);
                if (TextUtils.isEmpty(strB)) {
                    return strB2;
                }
                if (TextUtils.isEmpty(strB2)) {
                    return strB;
                }
                return t.z.g(new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length()), strB, StringUtils.COMMA, strB2);
        }
    }
}
