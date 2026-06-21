package zk;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f46432d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f46433e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f46436c;

    public p(String str, String str2, String[] strArr) {
        this.f46434a = str;
        this.f46435b = str2;
        this.f46436c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        Intrinsics.checkNotNullParameter("charset", "name");
        String[] strArr = this.f46436c;
        int i = 0;
        int iA = qj.c.a(0, strArr.length - 1, 2);
        if (iA < 0) {
            str = null;
            break;
        }
        while (!kotlin.text.a0.i(strArr[i], "charset")) {
            if (i == iA) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && Intrinsics.a(((p) obj).f46434a, this.f46434a);
    }

    public final int hashCode() {
        return this.f46434a.hashCode();
    }

    public final String toString() {
        return this.f46434a;
    }
}
