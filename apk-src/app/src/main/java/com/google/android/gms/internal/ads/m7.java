package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 implements a7 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f7794h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e7 f7796c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f7798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f7799f = -3.4028235E38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f7800g = -3.4028235E38f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tk0 f7797d = new tk0();

    public m7(List list) {
        if (list == null || list.isEmpty()) {
            this.f7795b = false;
            this.f7796c = null;
            return;
        }
        this.f7795b = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        ix.o(str.startsWith("Format:"));
        e7 e7VarB = e7.b(str);
        e7VarB.getClass();
        this.f7796c = e7VarB;
        a(new tk0((byte[]) list.get(1)), charset);
    }

    public static long b(String str) {
        Matcher matcher = f7794h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = cq0.f4293a;
        long j10 = Long.parseLong(strGroup) * 3600000000L;
        long j11 = Long.parseLong(matcher.group(2)) * 60000000;
        return j10 + j11 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    public static int d(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j10));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0293 A[Catch: RuntimeException -> 0x01da, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x01da, blocks: (B:91:0x01aa, B:93:0x01b8, B:94:0x01be, B:101:0x01df, B:103:0x01e3, B:105:0x01f2, B:107:0x01f6, B:109:0x0205, B:111:0x0209, B:112:0x0211, B:117:0x023b, B:119:0x023f, B:123:0x0250, B:125:0x0254, B:129:0x0265, B:131:0x0269, B:135:0x027a, B:137:0x027e, B:141:0x028f, B:143:0x0293, B:144:0x029b, B:152:0x02b9, B:150:0x02ac, B:115:0x0219, B:96:0x01c9), top: B:174:0x01aa, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.tk0 r29, java.nio.charset.Charset r30) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m7.a(com.google.android.gms.internal.ads.tk0, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x01be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af A[Catch: RuntimeException -> 0x01e1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:75:0x01a3, B:77:0x01af, B:79:0x01b6, B:83:0x01cf, B:81:0x01c1), top: B:199:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r33, int r34, a4.g r35, byte[] r36) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m7.c(int, int, a4.g, byte[]):void");
    }
}
