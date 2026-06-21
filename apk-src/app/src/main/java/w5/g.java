package w5;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.ads.i8;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.rrweb.RRWebVideoEvent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import l7.o;
import m3.p;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f35157a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f35158b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f35159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f35160d;

    static {
        HashMap map = new HashMap();
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map, "white");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map, "lime");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map, "cyan");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map, "red");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map, "yellow");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map, "magenta");
        pe.a.o(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map, "blue");
        pe.a.o(0, 0, 0, map, "black");
        f35159c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_white");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_lime");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_cyan");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map2, "bg_red");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_yellow");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_magenta");
        pe.a.o(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_blue");
        pe.a.o(0, 0, 0, map2, "bg_black");
        f35160d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        int i10;
        int i11;
        int i12;
        int i13;
        i = eVar.f35152b;
        length = spannableStringBuilder.length();
        String str2 = eVar.f35151a;
        str2.getClass();
        i10 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                o.o(1, spannableStringBuilder, i, length, 33);
                break;
            case "c":
                for (String str3 : eVar.f35154d) {
                    Map map = f35159c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f35160d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                o.o(2, spannableStringBuilder, i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new l3.h(eVar.f35153c), i, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f35148c);
                int i14 = eVar.f35152b;
                int i15 = 0;
                int length2 = 0;
                while (i15 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i15)).f35149a.f35151a)) {
                        d dVar = (d) arrayList.get(i15);
                        int iC2 = c(list2, str, dVar.f35149a);
                        if (iC2 == i10) {
                            iC2 = iC != i10 ? iC : 1;
                        }
                        int i16 = dVar.f35149a.f35152b - length2;
                        int i17 = dVar.f35150b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        spannableStringBuilder.setSpan(new l3.f(charSequenceSubSequence.toString(), iC2), i14, i16, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i14 = i16;
                    }
                    i15++;
                    i10 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, eVar);
        for (int i18 = 0; i18 < arrayListB.size(); i18++) {
            b bVar = ((f) arrayListB.get(i18)).f35156c;
            int i19 = bVar.f35139l;
            if (i19 == -1 && bVar.f35140m == -1) {
                i11 = -1;
            } else {
                i11 = (bVar.f35140m == 1 ? (char) 2 : (char) 0) | (i19 == 1 ? (char) 1 : (char) 0);
            }
            if (i11 != -1) {
                int i20 = bVar.f35139l;
                if (i20 == -1 && bVar.f35140m == -1) {
                    i13 = -1;
                    i12 = 1;
                } else {
                    i12 = 1;
                    i13 = (i20 == 1 ? 1 : 0) | (bVar.f35140m == 1 ? 2 : 0);
                }
                hl.d.a(spannableStringBuilder, new StyleSpan(i13), i, length);
            } else {
                i12 = 1;
            }
            if (bVar.f35137j == i12) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (bVar.f35138k == i12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (bVar.f35135g) {
                if (!bVar.f35135g) {
                    throw new IllegalStateException("Font color not defined");
                }
                hl.d.a(spannableStringBuilder, new ForegroundColorSpan(bVar.f35134f), i, length);
            }
            if (bVar.i) {
                if (!bVar.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                hl.d.a(spannableStringBuilder, new BackgroundColorSpan(bVar.f35136h), i, length);
            }
            if (bVar.f35133e != null) {
                hl.d.a(spannableStringBuilder, new TypefaceSpan(bVar.f35133e), i, length);
            }
            int i21 = bVar.f35141n;
            if (i21 == 1) {
                hl.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f35142o, true), i, length);
            } else if (i21 == 2) {
                hl.d.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f35142o), i, length);
            } else if (i21 == 3) {
                hl.d.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f35142o / 100.0f), i, length);
            }
            if (bVar.f35144q) {
                spannableStringBuilder.setSpan(new l3.e(), i, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, e eVar) {
        ?? size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b bVar = (b) list.get(i);
            String str2 = eVar.f35151a;
            Set set = eVar.f35154d;
            String str3 = eVar.f35153c;
            if (bVar.f35129a.isEmpty() && bVar.f35130b.isEmpty() && bVar.f35131c.isEmpty() && bVar.f35132d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(b.a(b.a(0, 1073741824, bVar.f35129a, str), 2, bVar.f35130b, str2), 4, bVar.f35132d, str3);
                size = (iA == -1 || !set.containsAll(bVar.f35131c)) ? 0 : iA + (bVar.f35131c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new f(size, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i10 = ((f) arrayListB.get(i)).f35156c.f35143p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, p pVar, ArrayList arrayList) {
        i8 i8Var = new i8();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            i8Var.f6413a = h.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            i8Var.f6414b = h.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, i8Var);
            StringBuilder sb2 = new StringBuilder();
            pVar.getClass();
            String strN = pVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strN.trim());
                strN = pVar.n(StandardCharsets.UTF_8);
            }
            i8Var.f6415c = f(str, sb2.toString(), arrayList);
            return new c(i8Var.a().a(), i8Var.f6413a, i8Var.f6414b);
        } catch (IllegalArgumentException unused) {
            m3.b.s("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, i8 i8Var) {
        int i;
        String strSubstring;
        int i10;
        int i11;
        Matcher matcher = f35158b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, i8Var);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                m3.b.s("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        i8Var.f6416d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i10 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i10 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i10 = 2;
                                    break;
                                default:
                                    m3.b.s("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i10 = Integer.MIN_VALUE;
                                    break;
                            }
                            i8Var.i = i10;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        i8Var.f6420h = h.b(strGroup2);
                    } else if (RRWebVideoEvent.JsonKeys.SIZE.equals(strGroup)) {
                        i8Var.f6421j = h.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i11 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i11 = 1;
                        } else {
                            m3.b.s("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i11 = Integer.MIN_VALUE;
                        }
                        i8Var.f6422k = i11;
                    } else {
                        m3.b.s("WebvttCueParser", "Unknown cue setting " + strGroup + StringUtils.PROCESS_POSTFIX_DELIMITER + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                m3.b.s("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        String str3;
        char c8;
        String strSubstring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(i, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            m3.b.s("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z5 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i10 = length - 2;
                    boolean z10 = str2.charAt(i10) == '/';
                    int i11 = i + (z5 ? 2 : 1);
                    if (!z10) {
                        i10 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i11, i10);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        h5.h(!strTrim2.isEmpty());
                        String str4 = z.f28608a;
                        str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z5) {
                                    if (!z10) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        h5.h(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c8 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c8 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c8];
                                        HashSet hashSet = new HashSet();
                                        for (int i12 = 1; i12 < strArrSplit.length; i12++) {
                                            hashSet.add(strArrSplit[i12]);
                                        }
                                        arrayDeque.push(new e(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.f35151a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void g(String str, i8 i8Var) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    m3.b.s("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                    break;
            }
            i8Var.f6419g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            i8Var.f6417e = h.b(str);
            i8Var.f6418f = 0;
        } else {
            i8Var.f6417e = Integer.parseInt(str);
            i8Var.f6418f = 1;
        }
    }
}
