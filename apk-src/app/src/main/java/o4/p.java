package o4;

import ad.b1;
import ad.h0;
import ad.j0;
import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.n0;
import com.google.android.gms.internal.ads.ro0;
import com.google.android.gms.internal.ads.w0;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.yandex.div.core.dagger.b f29667r = new com.yandex.div.core.dagger.b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f29669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f29670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f29672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.t f29673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f29674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f29675h;
    public final w0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ro0 f29676j = new ro0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m3.v f29677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Pair f29678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f29681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f29682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29683q;

    public p(n0 n0Var) {
        this.f29668a = n0Var.f8077a;
        n nVar = (n) n0Var.f8082f;
        nVar.getClass();
        this.f29669b = nVar;
        this.f29670c = new SparseArray();
        h0 h0Var = j0.f818c;
        b1 b1Var = b1.f768f;
        this.f29671d = n0Var.f8078b;
        m3.t tVar = (m3.t) n0Var.f8083g;
        this.f29673f = tVar;
        long j10 = n0Var.f8080d;
        this.f29675h = j10 != -9223372036854775807L ? -j10 : -9223372036854775807L;
        w0 w0Var = (w0) n0Var.f8084h;
        this.i = w0Var;
        this.f29672e = new c((r) n0Var.f8081e, w0Var, tVar);
        this.f29674g = new CopyOnWriteArraySet();
        new j3.n().a();
        this.f29681o = -9223372036854775807L;
        this.f29683q = -1;
        this.f29680n = 0;
    }
}
