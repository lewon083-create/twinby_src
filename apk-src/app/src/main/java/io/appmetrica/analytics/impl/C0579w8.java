package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0579w8 implements InterfaceC0299l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24959a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24960b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24961c = KotlinVersion.MAX_COMPONENT_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24962d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24963e = 63;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24964f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24965g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24966h = 1;
    public final int i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Regex f24967j = new Regex("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Regex f24968k = new Regex("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f24969l = kotlin.collections.s.f("ru", "by", "kz", "az", "kg", "lv", "md", "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f24970m = "yandex.ru";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f24971n = "gmail.com";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f24972o = "googlemail.com";

    @Override // io.appmetrica.analytics.impl.InterfaceC0299l2
    @Nullable
    public final String a(@NotNull String str) {
        String str2;
        String lowerCase = new Regex("^\\++").replace(StringsKt.P(str).toString(), "").toLowerCase(Locale.ROOT);
        int iF = StringsKt.F(lowerCase, '@', 0, 6);
        if (iF != -1) {
            String strSubstring = lowerCase.substring(0, iF);
            String strSubstring2 = lowerCase.substring(iF + 1);
            int length = strSubstring.length();
            if (length >= this.f24966h && length <= this.i) {
                List listJ = StringsKt.J(strSubstring, new char[]{'.'});
                if (!(listJ instanceof Collection) || !listJ.isEmpty()) {
                    Iterator it = listJ.iterator();
                    do {
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            int length2 = str2.length();
                            if (length2 >= this.f24966h) {
                                Character chV = kotlin.text.e0.v(str2);
                                if (chV != null && chV.charValue() == '\"') {
                                    Intrinsics.checkNotNullParameter(str2, "<this>");
                                    Character chValueOf = str2.length() == 0 ? null : Character.valueOf(str2.charAt(str2.length() - 1));
                                    if (chValueOf != null && chValueOf.charValue() == '\"' && length2 > 2) {
                                        int i = 1;
                                        while (true) {
                                            int i10 = i + 2;
                                            if (i10 >= str2.length()) {
                                                break;
                                            }
                                            char cCharAt = str2.charAt(i);
                                            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt > '~') {
                                                return null;
                                            }
                                            if (cCharAt == '\\') {
                                                if (i10 == str2.length()) {
                                                    return null;
                                                }
                                                i++;
                                                if (str2.charAt(i) < ' ') {
                                                    return null;
                                                }
                                            }
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                    } while (this.f24967j.b(str2));
                    return null;
                }
                if (strSubstring2.length() > this.f24961c) {
                    return null;
                }
                List listSplit$default = StringsKt__StringsKt.split$default(strSubstring2, new String[]{"."}, false, 0, 6, null);
                if (listSplit$default.size() < this.f24962d) {
                    return null;
                }
                List listA = CollectionsKt.A(listSplit$default);
                if (!(listA instanceof Collection) || !listA.isEmpty()) {
                    Iterator it2 = listA.iterator();
                    while (it2.hasNext()) {
                        if (!b((String) it2.next())) {
                            return null;
                        }
                    }
                }
                String str3 = (String) CollectionsKt.J(listSplit$default);
                if (str3.length() < this.f24965g || !b(str3)) {
                    return null;
                }
                for (int i11 = 0; i11 < str3.length(); i11++) {
                    if (!Character.isDigit(str3.charAt(i11))) {
                        String input = kotlin.text.a0.l(strSubstring2, this.f24972o, this.f24971n);
                        Regex regex = this.f24968k;
                        regex.getClass();
                        Intrinsics.checkNotNullParameter(input, "input");
                        Matcher matcher = regex.f27537b.matcher(input);
                        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                        kotlin.text.o oVar = !matcher.find(0) ? null : new kotlin.text.o(matcher, input);
                        if (oVar != null) {
                            kotlin.text.l lVar = (kotlin.text.l) oVar.a();
                            String str4 = (String) lVar.get(1);
                            String str5 = (String) lVar.get(2);
                            if (str5.length() <= 0 ? str4.length() > 0 : this.f24969l.contains(str5)) {
                                input = this.f24970m;
                            }
                        }
                        if (Intrinsics.a(input, this.f24970m)) {
                            strSubstring = kotlin.text.a0.l(strSubstring, ".", "-");
                        } else if (Intrinsics.a(input, this.f24971n)) {
                            strSubstring = kotlin.text.a0.l(strSubstring, ".", "");
                        }
                        int length3 = strSubstring.length();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length3) {
                                break;
                            }
                            if (strSubstring.charAt(i12) == '+') {
                                strSubstring = strSubstring.substring(0, i12);
                                break;
                            }
                            i12++;
                        }
                        String str6 = strSubstring + '@' + input;
                        if (str6.length() < this.f24959a || str6.length() > this.f24960b) {
                            return null;
                        }
                        return str6;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public final boolean b(String str) {
        if (str.length() > this.f24963e || str.length() < this.f24964f) {
            return false;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (!Character.isLetterOrDigit(str.charAt(0)) || !Character.isLetterOrDigit(kotlin.text.e0.w(str))) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '-') {
                return false;
            }
        }
        return true;
    }
}
