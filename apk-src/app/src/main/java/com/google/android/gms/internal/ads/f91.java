package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f5277b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f5278a;

    public f91(ByteArrayInputStream byteArrayInputStream) {
        this.f5278a = byteArrayInputStream;
    }

    public static int b(wl1 wl1Var) throws IOException {
        if (!(wl1Var instanceof am1)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(wl1Var.e().f3324b instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number numberF = wl1Var.e().f();
        try {
            if (!(numberF instanceof oc1)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long j10 = Long.parseLong(((oc1) numberF).f8665b);
            if (j10 > 4294967295L || j10 < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) j10;
        } catch (NumberFormatException e3) {
            throw new IOException(e3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0227 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f A[Catch: all -> 0x0031, IllegalStateException -> 0x0034, zl1 -> 0x0037, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:13:0x003a, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:21:0x006f, B:23:0x0082, B:25:0x0088, B:27:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00ac, B:35:0x00b4, B:51:0x00ff, B:56:0x0136, B:69:0x0159, B:71:0x016f, B:73:0x0175, B:75:0x017b, B:90:0x01ea, B:91:0x021d, B:92:0x0226, B:93:0x0227, B:94:0x022e, B:60:0x0141, B:64:0x014c, B:68:0x0157, B:95:0x022f, B:96:0x0238, B:97:0x0239, B:98:0x0242, B:99:0x0243, B:100:0x024a, B:101:0x024b, B:102:0x0252, B:103:0x0253, B:106:0x025d, B:107:0x0264, B:108:0x0265, B:109:0x026c, B:110:0x026d, B:111:0x0274, B:112:0x0275, B:113:0x027a), top: B:116:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.rh1 a() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f91.a():com.google.android.gms.internal.ads.rh1");
    }
}
