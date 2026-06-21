package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f6684c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6685a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6686b = -1;

    public final void a(f9 f9Var) {
        r51 r51VarA = f9Var.a(i4.class, i2.f6338d);
        int i = r51VarA.f9715e;
        int i10 = 0;
        int i11 = 0;
        while (i11 < i) {
            boolean zB = b(((i4) r51VarA.get(i11)).f6361d);
            i11++;
            if (zB) {
                return;
            }
        }
        r51 r51VarA2 = f9Var.a(n4.class, i2.f6337c);
        int i12 = r51VarA2.f9715e;
        while (i10 < i12) {
            boolean zB2 = b(((n4) r51VarA2.get(i10)).f8177d);
            i10++;
            if (zB2) {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = f6684c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = cq0.f4293a;
            int i = Integer.parseInt(strGroup, 16);
            int i10 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i10 <= 0) {
                return false;
            }
            this.f6685a = i;
            this.f6686b = i10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
