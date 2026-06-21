package t5;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f33482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f33483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f33484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f33485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33486h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f33487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f33488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f33489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f33490m;

    public c(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, c cVar) {
        this.f33479a = str;
        this.f33480b = str2;
        this.i = str4;
        this.f33484f = fVar;
        this.f33485g = strArr;
        this.f33481c = str2 != null;
        this.f33482d = j10;
        this.f33483e = j11;
        str3.getClass();
        this.f33486h = str3;
        this.f33487j = cVar;
        this.f33488k = new HashMap();
        this.f33489l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            l3.a aVar = new l3.a();
            aVar.f27749a = new SpannableStringBuilder();
            aVar.f27750b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((l3.a) treeMap.get(str)).f27749a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i) {
        ArrayList arrayList = this.f33490m;
        if (arrayList != null) {
            return (c) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f33490m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z5) {
        String str = this.f33479a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z5 || zEquals || (zEquals2 && this.i != null)) {
            long j10 = this.f33482d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f33483e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f33490m == null) {
            return;
        }
        for (int i = 0; i < this.f33490m.size(); i++) {
            ((c) this.f33490m.get(i)).d(treeSet, z5 || zEquals);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f33482d;
        long j12 = this.f33483e;
        if (j11 == -9223372036854775807L && j12 == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && j12 == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= j12) {
            return j11 <= j10 && j10 < j12;
        }
        return true;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f33486h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.f33479a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j10, boolean z5, String str, TreeMap treeMap) {
        boolean z10;
        TreeMap treeMap2;
        long j11;
        HashMap map = this.f33488k;
        map.clear();
        HashMap map2 = this.f33489l;
        map2.clear();
        String str2 = this.f33479a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f33486h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f33481c && z5) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f33480b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z5) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((l3.a) entry.getValue()).f27749a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                c cVarB = b(i);
                if (z5 || zEquals) {
                    z10 = true;
                    treeMap2 = treeMap;
                    j11 = j10;
                } else {
                    z10 = false;
                    j11 = j10;
                    treeMap2 = treeMap;
                }
                cVarB.i(j11, z10, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((l3.a) entry2.getValue()).f27749a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
