package d1;

import a0.i0;
import a0.o2;
import android.util.Range;
import android.util.Rational;
import com.google.android.gms.internal.auth.g;
import g0.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import x0.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f15517a;

    static {
        HashMap map = new HashMap();
        f15517a = map;
        HashMap map2 = new HashMap();
        e1.e eVar = e1.e.f15952d;
        map2.put(1, eVar);
        e1.e eVar2 = e1.e.f15955g;
        map2.put(2, eVar2);
        e1.e eVar3 = e1.e.f15956h;
        map2.put(4096, eVar3);
        map2.put(8192, eVar3);
        HashMap map3 = new HashMap();
        map3.put(1, eVar);
        map3.put(2, eVar2);
        map3.put(4096, eVar3);
        map3.put(8192, eVar3);
        HashMap map4 = new HashMap();
        map4.put(1, eVar);
        map4.put(4, eVar2);
        map4.put(4096, eVar3);
        map4.put(16384, eVar3);
        map4.put(2, eVar);
        map4.put(8, eVar2);
        map4.put(8192, eVar3);
        map4.put(32768, eVar3);
        HashMap map5 = new HashMap();
        map5.put(256, eVar2);
        map5.put(512, e1.e.f15953e);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static e1.e a(int i, String str) {
        e1.e eVar;
        Map map = (Map) f15517a.get(str);
        if (map != null && (eVar = (e1.e) map.get(Integer.valueOf(i))) != null) {
            return eVar;
        }
        g.O("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return e1.e.f15952d;
    }

    public static d b(k kVar, Range range) {
        Range range2 = o2.f177q;
        int iIntValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int i = kVar.f35629b;
        if (i == 0) {
            i = iIntValue;
        }
        Locale locale = Locale.ENGLISH;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(i);
        boolean zEquals = range2.equals(range);
        Object obj = range;
        if (zEquals) {
            obj = "<UNSPECIFIED>";
        }
        g.e("VideoConfigUtil", String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", numValueOf, numValueOf2, obj));
        return new d(iIntValue, i);
    }

    public static c c(i0 i0Var, x0.e eVar, z0.a aVar) {
        boolean zB = i0Var.b();
        int i = i0Var.f117a;
        f2.g.h("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + i0Var + "]", zB);
        int i10 = eVar.f35580c;
        String str = "video/avc";
        String str2 = i10 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        if (aVar == null) {
            jVar = null;
        } else {
            Set set = (Set) f1.b.f16562b.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) f1.b.f16561a.get(Integer.valueOf(i0Var.f118b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            for (j jVar : aVar.f45779d) {
                if (set.contains(Integer.valueOf(jVar.f19622j)) && set2.contains(Integer.valueOf(jVar.f19621h))) {
                    String str3 = jVar.f19615b;
                    if (str2.equals(str3)) {
                        g.e("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + "]");
                    } else if (i10 == -1) {
                        g.e("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + i0Var + "]");
                    }
                    str2 = str3;
                    break;
                }
            }
            jVar = null;
        }
        if (jVar == null) {
            if (i10 == -1) {
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "video/hevc";
                    } else {
                        if (i != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + i0Var + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (aVar == null) {
                g.e("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + i0Var + "]");
            } else {
                g.e("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + i0Var + "]");
            }
        }
        if (str2 != null) {
            return new c(str2, -1, jVar != null ? jVar : null);
        }
        throw new NullPointerException("Null mimeType");
    }

    public static int d(int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Range range) {
        Rational rational = new Rational(i10, i11);
        Rational rational2 = new Rational(i12, i13);
        Rational rational3 = new Rational(i14, i15);
        int iDoubleValue = (int) (new Rational(i16, i17).doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * ((double) i));
        String strConcat = g.v("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(iDoubleValue)) : "";
        if (!k.f35626e.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (g.v("VideoConfigUtil")) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
            iDoubleValue = iIntValue;
        }
        g.e("VideoConfigUtil", strConcat);
        return iDoubleValue;
    }
}
