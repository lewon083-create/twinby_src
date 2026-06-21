package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y7 f10857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f10858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10859h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u7 f10860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f10861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f10862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f10863m;

    public u7(String str, String str2, long j10, long j11, y7 y7Var, String[] strArr, String str3, String str4, u7 u7Var) {
        this.f10852a = str;
        this.f10853b = str2;
        this.i = str4;
        this.f10857f = y7Var;
        this.f10858g = strArr;
        this.f10854c = str2 != null;
        this.f10855d = j10;
        this.f10856e = j11;
        str3.getClass();
        this.f10859h = str3;
        this.f10860j = u7Var;
        this.f10861k = new HashMap();
        this.f10862l = new HashMap();
    }

    public static u7 a(String str) {
        return new u7(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static u7 b(String str, long j10, long j11, y7 y7Var, String[] strArr, String str2, String str3, u7 u7Var) {
        return new u7(str, null, j10, j11, y7Var, strArr, str2, str3, u7Var);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            n40 n40Var = new n40();
            n40Var.f8178a = new SpannableStringBuilder();
            n40Var.f8179b = null;
            treeMap.put(str, n40Var);
        }
        CharSequence charSequence = ((n40) treeMap.get(str)).f8178a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j10) {
        long j11 = this.f10855d;
        long j12 = this.f10856e;
        if (j11 == -9223372036854775807L) {
            if (j12 == -9223372036854775807L) {
                return true;
            }
            j11 = -9223372036854775807L;
        }
        if (j11 <= j10 && j12 == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= j12) {
            return j11 <= j10 && j10 < j12;
        }
        return true;
    }

    public final u7 d(int i) {
        ArrayList arrayList = this.f10863m;
        if (arrayList != null) {
            return (u7) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f10863m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z5) {
        String str = this.f10852a;
        boolean zEquals = "p".equals(str);
        if (z5 || zEquals || ("div".equals(str) && this.i != null)) {
            long j10 = this.f10855d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f10856e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f10863m != null) {
            for (int i = 0; i < this.f10863m.size(); i++) {
                u7 u7Var = (u7) this.f10863m.get(i);
                boolean z10 = true;
                if (!z5 && !zEquals) {
                    z10 = false;
                }
                u7Var.f(treeSet, z10);
            }
        }
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f10859h;
        boolean zEquals = "".equals(str3);
        boolean zC = c(j10);
        if (true != zEquals) {
            str = str3;
        }
        if (zC && "div".equals(this.f10852a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < e(); i++) {
            d(i).g(j10, str, arrayList);
        }
    }

    public final void h(long j10, boolean z5, String str, TreeMap treeMap) {
        long j11;
        boolean z10;
        HashMap map = this.f10861k;
        map.clear();
        HashMap map2 = this.f10862l;
        map2.clear();
        String str2 = this.f10852a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f10859h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f10854c && z5) {
            SpannableStringBuilder spannableStringBuilderI = i(str4, treeMap);
            String str5 = this.f10853b;
            str5.getClass();
            spannableStringBuilderI.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z5) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((n40) entry.getValue()).f8178a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < e(); i++) {
                u7 u7VarD = d(i);
                if (z5 || zEquals) {
                    j11 = j10;
                    z10 = true;
                } else {
                    j11 = j10;
                    z10 = false;
                }
                u7VarD.h(j11, z10, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderI2 = i(str4, treeMap);
                int length = spannableStringBuilderI2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderI2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderI2.charAt(length) != '\n') {
                    spannableStringBuilderI2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((n40) entry2.getValue()).f8178a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u7.j(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }
}
