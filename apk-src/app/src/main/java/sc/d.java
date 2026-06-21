package sc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import xc.k;
import xc.m;
import xc.n;
import xc.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f32886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f32887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb.g f32888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f32889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f32890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, sb.g gVar, byte[] bArr, Long l10, sb.g gVar2, IntegrityTokenRequest integrityTokenRequest) {
        super(gVar);
        this.f32890g = fVar;
        this.f32886c = bArr;
        this.f32887d = l10;
        this.f32888e = gVar2;
        this.f32889f = integrityTokenRequest;
    }

    @Override // xc.o
    public final void a(Exception exc) {
        if (exc instanceof xc.d) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // xc.o
    public final void b() {
        sb.g gVar = this.f32888e;
        f fVar = this.f32890g;
        try {
            m mVar = fVar.f32897d.f36072n;
            Bundle bundleA = f.a(fVar, this.f32886c, this.f32887d);
            e eVar = new e(fVar, gVar);
            k kVar = (k) mVar;
            kVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            int i = xc.i.f36077a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(eVar);
            try {
                kVar.f36079b.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e3) {
            n nVar = fVar.f32894a;
            Object[] objArr = {this.f32889f};
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", n.b(nVar.f36081a, "requestIntegrityToken(%s)", objArr), e3);
            }
            gVar.c(new a(-100, e3));
        }
    }
}
