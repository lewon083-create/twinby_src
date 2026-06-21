package fh;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class of implements g2.v, oa.m, h9.a, ii.o, i6.b, p.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ of f18034b = new of();

    public static void a(WebSettings webSettings, boolean z5) {
        v7.f mVar;
        if (!a7.p.f502j.b()) {
            throw a7.p.a();
        }
        int i = 2;
        try {
            mVar = new v7.f(i, (WebSettingsBoundaryInterface) rl.b.c(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) a7.q.f503a.f491c).convertSettings(webSettings)));
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e3;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e3);
            mVar = new a7.m(i, null);
        }
        mVar.q(z5);
    }

    @Override // oa.m
    public void accept(Object obj, Object obj2) {
        ma.d dVar;
        sb.g gVar = (sb.g) obj2;
        gb.h hVar = (gb.h) obj;
        kb.b bVar = new kb.b(Long.MAX_VALUE, 0, false, null);
        ma.d[] dVarArrI = hVar.i();
        ma.d dVar2 = null;
        if (dVarArrI != null) {
            int i = 0;
            while (true) {
                if (i >= dVarArrI.length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrI[i];
                if ("location_updates_with_callback".equals(dVar.f28768b)) {
                    break;
                } else {
                    i++;
                }
            }
            if (dVar != null && dVar.c() >= 1) {
                gb.w wVar = (gb.w) hVar.n();
                gb.j jVar = new gb.j(4, null, new gb.d(1, gVar), null, null);
                Parcel parcelD0 = wVar.D0();
                gb.b.b(parcelD0, bVar);
                gb.b.b(parcelD0, jVar);
                wVar.T0(parcelD0, 90);
                return;
            }
        }
        ma.d[] dVarArrI2 = hVar.i();
        if (dVarArrI2 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= dVarArrI2.length) {
                    break;
                }
                ma.d dVar3 = dVarArrI2[i10];
                if ("get_last_location_with_request".equals(dVar3.f28768b)) {
                    dVar2 = dVar3;
                    break;
                }
                i10++;
            }
            if (dVar2 != null && dVar2.c() >= 1) {
                gb.w wVar2 = (gb.w) hVar.n();
                gb.d dVar4 = new gb.d(1, gVar);
                Parcel parcelD02 = wVar2.D0();
                gb.b.b(parcelD02, bVar);
                parcelD02.writeStrongBinder(dVar4);
                wVar2.T0(parcelD02, 82);
                return;
            }
        }
        gb.w wVar3 = (gb.w) hVar.n();
        Parcel parcelD03 = wVar3.D0();
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                wVar3.f2256c.transact(7, parcelD03, parcelObtain, 0);
                parcelObtain.readException();
                parcelD03.recycle();
                Location location = (Location) gb.b.a(parcelObtain, Location.CREATOR);
                parcelObtain.recycle();
                gVar.b(location);
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } catch (Throwable th2) {
            parcelD03.recycle();
            throw th2;
        }
    }

    @Override // h9.a
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, ii.p pVar) {
        ((hi.g) pVar).success(null);
    }

    @Override // i6.b
    public void f() {
    }

    @Override // p.a
    public Object apply(Object obj) {
        return obj;
    }

    @Override // i6.b
    public void g(int i, Object obj) {
    }

    @Override // g2.v
    public void onScrollLimit(int i, int i10, int i11, boolean z5) {
    }

    @Override // g2.v
    public void onScrollProgress(int i, int i10, int i11, int i12) {
    }
}
