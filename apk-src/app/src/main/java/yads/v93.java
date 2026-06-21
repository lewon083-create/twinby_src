package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y93 f43964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f43965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43966h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v93 f43967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f43968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f43969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f43970m;

    public v93(String str, String str2, long j10, long j11, y93 y93Var, String[] strArr, String str3, String str4, v93 v93Var) {
        this.f43959a = str;
        this.f43960b = str2;
        this.i = str4;
        this.f43964f = y93Var;
        this.f43965g = strArr;
        this.f43961c = str2 != null;
        this.f43962d = j10;
        this.f43963e = j11;
        this.f43966h = (String) ni.a((Object) str3);
        this.f43967j = v93Var;
        this.f43968k = new HashMap();
        this.f43969l = new HashMap();
    }

    public final v93 a(int i) {
        ArrayList arrayList = this.f43970m;
        if (arrayList != null) {
            return (v93) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(TreeSet treeSet, boolean z5) {
        boolean zEquals = "p".equals(this.f43959a);
        boolean zEquals2 = "div".equals(this.f43959a);
        if (z5 || zEquals || (zEquals2 && this.i != null)) {
            long j10 = this.f43962d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f43963e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f43970m == null) {
            return;
        }
        for (int i = 0; i < this.f43970m.size(); i++) {
            ((v93) this.f43970m.get(i)).a(treeSet, z5 || zEquals);
        }
    }

    public static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            n20 n20Var = new n20();
            n20Var.f41137a = new SpannableStringBuilder();
            treeMap.put(str, n20Var);
        }
        CharSequence charSequence = ((n20) treeMap.get(str)).f41137a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean a(long j10) {
        long j11 = this.f43962d;
        if (j11 == -9223372036854775807L && this.f43963e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f43963e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f43963e) {
            return j11 <= j10 && j10 < this.f43963e;
        }
        return true;
    }

    public final void a(long j10, String str, ArrayList arrayList) {
        if (!"".equals(this.f43966h)) {
            str = this.f43966h;
        }
        if (a(j10) && "div".equals(this.f43959a) && this.i != null) {
            arrayList.add(new Pair(str, this.i));
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.f43970m;
            if (i >= (arrayList2 == null ? 0 : arrayList2.size())) {
                return;
            }
            a(i).a(j10, str, arrayList);
            i++;
        }
    }

    public final void a(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        if (!a(j10)) {
            return;
        }
        String str2 = "".equals(this.f43966h) ? str : this.f43966h;
        Iterator it = this.f43969l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            int iIntValue = this.f43968k.containsKey(str3) ? ((Integer) this.f43968k.get(str3)).intValue() : 0;
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if (iIntValue != iIntValue2) {
                n20 n20Var = (n20) treeMap.get(str3);
                n20Var.getClass();
                w93 w93Var = (w93) map2.get(str2);
                w93Var.getClass();
                int i = w93Var.f44322j;
                y93 y93VarA = x93.a(this.f43964f, this.f43965g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) n20Var.f41137a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    n20Var.f41137a = spannableStringBuilder;
                }
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (y93VarA != null) {
                    x93.a(spannableStringBuilder2, iIntValue, iIntValue2, y93VarA, this.f43967j, map, i);
                    if ("p".equals(this.f43959a)) {
                        float f10 = y93VarA.f44983s;
                        if (f10 != Float.MAX_VALUE) {
                            n20Var.f41152q = (f10 * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = y93VarA.f44979o;
                        if (alignment != null) {
                            n20Var.f41139c = alignment;
                        }
                        Layout.Alignment alignment2 = y93VarA.f44980p;
                        if (alignment2 != null) {
                            n20Var.f41140d = alignment2;
                        }
                    }
                }
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f43970m;
            if (i10 >= (arrayList == null ? 0 : arrayList.size())) {
                return;
            }
            a(i10).a(j10, map, map2, str2, treeMap);
            i10++;
        }
    }

    public final void a(long j10, boolean z5, String str, TreeMap treeMap) {
        boolean z10;
        TreeMap treeMap2;
        long j11;
        this.f43968k.clear();
        this.f43969l.clear();
        if ("metadata".equals(this.f43959a)) {
            return;
        }
        if (!"".equals(this.f43966h)) {
            str = this.f43966h;
        }
        String str2 = str;
        if (this.f43961c && z5) {
            SpannableStringBuilder spannableStringBuilderA = a(str2, treeMap);
            String str3 = this.f43960b;
            str3.getClass();
            spannableStringBuilderA.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f43959a) && z5) {
            a(str2, treeMap).append('\n');
            return;
        }
        if (a(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap map = this.f43968k;
                String str4 = (String) entry.getKey();
                CharSequence charSequence = ((n20) entry.getValue()).f41137a;
                charSequence.getClass();
                map.put(str4, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(this.f43959a);
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f43970m;
                if (i >= (arrayList == null ? 0 : arrayList.size())) {
                    break;
                }
                v93 v93VarA = a(i);
                if (z5 || zEquals) {
                    z10 = true;
                    treeMap2 = treeMap;
                    j11 = j10;
                } else {
                    z10 = false;
                    j11 = j10;
                    treeMap2 = treeMap;
                }
                v93VarA.a(j11, z10, str2, treeMap2);
                j10 = j11;
                i++;
                treeMap = treeMap2;
            }
            TreeMap treeMap3 = treeMap;
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderA2 = a(str2, treeMap3);
                int length = spannableStringBuilderA2.length() - 1;
                while (length >= 0 && spannableStringBuilderA2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderA2.charAt(length) != '\n') {
                    spannableStringBuilderA2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap3.entrySet()) {
                HashMap map2 = this.f43969l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequence2 = ((n20) entry2.getValue()).f41137a;
                charSequence2.getClass();
                map2.put(str5, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public static v93 a(String str) {
        return new v93(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public final long[] a() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final ArrayList a(long j10, Map map, Map map2, Map map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        a(j10, this.f43966h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j10, false, this.f43966h, treeMap);
        a(j10, map, map2, this.f43966h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                w93 w93Var = (w93) map2.get(pair.first);
                w93Var.getClass();
                arrayList2.add(new o20(null, null, null, bitmapDecodeByteArray, w93Var.f44316c, 0, w93Var.f44318e, w93Var.f44315b, 0, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, w93Var.f44319f, w93Var.f44320g, false, -16777216, w93Var.f44322j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            w93 w93Var2 = (w93) map2.get(entry.getKey());
            w93Var2.getClass();
            n20 n20Var = (n20) entry.getValue();
            CharSequence charSequence = n20Var.f41137a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (vf0 vf0Var : (vf0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vf0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(vf0Var), spannableStringBuilder.getSpanEnd(vf0Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i10 = i + 1;
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i, i12 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == '\n') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == ' ') {
                        spannableStringBuilder.delete(i14, i13 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == '\n') {
                        spannableStringBuilder.delete(i15, i16);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = w93Var2.f44316c;
            int i17 = w93Var2.f44317d;
            n20Var.f41141e = f10;
            n20Var.f41142f = i17;
            n20Var.f41143g = w93Var2.f44318e;
            n20Var.f41144h = w93Var2.f44315b;
            n20Var.f41147l = w93Var2.f44319f;
            float f11 = w93Var2.i;
            int i18 = w93Var2.f44321h;
            n20Var.f41146k = f11;
            n20Var.f41145j = i18;
            n20Var.f41151p = w93Var2.f44322j;
            arrayList2.add(n20Var.a());
        }
        return arrayList2;
    }
}
