package al;

import gl.c;
import ij.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.ProfilingTraceData;
import io.sentry.util.HttpUtils;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.a0;
import nl.g;
import nl.i;
import nl.p;
import nl.x;
import ya.e;
import zk.d0;
import zk.e0;
import zk.k;
import zk.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f1041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f1042b = e.t(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f1043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f1044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeZone f1045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Regex f1046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1047g;

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.b.<clinit>():void");
    }

    public static final boolean a(m mVar, m other) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.a(mVar.f46427d, other.f46427d) && mVar.f46428e == other.f46428e && Intrinsics.a(mVar.f46424a, other.f46424a);
    }

    public static final int b(long j10) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, "name");
        if (j10 < 0) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.".toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.".toString());
    }

    public static final void c(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e3) {
            throw e3;
        } catch (RuntimeException e7) {
            if (!Intrinsics.a(e7.getMessage(), "bio == null")) {
                throw e7;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i, int i10, String str, String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i10) {
            if (StringsKt.z(delimiters, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int f(String str, char c8, int i, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i10) {
            if (str.charAt(i) == c8) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final String g(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                t tVarA = j.a(strArr2);
                while (tVarA.hasNext()) {
                    if (comparator.compare(str, (String) tVarA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long i(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        String strA = d0Var.f46351g.a("Content-Length");
        if (strA != null) {
            Intrinsics.checkNotNullParameter(strA, "<this>");
            try {
                return Long.parseLong(strA);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final List j(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(s.f(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int k(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.d(cCharAt, 31) <= 0 || Intrinsics.d(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int l(int i, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i10) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int m(int i, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = i10 - 1;
        if (i <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i) {
                    break;
                }
                i11--;
            }
        }
        return i;
    }

    public static final String[] n(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean o(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a0.i(name, "Authorization") || a0.i(name, HttpUtils.COOKIE_HEADER_NAME) || a0.i(name, "Proxy-Authorization") || a0.i(name, "Set-Cookie");
    }

    public static final int p(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' > c8 || c8 >= 'G') {
            return -1;
        }
        return c8 - '7';
    }

    public static final Charset q(i iVar, Charset charset) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iG = iVar.g(f1044d);
        if (iG == -1) {
            return charset;
        }
        if (iG == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iG == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iG == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iG == 3) {
            Charsets.f27530a.getClass();
            Charset charset2 = Charsets.f27533d;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            Charsets.f27533d = charsetForName;
            return charsetForName;
        }
        if (iG != 4) {
            throw new AssertionError();
        }
        Charsets.f27530a.getClass();
        Charset charset3 = Charsets.f27532c;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        Charsets.f27532c = charsetForName2;
        return charsetForName2;
    }

    public static final int r(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final boolean s(x xVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = xVar.timeout().e() ? xVar.timeout().c() - jNanoTime : Long.MAX_VALUE;
        xVar.timeout().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            g gVar = new g();
            while (xVar.D(gVar, 8192L) != -1) {
                gVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                xVar.timeout().a();
                return true;
            }
            xVar.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                xVar.timeout().a();
                return false;
            }
            xVar.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                xVar.timeout().a();
            } else {
                xVar.timeout().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final k t(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            nl.j jVar = cVar.f20170a;
            nl.j jVar2 = cVar.f20171b;
            String name = jVar.h();
            String value = jVar2.h();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            arrayList.add(StringsKt.P(value).toString());
        }
        return new k((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(m mVar, boolean z5) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        String strC = mVar.f46427d;
        int i = mVar.f46428e;
        if (StringsKt.y(strC, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            strC = pe.a.c(']', "[", strC);
        }
        if (!z5) {
            String scheme = mVar.f46424a;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (i == (Intrinsics.a(scheme, "http") ? 80 : Intrinsics.a(scheme, "https") ? 443 : -1)) {
                return strC;
            }
        }
        return strC + ':' + i;
    }

    public static final List v(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.T(list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int w(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String x(int i, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iL = l(i, i10, str);
        String strSubstring = str.substring(iL, m(iL, i10, str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
