package uc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import d8.h0;
import d8.u;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.Iterator;
import vc.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends vc.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34446c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34448e;

    public e(h0 h0Var, IBinder iBinder) {
        this.f34447d = iBinder;
        this.f34448e = h0Var;
    }

    @Override // vc.e
    public final void a() {
        HashMap map;
        vc.d bVar = null;
        switch (this.f34446c) {
            case 0:
                try {
                    g gVar = (g) this.f34448e;
                    vc.d dVar = gVar.f34453a.f34855m;
                    String str = gVar.f34454b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = h.f34455a;
                    synchronized (h.class) {
                        map = h.f34455a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey(PluginErrorDetails.Platform.UNITY)) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get(PluginErrorDetails.Platform.UNITY)).intValue());
                    }
                    g gVar2 = (g) this.f34448e;
                    sb.g gVar3 = (sb.g) this.f34447d;
                    String str2 = gVar2.f34454b;
                    f fVar = new f(gVar2, gVar3);
                    vc.b bVar2 = (vc.b) dVar;
                    bVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i = vc.a.f34832a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(fVar);
                    try {
                        bVar2.f34833b.transact(2, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e3) {
                    g gVar4 = (g) this.f34448e;
                    u uVar = g.f34452c;
                    Object[] objArr = {gVar4.f34454b};
                    uVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", u.e(uVar.f15702c, "error requesting in-app review for %s", objArr), e3);
                    }
                    ((sb.g) this.f34447d).c(new RuntimeException(e3));
                    return;
                }
            default:
                i iVar = (i) ((h0) this.f34448e).f15632c;
                IBinder iBinder = (IBinder) this.f34447d;
                int i10 = vc.c.f34834c;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    bVar = iInterfaceQueryLocalInterface instanceof vc.d ? (vc.d) iInterfaceQueryLocalInterface : new vc.b(iBinder);
                }
                iVar.f34855m = bVar;
                u uVar2 = iVar.f34845b;
                uVar2.c("linkToDeath", new Object[0]);
                try {
                    ((vc.b) iVar.f34855m).f34833b.linkToDeath(iVar.f34852j, 0);
                    break;
                } catch (RemoteException e7) {
                    Object[] objArr2 = new Object[0];
                    uVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", u.e(uVar2.f15702c, "linkToDeath failed", objArr2), e7);
                    }
                }
                iVar.f34850g = false;
                Iterator it = iVar.f34847d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                iVar.f34847d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, sb.g gVar2, sb.g gVar3) {
        super(gVar2);
        this.f34447d = gVar3;
        this.f34448e = gVar;
    }
}
