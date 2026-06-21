package gl;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f20191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f20192b;

    static {
        c cVar = new c(c.i, "");
        nl.j jVar = c.f20167f;
        c cVar2 = new c(jVar, "GET");
        c cVar3 = new c(jVar, "POST");
        nl.j jVar2 = c.f20168g;
        c cVar4 = new c(jVar2, "/");
        c cVar5 = new c(jVar2, "/index.html");
        nl.j jVar3 = c.f20169h;
        c cVar6 = new c(jVar3, "http");
        c cVar7 = new c(jVar3, "https");
        nl.j jVar4 = c.f20166e;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(jVar4, "200"), new c(jVar4, "204"), new c(jVar4, "206"), new c(jVar4, "304"), new c(jVar4, "400"), new c(jVar4, "404"), new c(jVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f20191a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(cVarArr[i].f20170a)) {
                linkedHashMap.put(cVarArr[i].f20170a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        f20192b = mapUnmodifiableMap;
    }

    public static void a(nl.j name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iA = name.a();
        for (int i = 0; i < iA; i++) {
            byte bD = name.d(i);
            if (65 <= bD && bD < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.h()));
            }
        }
    }
}
