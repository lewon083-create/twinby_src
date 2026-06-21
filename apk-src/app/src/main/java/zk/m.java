package zk;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f46423j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f46429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f46430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46431h;
    public final boolean i;

    public m(String scheme, String username, String password, String host, int i, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f46424a = scheme;
        this.f46425b = username;
        this.f46426c = password;
        this.f46427d = host;
        this.f46428e = i;
        this.f46429f = arrayList;
        this.f46430g = str;
        this.f46431h = url;
        this.i = Intrinsics.a(scheme, "https");
    }

    public final String a() {
        if (this.f46426c.length() == 0) {
            return "";
        }
        int length = this.f46424a.length() + 3;
        String str = this.f46431h;
        String strSubstring = str.substring(StringsKt.B(str, ':', length, 4) + 1, StringsKt.B(str, '@', 0, 6));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f46424a.length() + 3;
        String str = this.f46431h;
        int iB = StringsKt.B(str, '/', length, 4);
        String strSubstring = str.substring(iB, al.b.e(iB, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f46424a.length() + 3;
        String str = this.f46431h;
        int iB = StringsKt.B(str, '/', length, 4);
        int iE = al.b.e(iB, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iB < iE) {
            int i = iB + 1;
            int iF = al.b.f(str, '/', i, iE);
            String strSubstring = str.substring(i, iF);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iB = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f46429f == null) {
            return null;
        }
        String str = this.f46431h;
        int iB = StringsKt.B(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iB, al.b.f(str, '#', iB, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f46425b.length() == 0) {
            return "";
        }
        int length = this.f46424a.length() + 3;
        String str = this.f46431h;
        String strSubstring = str.substring(length, al.b.e(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && Intrinsics.a(((m) obj).f46431h, this.f46431h);
    }

    public final URI f() {
        String strSubstring;
        l lVar = new l();
        String scheme = this.f46424a;
        lVar.f46415a = scheme;
        String strE = e();
        Intrinsics.checkNotNullParameter(strE, "<set-?>");
        lVar.f46416b = strE;
        String strA = a();
        Intrinsics.checkNotNullParameter(strA, "<set-?>");
        lVar.f46417c = strA;
        lVar.f46418d = this.f46427d;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        int i = Intrinsics.a(scheme, "http") ? 80 : Intrinsics.a(scheme, "https") ? 443 : -1;
        int i10 = this.f46428e;
        lVar.f46419e = i10 != i ? i10 : -1;
        ArrayList arrayList = lVar.f46420f;
        arrayList.clear();
        arrayList.addAll(c());
        lVar.c(d());
        if (this.f46430g == null) {
            strSubstring = null;
        } else {
            String str = this.f46431h;
            strSubstring = str.substring(StringsKt.B(str, '#', 0, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        lVar.f46422h = strSubstring;
        String str2 = lVar.f46418d;
        lVar.f46418d = str2 != null ? new Regex("[\"<>^`{|}]").replace(str2, "") : null;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, i.b(0, 0, 227, (String) arrayList.get(i11), "[]"));
        }
        ArrayList arrayList2 = lVar.f46421g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str3 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str3 != null ? i.b(0, 0, 195, str3, "\\^`{|}") : null);
            }
        }
        String str4 = lVar.f46422h;
        lVar.f46422h = str4 != null ? i.b(0, 0, 163, str4, " \"#<>\\^`{|}") : null;
        String string = lVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e3) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final int hashCode() {
        return this.f46431h.hashCode();
    }

    public final String toString() {
        return this.f46431h;
    }
}
