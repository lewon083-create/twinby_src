package w8;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.internal.ads.om1;
import java.net.MalformedURLException;
import java.net.URL;
import ni.i;
import td.d;
import x8.c;
import x8.f;
import x8.g;
import x8.h;
import x8.j;
import x8.k;
import x8.l;
import x8.n;
import x8.o;
import x8.q;
import x8.r;
import x8.s;
import x8.v;
import z8.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f35207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f35208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f35209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f35210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9.a f35211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h9.a f35212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35213g;

    public b(Context context, h9.a aVar, h9.a aVar2) {
        d dVar = new d();
        c cVar = c.f35992a;
        dVar.a(o.class, cVar);
        dVar.a(x8.i.class, cVar);
        f fVar = f.f36005a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        x8.d dVar2 = x8.d.f35994a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        x8.b bVar = x8.b.f35980a;
        dVar.a(x8.a.class, bVar);
        dVar.a(h.class, bVar);
        x8.e eVar = x8.e.f35997a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f36013a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f33775d = true;
        this.f35207a = new i(14, dVar);
        this.f35209c = context;
        this.f35208b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f35210d = b(a.f35201c);
        this.f35211e = aVar2;
        this.f35212f = aVar;
        this.f35213g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException(om1.k("Invalid url: ", str), e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y8.i a(y8.i r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.b.a(y8.i):y8.i");
    }
}
