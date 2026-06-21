package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f4068c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f4069d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk0 f4070a = new tk0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f4071b = new StringBuilder();

    public static void a(tk0 tk0Var) {
        while (true) {
            for (boolean z5 = true; tk0Var.B() > 0 && z5; z5 = false) {
                int i = tk0Var.f10642b;
                byte[] bArr = tk0Var.f10641a;
                byte b2 = bArr[i];
                char c8 = (char) b2;
                if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
                    tk0Var.G(1);
                } else {
                    int i10 = tk0Var.f10643c;
                    if (i + 2 <= i10) {
                        int i11 = i + 1;
                        if (b2 == 47) {
                            int i12 = i + 2;
                            if (bArr[i11] == 42) {
                                while (true) {
                                    int i13 = i12 + 1;
                                    if (i13 >= i10) {
                                        break;
                                    }
                                    if (((char) bArr[i12]) == '*' && ((char) bArr[i13]) == '/') {
                                        i10 = i12 + 2;
                                        i12 = i10;
                                    } else {
                                        i12 = i13;
                                    }
                                }
                                tk0Var.G(i10 - tk0Var.f10642b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(tk0 tk0Var, StringBuilder sb2) {
        a(tk0Var);
        if (tk0Var.B() == 0) {
            return null;
        }
        String strC = c(tk0Var, sb2);
        if (!strC.isEmpty()) {
            return strC;
        }
        char cK = (char) tk0Var.K();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cK).length());
        sb3.append(cK);
        return sb3.toString();
    }

    public static String c(tk0 tk0Var, StringBuilder sb2) {
        boolean z5;
        char c8;
        sb2.setLength(0);
        int i = tk0Var.f10642b;
        int i10 = tk0Var.f10643c;
        loop0: while (true) {
            for (false; i < i10 && !z5; true) {
                c8 = (char) tk0Var.f10641a[i];
                z5 = (c8 < 'A' || c8 > 'Z') && (c8 < 'a' || c8 > 'z') && !((c8 >= '0' && c8 <= '9') || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_');
            }
            sb2.append(c8);
            i++;
        }
        tk0Var.G(i - tk0Var.f10642b);
        return sb2.toString();
    }
}
