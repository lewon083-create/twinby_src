package zk;

import com.google.android.gms.internal.measurement.b4;
import g0.a2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f46506a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f46509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f46510e = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46507b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2 f46508c = new a2(2);

    public final x a() {
        Map mapUnmodifiableMap;
        m mVar = this.f46506a;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.f46507b;
        k kVarG = this.f46508c.g();
        b0 b0Var = this.f46509d;
        LinkedHashMap linkedHashMap = this.f46510e;
        byte[] bArr = al.b.f1041a;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = j0.d();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new x(mVar, str, kVarG, b0Var, mapUnmodifiableMap);
    }

    public final void b(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        a2 a2Var = this.f46508c;
        a2Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ya.e.c(name);
        ya.e.d(value, name);
        a2Var.l(name);
        a2Var.f(name, value);
    }

    public final void c(String method, b0 b0Var) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (b0Var == null) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(pe.a.f("method ", method, " must have a request body.").toString());
            }
        } else if (!b4.F(method)) {
            throw new IllegalArgumentException(pe.a.f("method ", method, " must not have a request body.").toString());
        }
        this.f46507b = method;
        this.f46509d = b0Var;
    }

    public final void d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f46508c.l(name);
    }

    public final void e(Object obj, Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (obj == null) {
            this.f46510e.remove(type);
            return;
        }
        if (this.f46510e.isEmpty()) {
            this.f46510e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.f46510e;
        Object objCast = type.cast(obj);
        Intrinsics.b(objCast);
        linkedHashMap.put(type, objCast);
    }

    public final void f(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (kotlin.text.a0.n(url, "ws:", true)) {
            StringBuilder sb2 = new StringBuilder("http:");
            String strSubstring = url.substring(3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring);
            url = sb2.toString();
        } else if (kotlin.text.a0.n(url, "wss:", true)) {
            StringBuilder sb3 = new StringBuilder("https:");
            String strSubstring2 = url.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb3.append(strSubstring2);
            url = sb3.toString();
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        l lVar = new l();
        lVar.d(null, url);
        m url2 = lVar.a();
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f46506a = url2;
    }
}
