package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f7963a;

    static {
        char[] cArr = new char[80];
        f7963a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            zm1 zm1Var = bn1.f3837c;
            sb2.append(ix.g(new zm1(((String) obj).getBytes(ao1.f3341a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof bn1) {
            sb2.append(": \"");
            sb2.append(ix.g((bn1) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof sn1) {
            sb2.append(" {");
            b((sn1) obj, sb2, i + 2);
            sb2.append("\n");
            c(i, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i11 = i + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb2, i11, "key", entry.getKey());
        a(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        c(i, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.google.android.gms.internal.ads.sn1 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.b(com.google.android.gms.internal.ads.sn1, java.lang.StringBuilder, int):void");
    }

    public static void c(int i, StringBuilder sb2) {
        while (i > 0) {
            int i10 = 80;
            if (i <= 80) {
                i10 = i;
            }
            sb2.append(f7963a, 0, i10);
            i -= i10;
        }
    }
}
