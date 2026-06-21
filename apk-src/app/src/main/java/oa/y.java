package oa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends com.google.android.gms.internal.play_billing.w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29904d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29905e;

    public y(ac.h hVar, ma.d[] dVarArr, boolean z5, int i) {
        this.f29905e = hVar;
        this.f14343c = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z5) {
            z10 = true;
        }
        this.f14341a = z10;
        this.f14342b = i;
    }

    @Override // com.google.android.gms.internal.play_billing.w
    public final void b(na.c cVar, sb.g gVar) {
        int i = this.f29904d;
        Object obj = this.f29905e;
        switch (i) {
            case 0:
                ((m) ((ac.h) obj).f753d).accept(cVar, gVar);
                return;
            default:
                jb.a aVar = (jb.a) cVar;
                tb.g gVar2 = (tb.g) obj;
                aVar.getClass();
                jb.b bVar = new jb.b(0, gVar);
                try {
                    jb.i iVar = (jb.i) aVar.n();
                    Bundle bundleX = aVar.x();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = jb.c.f26595a;
                    parcelObtain.writeInt(1);
                    gVar2.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(1);
                    bundleX.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(bVar);
                    try {
                        iVar.f26603b.transact(14, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e3) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e3);
                    Bundle bundle = Bundle.EMPTY;
                    a.a.o(Status.f2631h, Boolean.FALSE, bVar.f26594c);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tb.g gVar) {
        super(1);
        this.f29905e = gVar;
    }
}
