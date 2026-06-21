package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f6751a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f6752b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f6753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f6754d;

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
        f6753c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_white");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_lime");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_cyan");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map2, "bg_red");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_yellow");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_magenta");
        pe.a.o(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_blue");
        pe.a.o(0, 0, 0, map2, "bg_black");
        f6754d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString a(java.lang.String r19, java.lang.String r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j8.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static e8 b(String str, Matcher matcher, tk0 tk0Var, ArrayList arrayList) {
        i8 i8Var = new i8();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            i8Var.f6413a = pn1.c(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            i8Var.f6414b = pn1.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            c(strGroup3, i8Var);
            StringBuilder sb2 = new StringBuilder();
            String strN = tk0Var.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strN.trim());
                strN = tk0Var.n(StandardCharsets.UTF_8);
            }
            i8Var.f6415c = a(str, sb2.toString(), arrayList);
            return new e8(i8Var.b().a(), i8Var.f6413a, i8Var.f6414b);
        } catch (IllegalArgumentException unused) {
            rs.r("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r16, com.google.android.gms.internal.ads.i8 r17) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j8.c(java.lang.String, com.google.android.gms.internal.ads.i8):void");
    }

    public static void d(String str, g8 g8Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int i10;
        int i11;
        int i12 = g8Var.f5681b;
        int length = spannableStringBuilder.length();
        String str2 = g8Var.f5680a;
        int iHashCode = str2.hashCode();
        int i13 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iE = e(list2, str, g8Var);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, v.f11145e);
                        int i14 = i12;
                        int i15 = 0;
                        int length2 = 0;
                        while (i15 < arrayList.size()) {
                            if ("rt".equals(((f8) arrayList.get(i15)).f5256a.f5680a)) {
                                f8 f8Var = (f8) arrayList.get(i15);
                                int iE2 = e(list2, str, f8Var.f5256a);
                                if (iE2 == i13) {
                                    iE2 = iE != i13 ? iE : 1;
                                }
                                int i16 = f8Var.f5256a.f5681b - length2;
                                int i17 = f8Var.f5257b - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i16, i17);
                                spannableStringBuilder.delete(i16, i17);
                                spannableStringBuilder.setSpan(new s60(charSequenceSubSequence.toString(), iE2), i14, i16, 33);
                                length2 += charSequenceSubSequence.length();
                                i14 = i16;
                            }
                            i15++;
                            i13 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : g8Var.f5683d) {
                                Map map = f6753c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i12, length, 33);
                                } else {
                                    Map map2 = f6754d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i12, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new r70(g8Var.f5682c), i12, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        l7.o.o(1, spannableStringBuilder, i12, length, 33);
                    }
                } else if (!str2.equals(VKApiCodes.PARAM_LANG)) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                l7.o.o(2, spannableStringBuilder, i12, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        ArrayList arrayListF = f(list2, str, g8Var);
        for (int i18 = 0; i18 < arrayListF.size(); i18++) {
            d8 d8Var = ((h8) arrayListF.get(i18)).f6050c;
            int i19 = d8Var.f4489k;
            if (i19 == -1 && d8Var.f4490l == -1) {
                i = -1;
            } else {
                i = (d8Var.f4490l == 1 ? (char) 2 : (char) 0) | (i19 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i20 = d8Var.f4489k;
                if (i20 == -1 && d8Var.f4490l == -1) {
                    i11 = -1;
                    i10 = 1;
                } else {
                    i10 = 1;
                    i11 = (i20 == 1 ? 1 : 0) | (d8Var.f4490l == 1 ? 2 : 0);
                }
                vv.k(spannableStringBuilder, new StyleSpan(i11), i12, length);
            } else {
                i10 = 1;
            }
            if (d8Var.f4488j == i10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
            }
            if (d8Var.f4486g) {
                if (!d8Var.f4486g) {
                    throw new IllegalStateException("Font color not defined");
                }
                vv.k(spannableStringBuilder, new ForegroundColorSpan(d8Var.f4485f), i12, length);
            }
            if (d8Var.i) {
                if (!d8Var.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                vv.k(spannableStringBuilder, new BackgroundColorSpan(d8Var.f4487h), i12, length);
            }
            if (d8Var.f4484e != null) {
                vv.k(spannableStringBuilder, new TypefaceSpan(d8Var.f4484e), i12, length);
            }
            int i21 = d8Var.f4491m;
            if (i21 == 1) {
                vv.k(spannableStringBuilder, new AbsoluteSizeSpan((int) d8Var.f4492n, true), i12, length);
            } else if (i21 == 2) {
                vv.k(spannableStringBuilder, new RelativeSizeSpan(d8Var.f4492n), i12, length);
            } else if (i21 == 3) {
                vv.k(spannableStringBuilder, new RelativeSizeSpan(d8Var.f4492n / 100.0f), i12, length);
            }
            if (d8Var.f4494p) {
                spannableStringBuilder.setSpan(new f60(), i12, length, 33);
            }
        }
    }

    public static int e(List list, String str, g8 g8Var) {
        ArrayList arrayListF = f(list, str, g8Var);
        for (int i = 0; i < arrayListF.size(); i++) {
            int i10 = ((h8) arrayListF.get(i)).f6050c.f4493o;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(java.util.List r10, java.lang.String r11, com.google.android.gms.internal.ads.g8 r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r10.size()
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r10.get(r2)
            com.google.android.gms.internal.ads.d8 r3 = (com.google.android.gms.internal.ads.d8) r3
            java.lang.String r4 = r12.f5680a
            java.util.Set r5 = r12.f5683d
            java.lang.String r6 = r12.f5682c
            java.lang.String r7 = r3.f4480a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L43
            java.lang.String r7 = r3.f4481b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L43
            java.util.Set r7 = r3.f4482c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L43
            java.lang.String r7 = r3.f4483d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L43
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L41
            r4 = 1
            goto L6d
        L41:
            r4 = r1
            goto L6d
        L43:
            java.lang.String r7 = r3.f4480a
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = com.google.android.gms.internal.ads.d8.a(r1, r8, r7, r11)
            java.lang.String r8 = r3.f4481b
            r9 = 2
            int r4 = com.google.android.gms.internal.ads.d8.a(r7, r9, r8, r4)
            java.lang.String r7 = r3.f4483d
            r8 = 4
            int r4 = com.google.android.gms.internal.ads.d8.a(r4, r8, r7, r6)
            r6 = -1
            if (r4 == r6) goto L41
            java.util.Set r6 = r3.f4482c
            boolean r5 = r5.containsAll(r6)
            if (r5 != 0) goto L65
            goto L41
        L65:
            java.util.Set r5 = r3.f4482c
            int r5 = r5.size()
            int r5 = r5 * r8
            int r4 = r4 + r5
        L6d:
            if (r4 <= 0) goto L77
            com.google.android.gms.internal.ads.h8 r5 = new com.google.android.gms.internal.ads.h8
            r5.<init>(r4, r3)
            r0.add(r5)
        L77:
            int r2 = r2 + 1
            goto L7
        L7a:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j8.f(java.util.List, java.lang.String, com.google.android.gms.internal.ads.g8):java.util.ArrayList");
    }
}
