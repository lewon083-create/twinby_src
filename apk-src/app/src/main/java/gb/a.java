package gb;

import android.os.Looper;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import fh.nd;
import oa.a0;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends na.f implements kb.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l6.i f20065m = new l6.i("LocationServices.API", new bb.f(2), new l7.b(5));

    public Task f(kb.c cVar) {
        String simpleName = kb.c.class.getSimpleName();
        c0.j(cVar, "Listener must not be null");
        c0.g(simpleName, "Listener type must not be empty");
        return c(new oa.i(cVar, simpleName), 2418).e(j0.b.f26122d, nd.f17945b);
    }

    public sb.m g(LocationRequest locationRequest, kb.c cVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            c0.j(looper, "invalid null looper");
        }
        String simpleName = kb.c.class.getSimpleName();
        c0.j(cVar, "Listener must not be null");
        oa.k kVar = new oa.k(looper, cVar, simpleName);
        i4 i4Var = new i4();
        i4Var.f13783d = this;
        i4Var.f13781b = true;
        i4Var.f13782c = kVar;
        a1.e eVar = new a1.e(29, i4Var, locationRequest, false);
        la.m mVar = new la.m(5, (byte) 0);
        mVar.f28099d = eVar;
        mVar.f28100e = i4Var;
        mVar.f28101f = kVar;
        mVar.f28098c = 2436;
        oa.i iVar = (oa.i) ((oa.k) mVar.f28101f).f29860c;
        c0.j(iVar, "Key must not be null");
        oa.k kVar2 = (oa.k) mVar.f28101f;
        int i = mVar.f28098c;
        i4 i4Var2 = new i4();
        i4Var2.f13783d = mVar;
        i4Var2.f13782c = kVar2;
        i4Var2.f13781b = true;
        m7.a aVar = new m7.a(mVar, iVar);
        c0.j((oa.i) kVar2.f29860c, "Listener has already been released.");
        oa.e eVar2 = this.f29199l;
        eVar2.getClass();
        sb.g gVar = new sb.g();
        eVar2.b(gVar, i, this);
        oa.u uVar = new oa.u(new a0(new oa.v(i4Var2, aVar), gVar), eVar2.f29844j.get(), this);
        kw0 kw0Var = eVar2.f29849o;
        kw0Var.sendMessage(kw0Var.obtainMessage(8, uVar));
        return gVar.f32858a;
    }
}
