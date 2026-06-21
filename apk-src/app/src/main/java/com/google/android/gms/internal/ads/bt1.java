package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bt1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jx1 f3899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3900h;
    public final hy1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3901j;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public bt1(int i, Exception exc, int i10) {
        this(i, exc, i10, null, -1, null, 4, null, false);
    }

    public final bt1 a(hy1 hy1Var) {
        String message = getMessage();
        String str = cq0.f4293a;
        return new bt1(message, getCause(), this.f3894b, this.f3896d, this.f3897e, this.f3898f, this.f3899g, this.f3900h, hy1Var, this.f3895c, this.f3901j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bt1(int i, Exception exc, int i10, String str, int i11, jx1 jx1Var, int i12, hy1 hy1Var, boolean z5) {
        String str2;
        int i13;
        String strG;
        String str3;
        if (i == 0) {
            str2 = str;
            i13 = i11;
            strG = "Source error";
        } else if (i != 1) {
            strG = "Unexpected runtime error";
            str2 = str;
            i13 = i11;
        } else {
            String strValueOf = String.valueOf(jx1Var);
            String str4 = cq0.f4293a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(str3.length() + strValueOf.length() + pe.a.b(String.valueOf(str).length() + 14, 9, String.valueOf(i11)) + 19);
            str2 = str;
            i13 = i11;
            l7.o.p(i13, str2, " error, index=", ", format=", sb2);
            strG = t.z.g(sb2, strValueOf, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strG : strG.concat(": null"), exc, i10, i, str2, i13, jx1Var, i12, hy1Var, SystemClock.elapsedRealtime(), z5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt1(String str, Throwable th2, int i, int i10, String str2, int i11, jx1 jx1Var, int i12, hy1 hy1Var, long j10, boolean z5) {
        boolean z10;
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3894b = i;
        this.f3895c = j10;
        if (!z5) {
            z10 = true;
        } else if (i10 == 1) {
            i10 = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        ix.o(z10);
        ix.o(th2 != null);
        this.f3896d = i10;
        this.f3897e = str2;
        this.f3898f = i11;
        this.f3899g = jx1Var;
        this.f3900h = i12;
        this.i = hy1Var;
        this.f3901j = z5;
    }
}
