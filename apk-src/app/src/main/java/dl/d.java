package dl;

import ad.g1;
import com.google.android.gms.internal.measurement.h5;
import j3.d0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import m3.z;
import zk.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Cloneable f15829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15831h;
    public Object i;

    public d(k connectionPool, zk.a address, g call) {
        zk.i eventListener = zk.i.f46409d;
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f15827d = connectionPool;
        this.f15828e = address;
        this.f15829f = call;
    }

    public static String b(String str, int i, int i10, int i11) {
        String str2 = z.f28608a;
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append(" ");
        sb2.append(str);
        sb2.append("/");
        sb2.append(i10);
        return o.j(i11, "/", sb2);
    }

    public e4.b a() {
        String strB;
        e4.a aVarA;
        HashMap map = (HashMap) this.f15829f;
        try {
            if (map.containsKey("rtpmap")) {
                String str = (String) map.get("rtpmap");
                String str2 = z.f28608a;
                aVarA = e4.a.a(str);
            } else {
                int i = this.f15825b;
                h5.h(i < 96);
                if (i == 0) {
                    strB = b("PCMU", 0, 8000, 1);
                } else if (i == 8) {
                    strB = b("PCMA", 8, 8000, 1);
                } else if (i == 10) {
                    strB = b("L16", 10, 44100, 2);
                } else {
                    if (i != 11) {
                        throw new IllegalStateException(o.i(i, "Unsupported static paylod type "));
                    }
                    strB = b("L16", 11, 44100, 1);
                }
                aVarA = e4.a.a(strB);
            }
            return new e4.b(this, g1.a(map), aVarA);
        } catch (d0 e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dl.j c(int r17, int r18, int r19, boolean r20, boolean r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.d.c(int, int, int, boolean, boolean):dl.j");
    }

    public boolean d(m url) {
        Intrinsics.checkNotNullParameter(url, "url");
        m mVar = ((zk.a) this.f15828e).f46315h;
        return url.f46428e == mVar.f46428e && Intrinsics.a(url.f46427d, mVar.f46427d);
    }

    public void e(IOException e3) {
        Intrinsics.checkNotNullParameter(e3, "e");
        this.i = null;
        if ((e3 instanceof gl.d0) && ((gl.d0) e3).f20182b == gl.b.REFUSED_STREAM) {
            this.f15824a++;
        } else if (e3 instanceof gl.a) {
            this.f15825b++;
        } else {
            this.f15826c++;
        }
    }

    public d(int i, int i10, String str, String str2) {
        this.f15827d = str;
        this.f15824a = i;
        this.f15828e = str2;
        this.f15825b = i10;
        this.f15829f = new HashMap();
        this.f15826c = -1;
    }
}
