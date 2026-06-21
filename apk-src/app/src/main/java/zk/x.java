package zk;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f46511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f46513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f46514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f46515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f46516f;

    public x(m url, String method, k headers, b0 b0Var, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f46511a = url;
        this.f46512b = method;
        this.f46513c = headers;
        this.f46514d = b0Var;
        this.f46515e = tags;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f46513c.a(name);
    }

    public final w b() {
        Intrinsics.checkNotNullParameter(this, "request");
        w wVar = new w();
        wVar.f46510e = new LinkedHashMap();
        wVar.f46506a = this.f46511a;
        wVar.f46507b = this.f46512b;
        wVar.f46509d = this.f46514d;
        Map map = this.f46515e;
        wVar.f46510e = map.isEmpty() ? new LinkedHashMap() : j0.m(map);
        wVar.f46508c = this.f46513c.e();
        return wVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f46512b);
        sb2.append(", url=");
        sb2.append(this.f46511a);
        k kVar = this.f46513c;
        if (kVar.size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (Object obj : kVar) {
                int i10 = i + 1;
                if (i < 0) {
                    kotlin.collections.s.i();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.f27469b;
                String str2 = (String) pair.f27470c;
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i = i10;
            }
            sb2.append(']');
        }
        Map map = this.f46515e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
